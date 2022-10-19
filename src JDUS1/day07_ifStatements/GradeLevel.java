package day07_ifStatements;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 17;

        String schoolType = "";

        if (gradeLevel <= 5) {
            schoolType = "Es";
        } else if (gradeLevel <= 8) {
            schoolType = "MS";
        } else if (gradeLevel <= 12) {
            schoolType = "HS";
        } else if (gradeLevel <= 16) {
            schoolType = "College";
        } else {
            schoolType = "Grad School";
        }

        System.out.println(schoolType);
        {

        }

    }
}
