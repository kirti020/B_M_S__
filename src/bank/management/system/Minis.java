package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Minis extends JFrame implements ActionListener {

    String pin;
    JButton button;

    Minis(String pin){
        this.pin = pin;

        getContentPane().setBackground(new Color(184, 126, 242));
        setLayout(null);
        setSize(400,600);
        setLocation(20,20);

        JLabel label1 = new JLabel();
       // label1.setFont(new Font("System",Font.ITALIC,18));
        label1.setBounds(20,140,400,250);
        add(label1);

        JLabel label2 = new JLabel("MINI BANK");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        //label3.setFont(new Font("System",Font.ITALIC,18));
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        //label4.setFont(new Font("System",Font.ITALIC,18));
        label4.setBounds(20,400,300,20);
        add(label4);

        try{
            Co c = new Co();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while(resultSet.next()){
                label3.setText("CARD NUMBER: "+ resultSet.getString("card_number").substring(0,4) + "XXXXXXXX"+ resultSet.getString("card_number").substring(12));

            }

        }catch(Exception e){
            e.printStackTrace();
        }

        try{
            int balance = 0;
            Co c = new Co();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");

            while(resultSet.next()) {
                label1.setText(label1.getText() + "<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");


                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }

            }
            label4.setText("Your Total Balance is Rs " + balance);


        }catch(Exception e){
            e.printStackTrace();
        }
        button = new JButton("EXIT");
        button.setBounds(20,500,100,25);
        button.setBackground(new Color(148, 203, 242));
        button.addActionListener(this);
        add(button);


        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new Minis("");
    }
}
