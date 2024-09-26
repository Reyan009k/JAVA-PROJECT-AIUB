//package payment;

//import HOMEPAGE.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Payment extends JFrame implements ActionListener, MouseListener {
    private double price;
    double initial_balance = 5.2;
    public Payment(double price) {
        this.price = price;
        Container c = new Container();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setTitle("PAYMENT");
        setLayout(null);

        Color lightblue = new Color(51, 204, 255);
        Font font = new Font("Arial", Font.BOLD, 18);
        Font font2 = new Font("Serif", Font.BOLD, 15);

        c = this.getContentPane();
        c.setBackground(Color.WHITE);
        c.setLayout(null);

        JButton back = new JButton();
        back.setText("LOGOUT");
        back.setBackground(lightblue);
        back.setFont(font2);
        back.setBounds(15, 30, 100, 40);
        back.addMouseListener(new MouseListener() {
            public void mouseEntered(MouseEvent m) {
                back.setBackground(Color.BLACK);
                back.setForeground(Color.white);
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
            public void mouseExited(MouseEvent e) {
                back.setBackground(lightblue);
                back.setForeground(Color.BLACK);
            }
        });

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                loginframe1 p = new loginframe1();
                p.setVisible(true);
                setVisible(false);
            }
        });
        c.add(back);

        JPanel lp = new JPanel();
        lp.setBounds(0,0,400,600);
        lp.setBackground(lightblue);
        lp.setLayout(null);
        c.add(lp);

        JLabel n = new JLabel();
        n.setText("*Account Number");
        n.setBounds(500,100,300,40);
        n.setFont(font);
        n.setForeground(Color.RED);
        c.add(n);

        JTextField nt = new JTextField();
        nt.setBounds(500,140,220,40);
        nt.setFont(font);
        nt.setHorizontalAlignment(JTextField.CENTER);
        c.add(nt);

        JLabel np = new JLabel();
        np.setText("*Account Pin");
        np.setBounds(500,180,300,40);
        np.setFont(font);
        np.setForeground(Color.RED);
        c.add(np);
        JPasswordField npt = new JPasswordField();
        npt.setBounds(500,220,220,40);
        npt.setFont(font);
        npt.setHorizontalAlignment(JTextField.CENTER);
        c.add(npt);

        JButton pay = new JButton();
        pay.setText("Pay");
        pay.setBackground(lightblue);
        pay.setForeground(Color.BLACK);
        pay.setFont(font);
        pay.setBounds(510,300,80,40);
        c.add(pay);

        pay.addMouseListener(new MouseListener() {
            public void mouseEntered(MouseEvent a){
                pay.setBackground(Color.BLACK);
                pay.setForeground(Color.white);
            }
            public void mouseExited(MouseEvent a){
                pay.setBackground(lightblue);
                pay.setForeground(Color.BLACK);
            }
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
        });
        JButton Exit = new JButton();
        Exit.setText("Exit");
        Exit.setBackground(lightblue);
        Exit.setForeground(Color.BLACK);
        Exit.setFont(font);
        Exit.setBounds(640,300,80,40);
        c.add(Exit);
        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                HomePage p = new HomePage();
                p.setVisible(true);
                setVisible(false);
            }
        });
        Exit.addMouseListener(new MouseListener() {
            public void mouseEntered(MouseEvent a){
                Exit.setBackground(Color.BLACK);
                Exit.setForeground(Color.white);
            }
            public void mouseExited(MouseEvent a){
                Exit.setBackground(lightblue);
                Exit.setForeground(Color.BLACK);
            }
            @Override
            public void mouseClicked(MouseEvent e) {}
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
        });
        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a){
                System.exit(0);
            }
        });
        ImageIcon v = new ImageIcon("v.jpg");
        JLabel visa = new JLabel(v);
        visa.setBounds(50,130,80,60);
        lp.add(visa);

        ImageIcon a = new ImageIcon("m.jpg");
        JLabel al = new JLabel(a);
        al.setBounds(200,130,80,60);
        lp.add(al);

        JRadioButton vr = new JRadioButton();
        vr.setBounds(70,195,20,20);
        vr.setBackground(lightblue);
        lp.add(vr);
        JRadioButton ar = new JRadioButton();
        ar.setBounds(225,195,20,20);
        ar.setBackground(lightblue);
        lp.add(ar);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(vr);
        bg1.add(ar);

        ImageIcon d = new ImageIcon("brac.png");
        JLabel dbbl = new JLabel(d);
        dbbl.setBounds(30,265,80,60);
        lp.add(dbbl);

        ImageIcon t = new ImageIcon("t.png");
        JLabel tl = new JLabel(t);
        tl.setBounds(150,265,80,60);
        lp.add(tl);

        ImageIcon i = new ImageIcon("dbbl.png");
        JLabel il = new JLabel(i);
        il.setBounds(270,265,80,60);
        lp.add(il);

        JRadioButton dr = new JRadioButton();
        dr.setBounds(60,335,20,20);
        dr.setBackground(lightblue);
        lp.add(dr);
        JRadioButton tr = new JRadioButton();
        tr.setBounds(180,335,20,20);
        tr.setBackground(lightblue);
        lp.add(tr);
        JRadioButton ir = new JRadioButton();
        ir.setBounds(300,335,20,20);
        ir.setBackground(lightblue);
        lp.add(ir);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(dr);
        bg2.add(tr);
        bg2.add(ir);

        pay.addActionListener(new ActionListener() {
            @SuppressWarnings("deprecation")
            public void actionPerformed(ActionEvent a){
                if(nt.getText().isEmpty()==false && npt.getText().isEmpty()==false && (ir.isSelected()||tr.isSelected()||dr.isSelected()) && (ar.isSelected()||vr.isSelected())){
                    if(initial_balance > price){
                        initial_balance = 5.2-price;
                        JOptionPane.showMessageDialog(null,"Payment Confirmed");
                        JOptionPane.showMessageDialog(null,"New Balance "+initial_balance+"Crore");
                        setVisible(false);
                    }
                    else if(initial_balance < price){
                        JOptionPane.showMessageDialog(null,"Insufficiant Balance");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Please Enter The Details Correctly");
                }
            }
        });




    }
    public static void main(String[] a){
        Payment p = new Payment(3);
        p.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void actionPerformed(ActionEvent e){

    }
}