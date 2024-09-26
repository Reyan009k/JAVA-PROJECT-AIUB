//package HOMEPAGE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame implements ActionListener, MouseListener {
    public HomePage(){
        Font f = new Font("Roboto",Font.BOLD,25);
        Font f3 = new Font("Roboto",Font.BOLD,22);
        Font f2 = new Font("Roboto",Font.BOLD,17);

        Color lightblue = new Color(51,204,255);

        this.setSize(1100,900);
        this.setTitle("HomePage");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container c = new Container();
        c = this.getContentPane();
        c.setBackground(Color.BLACK);
        c.setLayout(null);


        JPanel P1 = new JPanel();
        P1.setBounds( 50,50,400,350);
        P1.setBackground(Color.BLACK);
        P1.setLayout(null);
        c.add(P1);

        P1.addMouseListener(new MouseListener() {
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
                P1.setBorder(BorderFactory.createMatteBorder(5,5,5,5,lightblue));
                P1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                P1.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.BLACK));
                P1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }
        });


        JPanel P2 = new JPanel();
        P2.setBounds( 650,50,400,350);
        P2.setBackground(Color.BLACK);
        P2.setLayout(null);
        //P2.setBorder(BorderFactory.createMatteBorder(5,5,5,5,lightblue));
        c.add(P2);
        P2.addMouseListener(new MouseListener() {
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
                P2.setBorder(BorderFactory.createMatteBorder(5,5,5,5,lightblue));
                P2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                P2.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.BLACK));
                P2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }
        });



        JPanel P3 = new JPanel();
        P3.setBounds( 650,450,400,350);
        P3.setBackground(Color.BLACK);
        P3.setLayout(null);
        //z P3.setBorder(BorderFactory.createMatteBorder(5,5,5,5,lightblue));
        c.add(P3);
        P3.addMouseListener(new MouseListener() {
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
                P3.setBorder(BorderFactory.createMatteBorder(5,5,5,5,lightblue));
                P3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                P3.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.BLACK));
                P3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }
        });


        JPanel P4 = new JPanel();
        P4.setBounds( 50,450,400,350);
        P4.setBackground(Color.BLACK);
        P4.setLayout(null);
        // P4.setBorder(BorderFactory.createMatteBorder(5,5,5,5,lightblue));
        c.add(P4);
        P4.addMouseListener(new MouseListener() {
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
                P4.setBorder(BorderFactory.createMatteBorder(5,5,5,5,lightblue));
                P4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                P4.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.BLACK));
                P4.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

            }
        });


        ImageIcon i = new ImageIcon("c1.png");
        JLabel img = new JLabel(i);
        img.setBounds(40,10,300,200);
        P1.add(img);

        JLabel p1label = new JLabel("Marcedes Benz G-Class");
        p1label.setBounds(70,220,290,40);
        p1label.setFont(f);
        p1label.setForeground(Color.WHITE);
        P1.add(p1label);

        JButton DETAILS = new JButton("DETAILS");
        DETAILS.setBounds(140,280,150,40);
        DETAILS.setBackground(lightblue);
        DETAILS.setFont(f);
        DETAILS.setForeground(Color.BLACK);
        DETAILS.setFocusable(false);
        P1.add(DETAILS);
        DETAILS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Payment p = new Payment(4.2);
                // p.setVisible(true);
                car1details c = new car1details();
                c.setVisible(true);
                setVisible(false);
            }
        });



        ImageIcon i2 = new ImageIcon("c3.png");
        JLabel img2 = new JLabel(i2);
        img2.setBounds(50,10,300,200);
        P2.add(img2);

        JLabel p2label = new JLabel("Range Rover Vogue");
        p2label.setBounds(70,220,290,40);
        p2label.setFont(f);
        p2label.setForeground(Color.WHITE);
        P2.add(p2label);

        JButton p2button = new JButton("DETAILS");
        p2button.setBounds(140,280,150,40);
        p2button.setBackground(lightblue);
        p2button.setFont(f);
        p2button.setForeground(Color.BLACK);
        p2button.setFocusable(false);
        P2.add(p2button);
        p2button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Payment p = new Payment(2.3);
                //p.setVisible(true);
                c2details c = new c2details();
                c.setVisible(true);
                setVisible(false);
            }
        });



        ImageIcon i3 = new ImageIcon("c4.png");
        JLabel img3 = new JLabel(i3);
        img3.setBounds(50,10,300,200);
        P3.add(img3);

        JLabel p3label = new JLabel("BMW XM");
        p3label.setBounds(150,220,290,40);
        p3label.setFont(f);
        p3label.setForeground(Color.WHITE);
        P3.add(p3label);

        JButton p3button = new JButton("DETAILS");
        p3button.setBounds(140,280,150,40);
        p3button.setBackground(lightblue);
        p3button.setFont(f);
        p3button.setForeground(Color.BLACK);
        p3button.setFocusable(false);
        P3.add(p3button);
        p3button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c3details p = new c3details();
                p.setVisible(true);
                setVisible(false);
            }
        });

        ImageIcon i4 = new ImageIcon("c5.png");
        JLabel img4 = new JLabel(i4);
        img4.setBounds(10,10,300,200);
        P4.add(img4);

        JLabel p4label = new JLabel("Rolls Royce Wraith Wall");
        p4label.setBounds(70,220,290,40);
        p4label.setFont(f);
        p4label.setForeground(Color.WHITE);
        P4.add(p4label);

        JButton p4button = new JButton("DETAILS");
        p4button.setBounds(140,280,150,40);
        p4button.setBackground(lightblue);
        p4button.setFont(f);
        p4button.setForeground(Color.BLACK);
        p4button.setFocusable(false);
        P4.add(p4button);
        p4button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c4details p = new c4details();
                p.setVisible(true);
                setVisible(false);
            }
        });


    }

    public static void main (String [] args){
        HomePage H = new HomePage();
        H.setVisible(true);

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