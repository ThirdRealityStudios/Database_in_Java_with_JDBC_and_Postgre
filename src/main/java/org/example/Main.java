package org.example;

import org.postgresql.util.PSQLException;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String connectionString = "jdbc:postgresql://yourdomain.de/databaseName";
        String user = "yourUsername";
        String password = "yourPassword";

        try
        {
            Connection con = DriverManager.getConnection(connectionString, user, password);

            Statement stmt = con.createStatement();

            Scanner s = new Scanner(System.in);

            String inputSQL = "";

            while(!inputSQL.equals("/exit"))
            {
                System.out.print("Your SQL statement: ");
                inputSQL = s.nextLine();

                ResultSet rs = null;

                try
                {
                    if(inputSQL.startsWith("SELECT"))
                    {
                        rs = stmt.executeQuery(inputSQL);
                    }
                    else
                    {
                        stmt.execute(inputSQL);
                        System.out.println("Executed!");

                        continue;
                    }

                    while(rs.next())
                    {
                        ResultSetMetaData rsmd = rs.getMetaData();

                        int results = rsmd.getColumnCount();

                        for(int i = 0; i < results; i++)
                        {
                            Object value = rs.getObject(i + 1);

                            System.out.printf("%20s", value.toString());

                            // Etwas Abstand zwischen jeder Ausgabe eines Attributs.
                            if(i < (results - 1))
                                System.out.print("    ");
                        }

                        System.out.println();
                    }
                }
                catch(SQLException eSQL)
                {
                    eSQL.printStackTrace();
                    System.out.println("\nDu haben falsche Syntax oder ich nichts wissen was falsche hier\n");
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}