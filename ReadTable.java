import java.sql.*;

public class ReadTable {

  public static void main(String[] args) {
    // Load the JDBC driver
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      System.out.println("Error loading driver: " + e);
    }

    // Connect to the database
    Connection conn = null;
    try {
      conn = DriverManager.getConnection("jdbc:mysql://localhost/store", "root", "");

      // Create a statement
      Statement stmt = conn.createStatement();

      // Execute a query to select all records from the "products" table
      ResultSet rs = stmt.executeQuery("SELECT * FROM products");

      // Iterate through the result set and display the records
      System.out.println("id   sku   name  price");
      System.out.println();
      while (rs.next()) {
        int id = rs.getInt("id");
        String sku = rs.getString("sku");
        String name = rs.getString("name");
        double price = rs.getDouble("price");
        System.out.println(id + " | " + sku + " | " + name + " | " + price);
      }

      // Close the result set, statement, and connection
      rs.close();
      stmt.close();
      conn.close();
    } catch (SQLException e) {
      System.out.println("Error connecting to the database: " + e);
    }
  }
}
