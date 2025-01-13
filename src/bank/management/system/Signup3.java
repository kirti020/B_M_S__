package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton s, c;
    String formno;
    Signup3(String formno){

        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 3");
        l1.setBounds(280,40,400,40);
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setBounds(280,70,400,40);
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        add(l2);

        JLabel l3 = new JLabel("ACCOUNT TYPE :");
        l3.setBounds(100,140,200,30);
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        add(l3);

        r1 = new JRadioButton("SAVING ACCOUNT");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(148, 203, 242));
        r1.setBounds(100,180,200,30);
        add(r1);

        r2 = new JRadioButton("FIXED DEPOSIT ACCOUNT");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(148, 203, 242));
        r2.setBounds(350,180,300,30);
        add(r2);

        r3 = new JRadioButton("CURRENT ACCOUNT");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(148, 203, 242));
        r3.setBounds(100,220,200,30);
        add(r3);

        r4 = new JRadioButton("RECURRING DEPOSIT ACCOUNT");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(148, 203, 242));
        r4.setBounds(350,220,300,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("CARD NUMBER :");
        l4.setBounds(100,300,200,30);
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        add(l4);

        JLabel l5 = new JLabel("(Your 16-Digit Card Number)");
        l5.setBounds(100,330,400,20);
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setBounds(350,300,400,30);
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        add(l6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque book and statements)");
        l7.setBounds(350,330,600,30);
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        add(l7);

        JLabel l8 = new JLabel("PIN :");
        l8.setBounds(100,380,100,30);
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setBounds(350,380,100,30);
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setBounds(100,400,400,30);
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        add(l10);

        JLabel l11 = new JLabel("SERVICES REQUIRED :");
        l11.setBounds(100,460,400,30);
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,14));
        c1.setBackground(new Color(148, 203, 242));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("INTERNET BANKING");
        c2.setFont(new Font("Raleway",Font.BOLD,14));
        c2.setBackground(new Color(148, 203, 242));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("MOBILE BANKING");
        c3.setFont(new Font("Raleway",Font.BOLD,14));
        c3.setBackground(new Color(148, 203, 242));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("EMAIL ALERTS");
        c4.setFont(new Font("Raleway",Font.BOLD,14));
        c4.setBackground(new Color(148, 203, 242));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 = new JCheckBox("CHEQUE BOOK");
        c5.setFont(new Font("Raleway",Font.BOLD,14));
        c5.setBackground(new Color(148, 203, 242));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-STATEMENT");
        c6.setFont(new Font("Raleway",Font.BOLD,14));
        c6.setBackground(new Color(148, 203, 242));
        c6.setBounds(350,600,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declares that the above entered details correct to the best of my knowledge. ",true);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBackground(new Color(148, 203, 242));
        c7.setBounds(100,680,580,20);
        add(c7);

        JLabel l12 = new JLabel("FORM No. :");
        l12.setBounds(650,10,100,30);
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 14));
        l13.setBounds(760,10,60,30);
        add(l13);

        s = new JButton("SUBMIT");
        s.setFont(new Font("Raleway",Font.BOLD, 14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.CYAN);
        s.setBounds(250,720,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("CANCEL");
        c.setFont(new Font("Raleway",Font.BOLD, 14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.CYAN);
        c.setBounds(420,720,100,30);
        c.addActionListener(this);
        add(c);





        getContentPane().setBackground(new Color(124, 144, 247));
        setLayout(null);
        setSize(850,800);
        setLocation(400,20);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
          String atype = null;
          if (r1.isSelected()){
              atype = "SAVING ACCOUNT";
          }else if(r2.isSelected()){
              atype = "FIXED DEPOSIT ACCOUNT";
          }else if (r3.isSelected()){
              atype = "CURRENT ACCOUNT";
          }else if(r4.isSelected()){
              atype  =  "RECURRING DEPOSIT ACCOUNT";
          }

          Random ran = new Random();
          long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
          String cardno = "" + Math.abs(first7);

          long first3 = (ran.nextLong() % 9000L) + 1000L;
          String pin = "" + Math.abs(first3);

          String fac = "";
          if(c1.isSelected()){
              fac += "ATM CARD";
          }else if(c2.isSelected()){
              fac += "INTERNET BANKING";
          }else if(c3.isSelected()){
              fac += "MOBILE BANKING";
          }else if(c4.isSelected()){
              fac += "EMAIL ALERTS";
          }else if(c5.isSelected()){
              fac += "CHEQUE BOOK";
          }else if(c6.isSelected()){
              fac += "E-STATEMENT";
          }

          try{
              if(e.getSource()==s){
                  if(atype.equals("")){
                      JOptionPane.showMessageDialog(null,"Fill all the fields");
                  }else{
                      Co c1 = new Co();
                      String q1 = "insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                      String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                      c1.statement.executeUpdate(q1);
                      c1.statement.executeUpdate(q2);
                      JOptionPane.showMessageDialog(null,"CARD NUMBER :"+cardno+"\n PIN :"+pin );
                      new Deposit(pin);
                      setVisible(false);
                  }
              }else if (e.getSource()==c){
                  System.exit(0);
              }


          }catch(Exception E){
              E.printStackTrace();
          }
    }

    public static void main(String[] args){
        new Signup3(" ");
    }
}
