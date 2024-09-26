//package HOMEPAGE;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class AdminLogin extends JFrame implements ActionListener, MouseListener {
    private final String[] col = {"NAME", "MODEL", "PRICE", "TOP SPEED", "COLOR"};
    private String row[] = new String[5];

    public AdminLogin() {
        Font f = new Font("Roboto", Font.BOLD, 25);
        Font f3 = new Font("Roboto", Font.BOLD, 22);
        Font f2 = new Font("Roboto", Font.BOLD, 17);

        Color lightblue = new Color(51, 204, 255);

        this.setSize(1000, 800);
        this.setTitle("Admin Panel");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = new Container();
        c = this.getContentPane();
        c.setBackground(Color.BLACK);
        c.setLayout(null);

        JLabel carname = new JLabel("Car Name : ");
        carname.setForeground(Color.WHITE);
        carname.setBounds(100, 50, 150, 40);
        carname.setFont(f);
        c.add(carname);

        JTextField cnt = new JTextField();
        cnt.setBounds(250, 50, 220, 40);
        cnt.setOpaque(false);
        cnt.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, lightblue));
        cnt.setFont(f2);
        cnt.setForeground(Color.WHITE);
        c.add(cnt);

        JLabel carColor = new JLabel("Car Color : ");
        carColor.setForeground(Color.WHITE);
        carColor.setBounds(550, 130, 230, 40);
        carColor.setFont(f);
        c.add(carColor);

        JTextField cc = new JTextField();
        cc.setBounds(750, 50, 220, 40);
        cc.setOpaque(false);
        cc.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, lightblue));
        cc.setFont(f2);
        cc.setForeground(Color.WHITE);
        c.add(cc);

        JLabel carTopseed = new JLabel("Car Top Speed : ");
        carTopseed.setForeground(Color.WHITE);
        carTopseed.setBounds(550, 50, 230, 40);
        carTopseed.setFont(f);
        c.add(carTopseed);

        JTextField ct = new JTextField();
        ct.setBounds(700, 130, 220, 40);
        ct.setOpaque(false);
        ct.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, lightblue));
        ct.setFont(f2);
        ct.setForeground(Color.WHITE);
        c.add(ct);

        JLabel carmodel = new JLabel("Car Model : ");
        carmodel.setForeground(Color.WHITE);
        carmodel.setBounds(100, 130, 180, 40);
        carmodel.setFont(f);
        c.add(carmodel);

        JTextField cmt = new JTextField();
        cmt.setBounds(250, 130, 220, 40);
        cmt.setOpaque(false);
        cmt.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, lightblue));
        cmt.setFont(f2);
        cmt.setForeground(Color.WHITE);
        c.add(cmt);

        JLabel carprice = new JLabel("Car Price : ");
        carprice.setForeground(Color.WHITE);
        carprice.setBounds(110, 210, 150, 40);
        carprice.setFont(f);
        c.add(carprice);

        JTextField cpt = new JTextField();
        cpt.setBounds(250, 210, 220, 40);
        cpt.setOpaque(false);
        cpt.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, lightblue));
        cpt.setFont(f2);
        cpt.setForeground(Color.WHITE);
        c.add(cpt);

        JTable t = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        t.setModel(model);
        t.setSelectionBackground(Color.GREEN);
        t.setBackground(Color.WHITE);
        t.setRowHeight(30);
        t.setModel(model);

        JScrollPane sc = new JScrollPane(t);
        sc.setBounds(300, 450, 500, 280);
        c.add(sc);

        JButton submit = new JButton("ADD");
        submit.setBounds(300, 300, 110, 40);
        submit.setFont(f2);
        submit.setFocusable(false);
        submit.setForeground(Color.BLACK);
        submit.setBackground(lightblue);
        c.add(submit);

        JButton update = new JButton("UPDATE");
        update.setBounds(540, 300, 110, 40);
        update.setFont(f2);
        update.setFocusable(false);
        update.setForeground(Color.BLACK);
        update.setBackground(lightblue);
        c.add(update);

        JButton exit = new JButton("EXIT");
        exit.setBounds(670, 300, 110, 40);
        exit.setFont(f2);
        exit.setFocusable(false);
        exit.setForeground(Color.BLACK);
        exit.setBackground(Color.RED);
        c.add(exit);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });

        JButton delete = new JButton("DELETE");
        delete.setBounds(420, 300, 110, 40);
        delete.setFont(f2);
        delete.setFocusable(false);
        delete.setForeground(Color.BLACK);
        delete.setBackground(Color.RED);
        c.add(delete);

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numberOfRow = t.getSelectedRow();
                if (numberOfRow >= 0) {
                    model.removeRow(numberOfRow);
                } else {
                    JOptionPane.showMessageDialog(null, "no row has been selected or no row exists");
                }
            }
        });

        t.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                int numberOfRow = t.getSelectedRow();

                String c_name = model.getValueAt(numberOfRow, 0).toString();
                String c_model = model.getValueAt(numberOfRow, 1).toString();
                String c_price = model.getValueAt(numberOfRow, 2).toString();
                String c_color = model.getValueAt(numberOfRow, 3).toString();
                String c_topspeed = model.getValueAt(numberOfRow, 4).toString();

                cnt.setText(c_name);
                cpt.setText(c_price);
                cmt.setText(c_model);
                cc.setText(c_color);
                ct.setText(c_topspeed);
            }
        });

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = t.getSelectedRow();

                if (selectedRow >= 0) {
                    model.setValueAt(cnt.getText(), selectedRow, 0);
                    model.setValueAt(cmt.getText(), selectedRow, 1);
                    model.setValueAt(cpt.getText(), selectedRow, 2);
                    model.setValueAt(cc.getText(), selectedRow, 3);
                    model.setValueAt(ct.getText(), selectedRow, 4);

                    JOptionPane.showMessageDialog(null, "Update Successful");

                    cnt.setText("");
                    cmt.setText("");
                    cpt.setText("");
                    cc.setText("");
                    ct.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Please select a row to update");
                }
            }
        });

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String carname = cnt.getText();
                String carmodel = cmt.getText();
                String carprice = cpt.getText();
                String carcolor = cc.getText();
                String cartopspeed = ct.getText();

                row[0] = cnt.getText();
                row[1] = cmt.getText();
                row[2] = cpt.getText();
                row[3] = carcolor;
                row[4] = cartopspeed;

                cnt.setText("");
                cmt.setText("");
                cpt.setText("");
                cc.setText("");
                ct.setText("");
                model.addRow(row);
            }
        });

        // Search Section
        JLabel searchLabel = new JLabel("Search Car Name: ");
        searchLabel.setForeground(Color.WHITE);
        searchLabel.setBounds(20, 370, 250, 40);
        searchLabel.setFont(f);
        c.add(searchLabel);

        JTextField searchField = new JTextField();
        searchField.setBounds(250, 370, 220, 40);
        searchField.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, lightblue));
        searchField.setFont(f2);
        searchField.setOpaque(false);
        searchField.setForeground(Color.WHITE);
        c.add(searchField);

        JButton searchButton = new JButton("SEARCH");
        searchButton.setBounds(480, 370, 110, 40);
        searchButton.setFont(f2);
        searchButton.setFocusable(false);
        searchButton.setForeground(Color.BLACK);
        searchButton.setBackground(lightblue);
        c.add(searchButton);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchTerm = searchField.getText().toLowerCase();
                boolean found = false;
                for (int i = 0; i < t.getRowCount(); i++) {
                    String carName = model.getValueAt(i, 0).toString().toLowerCase();
                    if (carName.contains(searchTerm)) {
                        t.setRowSelectionInterval(i, i);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null, "Car not found");
                }
            }
        });
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

    public static void main(String[] args) {
        AdminLogin l = new AdminLogin();
        l.setVisible(true);
    }
}