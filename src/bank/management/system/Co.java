package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Co {

    Connection connection;
    Statement statement;
    public Co(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","K2002@kirti#");
            statement = connection.createStatement();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
