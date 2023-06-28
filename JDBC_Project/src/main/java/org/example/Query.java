package org.example;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query {
    public static boolean insertStudentToDB(Information information){
        boolean f = false;
        try {
            //jdbc connection and query
            Connection connect = ConnectionManagement.createConnection();
            String query = "INSERT INTO marks (roll_number, student_name, subject, total_marks, gain_marks) value(?,?,?,?,?)";
            //prepared statement
            PreparedStatement pstmt = connect.prepareStatement(query);
            //set value
            pstmt.setInt(1,information.getRoll_number());
            pstmt.setString(2,information.getStudent_name());
            pstmt.setString(3, information.getSubject());
            pstmt.setInt(4,information.getTotal_marks());
            pstmt.setInt(5,information.getGain_marks());

            //execute
            pstmt.executeUpdate();
            f=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deleteInformation(int rollNumber,String subject) {
        boolean f = false;
        try {
            //jdbc connection and query
            Connection connect = ConnectionManagement.createConnection();
            String query = "DELETE FROM marks WHERE roll_number = ? AND subject = ?";
            //prepared statement
            PreparedStatement pstmt = connect.prepareStatement(query);
            //set value
            pstmt.setInt(1,rollNumber);
            pstmt.setString(2,subject);
            //execute
            pstmt.executeUpdate();
            f=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return f;
    }

    public static boolean updateToDB(Information information, String subjectToUpdate, int rollNumberToUpdate) {
        boolean f = false;
        try {
            // JDBC connection and query
            Connection connect = ConnectionManagement.createConnection();
            String query = "UPDATE marks SET roll_number = ?, student_name = ?, subject = ?, total_marks = ?, gain_marks = ? WHERE subject = ? AND roll_number = ?";
            PreparedStatement pstmt = connect.prepareStatement(query);
            // Set values
            pstmt.setInt(1, information.getRoll_number());
            pstmt.setString(2, information.getStudent_name());
            pstmt.setString(3, information.getSubject());
            pstmt.setInt(4, information.getTotal_marks());
            pstmt.setInt(5, information.getGain_marks());
            pstmt.setString(6, subjectToUpdate);
            pstmt.setInt(7, rollNumberToUpdate);
            // Execute
            pstmt.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }


    public static void displayInformation() {
        try {
            // JDBC connection and query
            Connection connect = ConnectionManagement.createConnection();
            String query = "select * from marks;";
            Statement stmt = connect.createStatement();
            stmt.executeQuery(query);

            ResultSet set = stmt.executeQuery(query);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
            while (set.next()){
                int roll_number = set.getInt(1);
                String student_name = set.getString(2);
                String subject = set.getString(3);
                int total_marks = set.getInt(4);
                int gain_marks = set.getInt(5);
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("roll_number : " + roll_number);
                System.out.println("student_name : " + student_name);
                System.out.println("subject : " + subject);
                System.out.println("total_marks : " + total_marks);
                System.out.println("gain_marks : " + gain_marks);
                System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
