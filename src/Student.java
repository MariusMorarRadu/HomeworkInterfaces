public class Student {
    private String name;
    private int grade;

    private static int numberOfStudents;
    private static double sumOfGrades;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        numberOfStudents++;
        sumOfGrades += grade;
    }


    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }


    public static double getAverageGrade() {
        return sumOfGrades / numberOfStudents;
    }

}
