package mjeks.athenkosi;

public class Employee extends Person {
    private int empNum;
    private String jobTitle;

    public Employee() {
    }

    public Employee(String name, String gender, int age, int empNum, String jobTitle) {
        super(name, gender, age);
        this.empNum = empNum;
        this.jobTitle = jobTitle;
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "mjeks.athenkosi.Employee{" +
                "empNum=" + empNum +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
