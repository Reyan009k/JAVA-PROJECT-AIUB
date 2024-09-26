import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loginframe1 extends JFrame implements ActionListener, MouseListener {
    loginframe1() {

        Font f = new Font("Roboto", Font.BOLD, 25);
        Font f3 = new Font("Roboto", Font.BOLD, 22);
        Font f2 = new Font("Roboto", Font.BOLD, 17);
        Color lightblue = new Color(51, 204, 255);

        this.setSize(800, 600);
        this.setTitle("Login Frame");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = new Container();
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);

        JLabel email = new JLabel();
        email.setText("Email :");
        email.setBounds(430, 130, 120, 40);
        email.setForeground(Color.BLACK);
        email.setFont(f);
        c.add(email);

        JTextField email_tf = new JTextField();
        email_tf.setBounds(535, 141, 180, 30);
        email_tf.setHorizontalAlignment(JTextField.CENTER);
        email_tf.setFont(f2);
        email_tf.setForeground(Color.black);
        email_tf.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.BLACK));
        email_tf.setOpaque(false);
        c.add(email_tf);

        JLabel password = new JLabel();
        password.setText("Password :");
        password.setBounds(380, 180, 160, 40);
        password.setForeground(Color.BLACK);
        password.setFont(f);
        c.add(password);

        JPasswordField p_tf = new JPasswordField();
        p_tf.setBounds(535, 191, 180, 30);
        p_tf.setHorizontalAlignment(JPasswordField.CENTER);
        p_tf.setOpaque(false);
        p_tf.setForeground(Color.BLACK);
        p_tf.setFont(f2);
        p_tf.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, Color.BLACK));
        c.add(p_tf);

        JButton login = new JButton();
        login.setText("Login");
        login.setBackground(lightblue);
        login.setBounds(530, 240, 100, 40);
        login.setFocusable(false);
        login.setFont(f3);
        login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        login.setBorder(BorderFactory.createMatteBorder(0, 5, 0, 5, Color.BLACK));
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

        // actionevent for login button
        login.addActionListener(ae -> {
            if (!email_tf.getText().isEmpty() && !p_tf.getText().isEmpty()) {
                String email1 = email_tf.getText();
                String pass = p_tf.getText();


                if (email1.equals("admin@gmail.com") && pass.equals("admin")) {
                    AdminLogin ad = new AdminLogin();
                    setVisible(false);
                    ad.setVisible(true);
                }
                else {
                    // Regular user account check
                    Account acc = new Account(email1, pass);

                    if (acc.CheckAccount(email1, pass)) {
                        HomePage f1 = new HomePage();
                        f1.setVisible(true);
                        setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Email or Password");
                        email_tf.setText("");
                        p_tf.setText("");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please enter both Email and Password");
            }
        });

        JButton exit = new JButton();
        exit.setText("Exit");
        exit.setBounds(640, 240, 100, 40);
        exit.setFocusable(false);
        exit.setFont(f3);
        exit.setBorder(BorderFactory.createMatteBorder(0, 5, 0, 5, Color.BLACK));
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
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exit.setBackground(lightblue);
                exit.setForeground(Color.BLACK);
            }
        });
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                System.exit(0);
            }
        });

        JButton signup = new JButton();
        signup.setText("Sign Up");
        signup.setBackground(lightblue);
        signup.setBounds(570, 300, 120, 40);
        signup.setFocusable(false);
        signup.setFont(f3);
        signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        signup.setBorder(BorderFactory.createMatteBorder(0, 5, 0, 5, Color.BLACK));
        c.add(signup);
        signup.addActionListener(e -> {
            createnewaccount create = new createnewaccount();
            create.setVisible(true);
        });

        ImageIcon img = new ImageIcon("rsz_1car.png");
        JLabel i = new JLabel(img);
        i.setBounds(0, 0, 800, 600);
        c.add(i);
    }

    public static void main(String[] args) {
        loginframe1 l = new loginframe1();
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
