package AltInheritance;

public class Employee {
    private String name;
    private String gender;
    private int age;
    private int empNum;
    private String jobTitle;


    public Employee() {
    }

    public Employee(String name, String gender, int age, int empNum, String jobTitle) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.empNum = empNum;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getEmpNum() {
        return empNum;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", empNum=" + empNum +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }


}
