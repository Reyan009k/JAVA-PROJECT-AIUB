import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class c3details extends JFrame implements ActionListener, MouseListener {
    public c3details() {
        Font f = new Font("Roboto", Font.BOLD, 25);
        Font f3 = new Font("Roboto", Font.BOLD, 22);
        Font f2 = new Font("Roboto", Font.BOLD, 17);

        Color lightblue = new Color(51, 204, 255);

        this.setSize(600, 400);
        this.setTitle("HomePage");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container c = new Container();
        c = this.getContentPane();
        c.setBackground(Color.BLACK);
        c.setLayout(null);

        JLabel c1 = new JLabel("BMW XM");
        c1.setBounds(70,100,290,40);
        c1.setFont(f);
        c1.setForeground(Color.WHITE);
        c.add(c1);


        JLabel c1model = new JLabel("BMW EEFCD");
        c1model.setBounds(70,150,290,40);
        c1model.setFont(f);
        c1model.setForeground(Color.WHITE);
        c.add(c1model);

        JLabel c1speed = new JLabel("120 MP/H");
        c1speed.setBounds(70,200,290,40);
        c1speed.setFont(f);
        c1speed.setForeground(Color.WHITE);
        c.add(c1speed);

        JLabel c1color = new JLabel("COLOR : BROWN");
        c1color.setBounds(70,250,290,40);
        c1color.setFont(f);
        c1color.setForeground(Color.WHITE);
        c.add(c1color);

        JButton buy = new JButton("BUY");
        buy.setBounds(320,280,110,40);
        buy.setBackground(lightblue);
        buy.setFont(f);
        buy.setForeground(Color.BLACK);
        buy.setFocusable(false);
        c.add(buy);
        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Payment p = new Payment(4.3);
                p.setVisible(true);
            }
        });


    }

    public static void main(String[] args) {
        c3details c = new c3details();
        c.setVisible(true);
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