package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args)
    {
        String connectionString = "jdbc:postgresql://yourdatabase.com/yourTable";
        String user = "yourUsername";
        String password = "yourPassword";


        try
        {
            Connection con = DriverManager.getConnection(connectionString, user, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM personen");

            // while (rs.next())
            {
                System.out.printf("%d %s %s (%s)%n",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}