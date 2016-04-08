/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbLayer;

import java.sql.ResultSet;

/**
 *
 * @author Romesh
 */
public class admin {

    public String UserName = "";
    public String password = "";

    public String logNo = "";
    public String uData = "";
    public String recommecndation = "";

    public ResultSet Login(String UserName, String password) // SQL statement for retrieve  data 
    {
        String SQL;
        SQL = "Select * From login where adminName='" + UserName + "' and adminPass='" + password + "'";

        dbConnection myObj = new dbConnection();
        return myObj.getvalues(SQL);
    }

    public ResultSet logData() // SQL statement for retrieve  data 
    {
        String SQL;
        SQL = "Select * From logs";

        dbConnection myObj = new dbConnection();
        return myObj.getvalues(SQL);
    }
    
        public ResultSet Logs(String LogNo, String Recommecndation) // SQL statement for retrieve  data 
    {
        String SQL;
        SQL = "Select * From login where logno='" + LogNo + "' and recommecndation='" + Recommecndation + "'";

        dbConnection myObj = new dbConnection();
        return myObj.getvalues(SQL);
    }

    public void insertData() throws Exception {
        String SQL;
        SQL = "insert into logs values(" + logNo + "," + uData + "," + recommecndation + ")";

        dbConnection myObj = new dbConnection();
        myObj.insertvalues(SQL);
    }
}
