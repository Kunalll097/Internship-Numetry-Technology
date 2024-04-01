import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import java.util.*;

public class InsertingImageToDatabase {
    public static void main(String args[]) throws Exception {

        Scanner si=new Scanner(System.in);

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        //Connection Established
        String mysqlUrl = "jdbc:mysql://127.0.0.1:3306/image_db";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "Kunal123");
        System.out.println("Connection established......");

//        ------------------------------------------------------------------------------------------------------------
                //----------------------CRUD OPERATION STARTS HERE--------------------
        //Creating the Statement
        Statement stmt = con.createStatement();

        //-----CRUD-->C-->Create statement------------------
        //-----------------CREATE STATEMENT-----------------
//        String createTable = "CREATE TABLE Images( "
//                + "Name VARCHAR(255), "
//                + "Type VARCHAR(50), "
//                + "Logo BLOB)";
//        stmt.execute(createTable);
//        -------------------------------------------------------------------------------------------------------------

//        //Inserting values

         //Inserting values from user
//        System.out.println("Enter Name: ");
//        String Name = si.nextLine();
//        System.out.println("Enter Type: ");
//        String Type = si.nextLine();
//        System.out.println("Enter Logo: ");
//        String Logo = si.nextLine();
//
//        String query = "INSERT INTO Images(Name, Type, Logo) VALUES (?, ?, ?)";
//        PreparedStatement pstmt = con.prepareStatement(query);
//        pstmt.setString(1,Name);
//        pstmt.setString(2,Type);
//        pstmt.setString(3,Logo);
//        pstmt.execute();
//        System.out.println("Data inserted");

//        pstmt.setString(1, "R-Programming");
//        pstmt.setString(2, "Statistical_Computing");
//        FileInputStream fin = new FileInputStream("C:\\Users\\KUNAL\\OneDrive\\Pictures\\R prog.png");
//        pstmt.setBinaryStream(3, fin);
//        pstmt.execute();
//
//        pstmt.setString(1, "Python");
//        pstmt.setString(2, "DS,AI,ML,DL");
//        fin = new FileInputStream("C:\\Users\\KUNAL\\OneDrive\\Pictures\\python.png");
//        pstmt.setBinaryStream(3, fin);
//        pstmt.execute();
//        pstmt.setString(1, "SQL");
//        pstmt.setString(2, "MySQL database");
//        fin = new FileInputStream("C:\\Users\\KUNAL\\OneDrive\\Pictures\\SQL.png");
//        pstmt.setBinaryStream(3, fin);
//        pstmt.execute();
//        System.out.println("Data inserted");
//        -------------------------------------------------------------------------------------------------------------

        //-----CRUD--->R--->Read statement-----------------
        //------------------READ STATEMENT-----------------
//        ResultSet rs = stmt.executeQuery("Select *from Images");
//        while(rs.next()) {
//            System.out.print("Name: "+rs.getString("Name")+", ");
//            System.out.print("Image Type: "+rs.getString("Type")+", ");
//            System.out.print("Logo: "+rs.getBlob("Logo"));
//            System.out.println();
//        }

//        -------------------------------------------------------------------------------------------------------------

//            -----CRUD--->U--->Update statement-----------------
//            ------------------UPDATE STATEMENT-----------------
//        Scanner si=new Scanner(System.in);
//        try {
//
//            System.out.println("Enter Logo: ");
//            String Logo = si.nextLine();
//            System.out.println("Enter Type: ");
//            String Type = si.nextLine();
//            System.out.println("Enter Name: ");
//            String Name = si.nextLine();
//
//            String updateQuery = "UPDATE image_db.images SET Logo = ?,Type=? WHERE Name = ?";
//
//            // Set parameters
////            PreparedStatement ps = con.prepareStatement(updateQuery);
////            ps.setBinaryStream(1, new FileInputStream(""C:\Users\KUNAL\OneDrive\Pictures\MySQL.png""));
////            ps.setString(2, "Databases");
////            ps.setString(3, "SQL");
//
//            PreparedStatement ps = con.prepareStatement(updateQuery);
//            ps.setString(1,Logo);
//            ps.setString(2,Type);
//            ps.setString(3,Name);
//
//            // Execute the update
//            int rowsAffected = ps.executeUpdate();
//
//            // Close the prepared statement
//            ps.close();
//
//            // Close the FileInputStream
////            fin.close();
//
//            System.out.println("Data Updated. Rows affected: " + rowsAffected);
//        } catch (SQLException e) {
//            // Handle SQL exception
//            e.printStackTrace();
//        }
//        catch (FileNotFoundException e) {
//            // Handle file not found exception
//            e.printStackTrace();
//        }
//        catch (IOException e) {
//            // Handle IO exception
//            e.printStackTrace();
//        }

//        -------------------------------------------------------------------------------------------------------------

//            -----CRUD--->D--->Delete statement-----------------
//            ------------------DELETE STATEMENT-----------------
            System.out.println("Enter Name: ");
            String Name = si.nextLine();

           String qur = "DELETE FROM image_db.Images where Name=?";
           PreparedStatement preparedStatement = con.prepareStatement(qur);
           preparedStatement.setString(1, Name);

            int i=preparedStatement.executeUpdate();

            if(i>0)
            {
                System.out.println("Data Deleted");
            }
            else{
                System.out.println("Data is not Deleted");
            }
//            ---------------------------------------------------------------------------------------------------------

    }
}