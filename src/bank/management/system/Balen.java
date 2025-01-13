package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Balen extends JFrame implements ActionListener {

    String pin;

    JLabel label2;
    JButton b1;

    Balen(String pin){

        this.pin = pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("YOUR CURRENT BALANCE IS Rs.");
        label1.setFont(new Font("System",Font.ITALIC,16));
        label1.setBounds(500,410,400,35);
        l3.add(label1);

        label2 = new JLabel();
        label2.setFont(new Font("System",Font.ITALIC,16));
        label2.setBounds(500,440,400,35);
        l3.add(label2);

        b1 = new JButton("BACK");
        b1.setFont(new Font("Raleway",Font.ITALIC, 14));
        b1.setBackground(new Color(148, 203, 242));
        b1.setForeground(Color.BLACK);
        b1.setBounds(500,520,120,30);
        b1.addActionListener(this);
        l3.add(b1);

        int balance = 0;
        try{
           Co c = new Co();
           ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
           while (resultSet.next()){
               if(resultSet.getString("type").equals("Deposit")){
                   balance += Integer.parseInt(resultSet.getString("amount"));
               }else {
                   balance -= Integer.parseInt(resultSet.getString("amount"));
               }
           }
        }catch(Exception e){
            e.printStackTrace();
        }

        label2.setText(""+balance);





        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin);
    }

    public static void main(String[] args) {
        new Balen("");
    }



}
