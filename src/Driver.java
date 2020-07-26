import java.sql.*;
import java.util.Date;

public class Driver {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Passw0rd!";
    private static final String DBURL = "jdbc:mysql://localhost:3306/sql_hr?serverTimezone=UTC";

    public static void main(String[] args) throws SQLException {

        ResultSet res = null;
        Connection connection = null;
//        Connection connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
        try {
            connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            System.out.println("Connected");
//            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            // CREATE TABLE
//            statement.executeUpdate("CREATE TABLE Grades (grade_id INT PRIMARY KEY AUTO_INCREMENT, grade DECIMAL(5, 2))");

            // INSERT
//            statement.executeUpdate("INSERT INTO Grades (grade) VALUES (12.34)");
//            statement.executeUpdate("INSERT INTO Grades (grade) VALUES (56.78)");
//            statement.executeUpdate("INSERT INTO Grades (grade) VALUES (90.12)");

            // UPDATE
//            statement.executeUpdate("UPDATE Grades SET grade = 100.00 WHERE grade_id = 1");

            // Using placeholder with prepared statement
//            PreparedStatement prStatement = connection.prepareStatement("INSERT INTO Grades (grade) VALUES (?)");

//            res = statement.executeQuery("SELECT * FROM Grades");
//            res.last();
//            double lastGrade = res.getDouble("grade");
//
//            prStatement.setDouble(1, lastGrade - 10);
//
//            prStatement.execute();
//            res = statement.executeQuery("SELECT * FROM Grades");
//            res.last();
//            System.out.printf("id: %d grade: %.2f\n", res.getInt(1), res.getDouble(2));

            // Exercise prepared
//            PreparedStatement prepare = connection.prepareStatement(
//                    "INSERT INTO Inventories (product_name, vendor, quantity, price, stock_date) "
//                            + "VALUES (?, ?, ?, ?, ?)"
//            );
//
//            // set product data
//            prepare.setString(1, "Black Tea");
//            prepare.setString(2, "Twinings");
//            prepare.setInt(3, 50);
//            prepare.setDouble(4, 5.98);
//            prepare.setString(5, "2020-07-17");
//
//            prepare.executeUpdate();

//            System.out.println("Before update");
//            res = statement.executeQuery("SELECT * FROM Inventories");
//            ResultSetMetaData rsmd = res.getMetaData();
//            int columnsNumber = rsmd.getColumnCount();
//
//            while(res.next()) {
//                for (int i = 1; i <= columnsNumber; i++) {
//                    if (i > 1) System.out.print(" | ");
//                    System.out.print(res.getString(i));
//                }
//                System.out.println("");
//            }
//
//            // Exercise prepared Update
//            System.out.println("");
//            System.out.println("After Update");
//            PreparedStatement updateProductName = connection.prepareStatement("UPDATE Inventories SET ? = ? WHERE product_id = ?");
//            updateProductName.setString(1, "Rose hip tea");
//            updateProductName.setInt(2, 10);
//            updateProductName.executeUpdate();
//
//            res = statement.executeQuery("SELECT * FROM Inventories");
//
//            while(res.next()) {
//                for (int i = 1; i <= columnsNumber; i++) {
//                    if (i > 1) System.out.print(" | ");
//                    System.out.print(res.getString(i));
//                }
//                System.out.println("");
//            }

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            if (connection != null)
                connection.close();
        }
    }
}