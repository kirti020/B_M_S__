package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_Class(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("Please select your Transaction");
        label.setBounds(520,410,400,35);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("System",Font.ITALIC,22));
        l3.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setFont(new Font("Raleway",Font.ITALIC, 14));
        b1.setBackground(new Color(148, 203, 242));
        b1.setForeground(Color.BLACK);
        b1.setBounds(477,460,180,20);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("CASH WITHDRAW");
        b2.setFont(new Font("Raleway",Font.ITALIC, 14));
        b2.setBackground(new Color(148, 203, 242));
        b2.setForeground(Color.BLACK);
        b2.setBounds(700,460,180,20);
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setFont(new Font("Raleway",Font.ITALIC, 14));
        b3.setBackground(new Color(148, 203, 242));
        b3.setForeground(Color.BLACK);
        b3.setBounds(477,490,180,20);
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setFont(new Font("Raleway",Font.ITALIC, 14));
        b4.setBackground(new Color(148, 203, 242));
        b4.setForeground(Color.BLACK);
        b4.setBounds(700,490,180,20);
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setFont(new Font("Raleway",Font.ITALIC, 14));
        b5.setBackground(new Color(148, 203, 242));
        b5.setForeground(Color.BLACK);
        b5.setBounds(477,520,180,20);
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setFont(new Font("Raleway",Font.ITALIC, 14));
        b6.setBackground(new Color(148, 203, 242));
        b6.setForeground(Color.BLACK);
        b6.setBounds(700,520,180,20);
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("EXIT");
        b7.setFont(new Font("Raleway",Font.ITALIC, 14));
        b7.setBackground(new Color(148, 203, 242));
        b7.setForeground(Color.BLACK);
        b7.setBounds(580,550,180,20);
        b7.addActionListener(this);
        l3.add(b7);


        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            new Deposit(pin);
            setVisible(false);
        }else if(e.getSource() == b7){
            System.exit(0);
        }else if (e.getSource() == b2){
            new Wit(pin);
            setVisible(false);
        }else if (e.getSource() == b6){
            new Balen(pin);
            setVisible(false);
        }else if(e.getSource() == b3){
            new Fastc(pin);
            setVisible(false);
        }else if(e.getSource() == b5){
            new Pinc(pin);
            setVisible(false);
        }else if(e.getSource() == b4) {
            new Minis(pin);

        }
    }

    public static void main(String[] args){
        new main_Class("");
    }
}
