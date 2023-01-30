package PrototypePattern;

public class Student implements Prototype<Student> {



    private String name;
    private int age;
    private String batchName;
    private double batchAvgPsp;
    private String yearOfEnrollment;

    public Student(){

    }

    public Student(Student st){
        Student s = new Student();
        s.yearOfEnrollment = st.yearOfEnrollment;
        s.batchAvgPsp = st.batchAvgPsp;
        s.batchName = st.batchName;
    }

    public Student(String name, int age, String batchName, double batchAvgPsp, String yearOfEnrollment){
        this.name = name;
        this.age = age;
        this.batchName = batchName;
        this.batchAvgPsp = batchAvgPsp;
        this.yearOfEnrollment = yearOfEnrollment;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getBatchAvgPsp() {
        return batchAvgPsp;
    }

    public void setBatchAvgPsp(double batchAvgPsp) {
        this.batchAvgPsp = batchAvgPsp;
    }

    public String getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(String yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }
}
