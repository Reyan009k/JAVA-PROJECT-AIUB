import java.io.*;
import java.util.Scanner;

public class Account {
    private String email;
    private String pass;

    Account(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPass() {
        return this.pass;
    }

    // Method to save user data to file
    public void userdata() {
        try {
            File file = new File("data.txt");
            FileWriter fw = new FileWriter(file, true);
            fw.write(getEmail() + "\t" + getPass() + "\n"); // Save in a tab-separated format
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to check if the account exists in the data file
    public boolean CheckAccount(String name, String password) {
        boolean flag = false;
        File file = new File("data.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if (value.length >= 2 && value[0].equals(name) && value[1].equals(password)) {
                    flag = true;
                    break; // Found the account, exit the loop
                }
            }
            sc.close(); // Close the scanner
        } catch (IOException io) {
            io.printStackTrace();
        }
        return flag;
    }
}
