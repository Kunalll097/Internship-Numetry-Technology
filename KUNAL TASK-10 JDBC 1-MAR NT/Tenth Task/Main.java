//------------------------------- DELETE QUERY WITH JDBC ---------------------------------

import java.util.*;
import java.sql.*;

public class Main {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner si=new Scanner(System.in);

        try
        {

            System.out.println("Enter Student id : ");
            String userid = si.nextLine();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/stud_db","root","Kunal123");
            @SuppressWarnings("unused")
            Statement stment = conn.createStatement();
            String qur = "DELETE FROM stud_db.users where userid=?";

            PreparedStatement preparedStatement = conn.prepareStatement(qur);
            preparedStatement.setString(1, userid);

            int i=preparedStatement.executeUpdate();

            if(i>0)
            {
                System.out.println("Data Deleted");
            }
            else{
                System.out.println("Data is not Deleted");
            }

        }
        catch(Exception err)
        {
            System.out.println(err);
        }


    }

}