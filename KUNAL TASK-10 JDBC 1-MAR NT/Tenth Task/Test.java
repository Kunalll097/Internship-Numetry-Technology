//---------------------------------------UPDATE QUERY WITH JDBC------------------------------------

import java.util.*;
import java.sql.*;

public class Test {

    @SuppressWarnings({ "resource", "unused" })
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner si=new Scanner(System.in);

        try
        {

            System.out.println("Enter First-Name: ");
            String firstname = si.nextLine();
            System.out.println("Enter Last-Name: ");
            String lastname = si.nextLine();
            System.out.println("Enter Email: ");
            String email = si.nextLine();
            System.out.println("Enter User id: ");
            String userid = si.nextLine();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/stud_db","root","Kunal123");
            Statement statement=conn.createStatement();
            String qur = "Update stud_db.users SET firstname =?, lastname=?, email=? WHERE userid=?";

            PreparedStatement preparedStatement=conn.prepareStatement(qur);
            preparedStatement.setString(1,firstname);
            preparedStatement.setString(2,lastname);
            preparedStatement.setString(3,email);
            preparedStatement.setString(4, userid);


            int i=preparedStatement.executeUpdate();

            if(i>0)
            {
                System.out.println("Data Updated");
            }
            else {
                System.out.println("Data is Not Updated");
            }
        }
        catch(Exception err)
        {
            System.out.println(err);
        }


    }

}