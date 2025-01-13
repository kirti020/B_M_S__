package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox combobox, combobox2, combobox3, combobox4, combobox5;

    JTextField textAadhar, textPan;
    JRadioButton r1, r2, e1, e2;
    JButton next;

    String formno;

    Signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank3.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setBounds(300,30,600,40);
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setBounds(300,60,600,40);
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        add(l2);

        JLabel l3 = new JLabel("RELIGION :");
        l3.setBounds(100,120,100,30);
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        add(l3);

        String religion[] = {"Hinduism","Muslim","Sikhism","christian","Other"};
        combobox = new JComboBox(religion);
        combobox.setBounds(350,120,320,30);
        combobox.setFont(new Font("Raleway",Font.BOLD,14));
        combobox.setBackground(new Color(148, 203, 242));
        add(combobox);

        JLabel l4 = new JLabel("CATEGORY :");
        l4.setBounds(100,170,150,30);
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        add(l4);

        String category[] = {"General","OBC","SC","ST","Other"};
        combobox2 = new JComboBox(category);
        combobox2.setBounds(350,170,320,30);
        combobox2.setFont(new Font("Raleway",Font.BOLD,14));
        combobox2.setBackground(new Color(148, 203, 242));
        add(combobox2);

        JLabel l5 = new JLabel("INCOME :");
        l5.setBounds(100,220,150,30);
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        add(l5);

        String income[] = {"Null","<1,50,000","<2,50,000","5,00,000","Upto 10,00,000","Above 10,00,000"};
        combobox3 = new JComboBox(income);
        combobox3.setBounds(350,220,320,30);
        combobox3.setFont(new Font("Raleway",Font.BOLD,14));
        combobox3.setBackground(new Color(148, 203, 242));
        add(combobox3);

        JLabel l6 = new JLabel("EDUCATIONAL :");
        l6.setBounds(100,270,170,30);
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        add(l6);

        String educational[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        combobox4 = new JComboBox(educational);
        combobox4.setBounds(350,270,320,30);
        combobox4.setFont(new Font("Raleway",Font.BOLD,14));
        combobox4.setBackground(new Color(148, 203, 242));
        add(combobox4);

        JLabel l7 = new JLabel("OCCUPATION :");
        l7.setBounds(100,320,170,30);
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        add(l7);

        String occupation[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        combobox5 = new JComboBox(occupation);
        combobox5.setBounds(350,320,320,30);
        combobox5.setFont(new Font("Raleway",Font.BOLD,14));
        combobox5.setBackground(new Color(148, 203, 242));
        add(combobox5);

        JLabel l8 = new JLabel("AADHAR NUMBER :");
        l8.setBounds(100,370,200,30);
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        add(l8);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,14));
        textAadhar.setBounds(350,370,320,30);
        textAadhar.setBackground(new Color(148, 203, 242));
        add(textAadhar);


        JLabel l9 = new JLabel("PAN NUMBER :");
        l9.setBounds(100,420,170,30);
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        add(l9);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,14));
        textPan.setBounds(350,420,320,30);
        textPan.setBackground(new Color(148, 203, 242));
        add(textPan);

        JLabel l10 = new JLabel("SENIOR CITIZEN :");
        l10.setBounds(100,470,200,30);
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        add(l10);

        r1 = new JRadioButton("YES");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(148, 203, 242));
        r1.setBounds(350,470,70,30);
        add(r1);

        r2 = new JRadioButton("NO");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(148, 203, 242));
        r2.setBounds(500,470,70,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("EXISTING ACCOUNT :");
        l11.setBounds(100,520,200,30);
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        add(l11);

        e1 = new JRadioButton("YES");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(148, 203, 242));
        e1.setBounds(350,520,70,30);
        add(e1);

        e2 = new JRadioButton("NO");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(148, 203, 242));
        e2.setBounds(500,520,70,30);
        add(e2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(e1);
        buttonGroup1.add(e2);

        JLabel l12 = new JLabel("FORM No. :");
        l12.setBounds(650,10,100,30);
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setBounds(760,10,60,30);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        add(l13);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway", Font.BOLD,18));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.CYAN);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);




        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(108, 182, 235));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) combobox.getSelectedItem();
        String cate = (String) combobox2.getSelectedItem();
        String inc = (String) combobox3.getSelectedItem();
        String edu = (String) combobox4.getSelectedItem();
        String occ = (String) combobox5.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String scitizen = " ";
        if ((r1.isSelected())){
            scitizen = "Yes";
        }else if (r2.isSelected()){
            scitizen = "No";
        }

        String eaccount = " ";
        if ((e1.isSelected())){
            eaccount = "Yes";
        }else if (e2.isSelected()){
            eaccount = "No";
        }
         try{
             if(textPan.getText().equals("") || textAadhar.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Fill all the fields");
             }else {
                 Co c1 = new Co();
                 String q = "insert into Signuptwo values('"+formno+"', '"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"', '"+pan+"', '"+aadhar+"','"+scitizen+"', '"+eaccount+"')";
                 c1.statement.executeUpdate(q);
                 new Signup3(formno);
                 setVisible(false);
             }

         }catch(Exception E){
             E.printStackTrace();
         }

    }

    public static void main(String[] args){
        new Signup2("");
    }
}
