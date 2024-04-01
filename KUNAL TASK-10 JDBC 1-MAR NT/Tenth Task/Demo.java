//-------------------------------------- SHOW AND READ QUERY WITH JDBC -------------------------------

import java.sql.*;

public class Demo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/stud_db";
        String username = "root";
        String password = "Kunal123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/stud_db","root","Kunal123");
            Statement statement=conn.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM stud_db.users");


            while (resultSet.next()) {
                int userid = resultSet.getInt("userid");
                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");
                String email = resultSet.getString("email");
                System.out.println("User-id: " + userid + ", First-Name: " + firstname + "  ," + "Last-Name: " + lastname + "  ," + "Email: " +email);
            }

            resultSet.close();
            statement.close();
            conn.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
