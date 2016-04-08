package dbLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Romesh
 */
public class dbConnection {

    public static Connection get() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jrs", "root", "12345");
        return con;

    }

    public void insertvalues(String SQL) throws Exception {
        Connection conn = get();
        Statement st = conn.createStatement();
        st.executeUpdate(SQL);
        conn.close();
    }

    public ResultSet getvalues(String SQL) {
        try {
            Connection conn = get();
            Statement st = conn.createStatement();
            ResultSet r = st.executeQuery(SQL);
            return r;
        } catch (Exception e) {
            return null;
        }

    }

}
