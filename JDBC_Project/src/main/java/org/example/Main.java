package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to students marks management system");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("press 1 to add information");
            System.out.println("press 2 to delete information");
            System.out.println("press 3 to update information");
            System.out.println("press 4 to display information");
            System.out.println("press 5 to exit system");
            int button = Integer.parseInt(br.readLine());
            if (button==1){
                    //add information
                System.out.println("Enter Roll Number Of Student");
                int roll_number = Integer.parseInt(br.readLine());
                System.out.println("Enter Student Name");
                String student_name = br.readLine();
                System.out.println("Enter Subject Name");
                String subject = br.readLine();
                System.out.println("Enter Number How Much Subject Marks Was.....");
                int total_marks = Integer.parseInt(br.readLine());
                System.out.println("Enter How Much Marks Obtain By Students");
                int gain_marks = Integer.parseInt(br.readLine());

                //create information for store dtails
                Information information = new Information(roll_number,student_name,subject,total_marks,gain_marks);
                boolean f = Query.insertStudentToDB(information);
                if (f){
                    System.out.println("Enter Data Successfully............");
                }else {
                    System.out.println("Something Went Wrong................");
                }
            } else if (button==2) {
                //delete information
                System.out.println("Enter Roll Number TO Delete Student Information");
                int roll_number = Integer.parseInt(br.readLine());
                System.out.println("Enter Subject Which You Want To Delete");
                String subject = br.readLine();
                boolean f = Query.deleteInformation(roll_number,subject);
                if (f){
                    System.out.println("Information Detelted...............");
                }else {
                    System.out.println("Something Went Wrong................");
                }
            } else if (button==3) {
                //update information;
            } else if (button==4) {
                //display information
            } else if(button==5) {
                //exit
                break;
            }else {

            }
        }
        System.out.println("exit...........");
        System.out.println("thanks for using marks management system");
    }
}
