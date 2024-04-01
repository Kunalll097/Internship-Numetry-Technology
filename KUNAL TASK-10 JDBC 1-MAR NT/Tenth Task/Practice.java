//---------------------------- CREATE AND INSERT QUERY WITH JDBC --------------------------------

import java.util.*;
import java.sql.*;

public class Practice{

   public static void main(String[] args){

       @SuppressWarnings("resource")
    Scanner si= new Scanner(System.in);

       try{

           System.out.println("Enter user id: ");
           String userid = si.nextLine();
           System.out.println("Enter First Name: ");
           String firstname = si.nextLine();
           System.out.println("Enter Last Name: ");
           String lastname = si.nextLine();
           System.out.println("Enter Email: ");
           String email = si.nextLine();

           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/stud_db","root","Kunal123");
           @SuppressWarnings("unused")
        Statement statement=conn.createStatement();
           String qur="INSERT INTO stud_db.users (userid,firstname,lastname,email)VALUES(?,?,?,?)";

           PreparedStatement preparedStatement=conn.prepareStatement(qur);
           preparedStatement.setString(1, userid);
           preparedStatement.setString(2,firstname);
           preparedStatement.setString(3,lastname);
           preparedStatement.setString(4,email);

           int i=preparedStatement.executeUpdate();

           if(i>0){
               System.out.println("Data Inserted");
           }
           else{
               System.out.println("Data is not Inserted");
           }
       }
       catch(Exception e){
           System.out.println(e);
       }
   }
}