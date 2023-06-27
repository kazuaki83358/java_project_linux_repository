package org.example;

public class Information {  private int roll_number;
    private String student_name;
    private String subject;
    private int total_marks;
    private int gain_marks;
    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(int total_marks) {
        this.total_marks = total_marks;
    }

    public int getGain_marks() {
        return gain_marks;
    }

    public void setGain_marks(int gain_marks) {
        this.gain_marks = gain_marks;
    }

    public Information(int roll_number, String student_name, String subject, int total_marks, int gain_marks) {
        this.roll_number = roll_number;
        this.student_name = student_name;
        this.subject = subject;
        this.total_marks = total_marks;
        this.gain_marks = gain_marks;
    }

    public Information() {
        super();
    }

    @Override
    public String toString() {
        return "Information{" +
                "roll_number=" + roll_number +
                ", student_name='" + student_name + '\'' +
                ", subject='" + subject + '\'' +
                ", total_marks=" + total_marks +
                ", gain_marks=" + gain_marks +
                '}';
    }
}
