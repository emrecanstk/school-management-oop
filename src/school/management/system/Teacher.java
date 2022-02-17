package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * Creates a new Teacher object.
     * @param id for the teacher: unique.
     * @param name of the teacher.
     * @param salary of the teacher.
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {        // return the id of the teacher.
        return id;
    }

    public String getName() {   // return the name of the teacher.
        return name;
    }

    public int getSalary() {    // return the salary of the teacher.
        return salary;
    }
}
