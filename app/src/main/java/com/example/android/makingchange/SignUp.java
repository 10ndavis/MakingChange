package com.example.android.makingchange;

import java.sql.Connection;
import java.sql.Statement;

public class SignUp {

    static final String DB_URL = "jdbc:mysql://104.197.99.130:1433/makingchagedb";

    public static void signup(String LoginUser, String LoginPass) {

        Connection conn = null;
        Statement stmt = null;


/*        try{

            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }

        try{
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            System.out.println("The URL is: " + DB_URL+USER+PASS);
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            //TESTING HASH PASSWORD
            String HASHPASS = Security.hashPassword(PASS);

            String sql = "SELECT Email,Password FROM UserAccounts Where Email="+LoginUser+" AND Password="+LoginPass;
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                String firstname  = rs.getString("FirstName");
                String lastname = rs.getString("LastName");
                String password = rs.getString("Password");
                String email = rs.getString("Email");

                //Display values
                System.out.print("First Name: " + firstname);
                System.out.print(", Last Name: " + lastname);
                System.out.print(", Password: " + password);
                System.out.println(", Email: " + email);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main*/
    }
}//end FirstExample


