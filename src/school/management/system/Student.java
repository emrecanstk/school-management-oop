package school.management.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing.
     * Fees for every students is 30,000TL;
     * Fees paid initially is 0 TL;
     * @param id for the students: unique.
     * @param name of the students.
     * @param grade of the students.
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid field.
     * Add the fees the fees paid.
     * The school is going to receive the funds.
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
        System.out.println(name +" paid " + feesPaid + " TL.");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }
}
