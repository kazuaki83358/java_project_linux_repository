package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
