package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;

    JButton b1, b2;

    Deposit(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setFont(new Font("System",Font.ITALIC,16));
        label1.setBounds(500,420,400,35);
        l3.add(label1);

        textField = new TextField();
        textField.setBounds(500,470,320,25);
        textField.setFont(new Font("Raleway", Font.ITALIC, 22));
        textField.setBackground(new Color(148, 203, 242));
        l3.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("Raleway",Font.ITALIC, 14));
        b1.setBackground(new Color(148, 203, 242));
        b1.setForeground(Color.BLACK);
        b1.setBounds(500,520,120,30);
        b1.addActionListener(this);
        l3.add(b1);


        b2 = new JButton("BACK");
        b2.setFont(new Font("Raleway",Font.ITALIC, 14));
        b2.setBackground(new Color(148, 203, 242));
        b2.setForeground(Color.BLACK);
        b2.setBounds(700,520,120,30);
        b2.addActionListener(this);
        l3.add(b2);


        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if(e.getSource() == b1){
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                }else {
                    Co c = new Co();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+"Deposited Successfully");
                    setVisible(false);
                    new main_Class(pin);
                }
            }else if(e.getSource() == b2){
                setVisible(false);
                new main_Class(pin);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit(" ");
    }
}
