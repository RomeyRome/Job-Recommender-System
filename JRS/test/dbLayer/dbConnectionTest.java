/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Romesh
 */
public class dbConnectionTest {
    
    public dbConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of get method, of class dbConnection.
     */
    admin login=new admin();
    @Test
    public void testLogin() throws SQLException{
        System.out.println("Testing Login..");
        String username="admin001";
        String password="12345";
        String expResult="admin001";
        String result="";
        ResultSet rs=login.Login(username, password);
        while(rs.next()){
            result=rs.getString("adminName");
        }
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }
    
    @Test
    public void testLogs() throws SQLException{
        System.out.println("Testing User Logs..");
        String logNo="Log001";
        String recommecndation="Software Engineer";
        String expResult="Software Engineer";
        String result="";
        ResultSet rs=login.Logs(logNo, recommecndation);
        while(rs.next()){
            result=rs.getString("recommecndation");
        }
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }
    
}
