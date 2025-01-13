package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1, r2, m1, m2, m3;
    JButton next;

    JTextField textName, textFname, textEmail, textAdd, textCity, textPincode, textState;

    JDateChooser dateChooser;

    Random ran = new Random();

    long first4 =(ran.nextLong() % 9000l) +1000L;

    String first = " " + Math.abs(first4);

    Signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(330,70,600,30);
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290,90,600,30);
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        add(label3);

        JLabel labelName = new JLabel("NAME :");
        labelName.setBounds(100,150,100,30);
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,150,400,30);
        add(textName);

        JLabel labelFname = new JLabel("FATHER'S NAME :");
        labelFname.setBounds(100,200,200,30);
        labelFname.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelFname);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,200,400,30);
        add(textFname);

        JLabel labelDOB = new JLabel("DATE OF BIRTH :");
        labelDOB.setBounds(100,250,200,30);
        labelDOB.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelDOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(150,150,150));
        dateChooser.setBounds(300,250,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("GENDER :");
        labelG.setBounds(100,300,200,30);
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelG);

        r1 = new JRadioButton("MALE");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(148, 203, 242));
        r1.setBounds(300,300,70,30);
        add(r1);

        r2 = new JRadioButton("FEMALE");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(148, 203, 242));
        r2.setBounds(450,300,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("EMAIL ADDRESS :");
        labelEmail.setBounds(100,350,200,30);
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,350,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("MARITAL STATUS :");
        labelMs.setBounds(100,400,200,30);
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelMs);

        m1 = new JRadioButton("MARRIED");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(148, 203, 242));
        m1.setBounds(300,400,100,30);
        add(m1);

        m2 = new JRadioButton("UNMARRIED");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(148, 203, 242));
        m2.setBounds(450,400,120,30);
        add(m2);

        m3 = new JRadioButton("OTHER");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(148, 203, 242));
        m3.setBounds(620,400,80,30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        JLabel labelAdd = new JLabel("ADDRESS :");
        labelAdd.setBounds(100,450,200,30);
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,450,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("CITY :");
        labelCity.setBounds(100,500,200,30);
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,500,400,30);
        add(textCity);


        JLabel labelPin = new JLabel("PINCODE :");
        labelPin.setBounds(100,550,200,30);
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelPin);

        textPincode = new JTextField();
        textPincode.setFont(new Font("Raleway",Font.BOLD,14));
        textPincode.setBounds(300,550,400,30);
        add(textPincode);

        JLabel labelState = new JLabel("STATE :");
        labelState.setBounds(100,600,200,30);
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,600,400,30);
        add(textState);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway", Font.BOLD,18));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.CYAN);
        next.setBounds(600,690,100,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(new Color(118, 224, 245));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "MALE";
        }else if(r2.isSelected()){
            gender = "FEMALE";
        }
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected()){
            marital = "MARRIED";
        }else if(m2.isSelected()){
            marital = "UNMARRIED";
        } else if (m3.isSelected()) {
            marital = "OTHER";
        }
        String add = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPincode.getText();
        String state = textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the details");
            }else {
                Co co1 = new Co();
                String q = "insert into signup values('"+formno+"','"+name+"', '"+fname+"', '"+dob+"', '"+gender+"','"+email+"','"+marital+"','"+add+"', '"+city+"', '"+pincode+"', '"+state+"')";
                co1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args){
        new Signup();
    }

}
