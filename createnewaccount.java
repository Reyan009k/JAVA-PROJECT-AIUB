//package LOGIN;

//import HOMEPAGE.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class createnewaccount extends JFrame implements ActionListener,MouseListener{
    createnewaccount(){

        Font f = new Font("Roboto",Font.BOLD,25);
        Font f3 = new Font("Roboto",Font.BOLD,22);
        Font f2 = new Font("Roboto",Font.BOLD,17);
        Color lightblue = new Color(51,204,255);



        this.setSize(800,610);
        this.setTitle("Login Frame");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container c = new Container();
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        JLabel name = new JLabel();
        name.setText("Name :");
        name.setBounds(230,20,120,40);
        name.setForeground(Color.BLACK);
        name.setFont(f);
        c.add(name);

        JTextField name_tf = new JTextField();
        name_tf.setBounds(320,20,180,30);
        name_tf.setHorizontalAlignment(JTextField.CENTER);
        name_tf.setFont(f2);
        name_tf.setForeground(Color.black);
        name_tf.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        name_tf.setOpaque(false);
        c.add(name_tf);

        JLabel email = new JLabel();
        email.setText("Email :");
        email.setBounds(230,80,120,40);
        email.setForeground(Color.BLACK);
        email.setFont(f);
        c.add(email);

        JTextField email_tf = new JTextField();
        email_tf.setBounds(320,80,180,30);
        email_tf.setHorizontalAlignment(JTextField.CENTER);
        email_tf.setFont(f2);
        email_tf.setForeground(Color.black);
        email_tf.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        email_tf.setOpaque(false);
        c.add(email_tf);

        JLabel password = new JLabel();
        password.setText("Contact :");
        password.setBounds(200,140,160,40);
        password.setForeground(Color.BLACK);
        password.setFont(f);
        c.add(password);

        JTextField p_tf = new JTextField();
        p_tf.setBounds(320,140,180,30);
        p_tf.setHorizontalAlignment(JPasswordField.CENTER);
        p_tf.setOpaque(false);
        p_tf.setForeground(Color.BLACK);
        p_tf.setFont(f2);
        p_tf.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        c.add(p_tf);

        JLabel contact = new JLabel();
        contact.setText("Password :");
        contact.setBounds(180,200,160,40);
        contact.setForeground(Color.BLACK);
        contact.setFont(f);
        c.add(contact);

        JPasswordField c_tf = new JPasswordField();
        c_tf.setBounds(320,200,180,30);
        c_tf.setHorizontalAlignment(JPasswordField.CENTER);
        c_tf.setOpaque(false);
        c_tf.setForeground(Color.BLACK);
        c_tf.setFont(f2);
        c_tf.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        c.add(c_tf);

        JLabel confirm_pass = new JLabel();
        confirm_pass.setText("Confirm Password :");
        confirm_pass.setBounds(80,260,270,40);
        confirm_pass.setForeground(Color.BLACK);
        confirm_pass.setFont(f);
        c.add(confirm_pass);

        JPasswordField cp_tf = new JPasswordField();
        cp_tf.setBounds(320,260,180,30);
        cp_tf.setHorizontalAlignment(JPasswordField.CENTER);
        cp_tf.setOpaque(false);
        cp_tf.setForeground(Color.BLACK);
        cp_tf.setFont(f2);
        cp_tf.setBorder(BorderFactory.createMatteBorder(0,0,5,0,Color.BLACK));
        c.add(cp_tf);



        JButton login = new JButton();
        login.setText("Sign Up");
        login.setBackground(lightblue);
        login.setBounds(480,450,150,40);
        login.setFocusable(false);
        login.setFont(f3);
        login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        login.setBorder(BorderFactory.createMatteBorder(0,5,0,5,Color.BLACK));
        c.add(login);
        login.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                login.setBackground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                login.setBackground(lightblue);
            }
        });
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                if(!email_tf.getText().isEmpty() && !cp_tf.getText().isEmpty() && !name_tf.getText().isEmpty() && c_tf.getText().equals(cp_tf.getText()) && !p_tf.getText().isEmpty()) {
                    String email = email_tf.getText();
                    String pass = c_tf.getText();

                    Account account2 = new Account(email, pass);

                    if (account2.CheckAccount(email, pass)) {
                        JOptionPane.showMessageDialog(null, "Account Already Exists");
                    }
                    if(!account2.CheckAccount(email,pass)){
                        JOptionPane.showMessageDialog(null,"New Account Has Been Created");
                        account2.userdata();
                        loginframe1 in = new loginframe1();
                        in.setVisible(true);
                        setVisible(false);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Please enter all the details correctly");
                    }

                   /* loginframe1 f = new loginframe1();
                    f.setVisible(true);
                    setVisible(false);*/
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Email or Password");
                }

            }//actionevent
        });

        JButton exit = new JButton();
        exit.setText("Exit");
        exit.setBounds(640,450,100,40);
        exit.setFocusable(false);
        exit.setFont(f3);
        exit.setBorder(BorderFactory.createMatteBorder(0,5,0,5,Color.BLACK));
        exit.setBackground(lightblue);
        c.add(exit);
        exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                exit.setBackground(Color.RED);
                //  exit.setForeground(Color.BLACK);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exit.setBackground(lightblue);
                exit.setForeground(Color.BLACK);
            }
        });
        exit.addActionListener(new ActionListener(){
            // @Override
            public void actionPerformed(ActionEvent a) {
                System.exit(0);
            }
        });

        ImageIcon img = new ImageIcon("cr.png");
        JLabel i = new JLabel(img);
        i.setBounds(0,0,800,600);
        c.add(i);
    }

    public static void main(String[] args) {
        createnewaccount l = new createnewaccount();
        l.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
