package JavaClassAndObject.modelClass;

public class EmployeeClass {
    private Integer id;
    private String uuid;
    private String name;
    private String position;
    private Double salary;

    // set data employee:
    public void setDataEmployee(Integer id, String euuid, String ename, String eposition, Double esalary){
        // we use " Method this. " for object duplicate. or some object in data-type.
        this.id = id;
        this.uuid = euuid;
        this.name = ename;
        this.position = eposition;
        this.salary = esalary;
    }

    // get data employee
    public void getDataEmployee(){
        System.out.println("Employee ID : " + this.id);
        System.out.println("Employee UUID : " + this.uuid);
        System.out.println("Employee Name : ");
        System.out.println("Employee Position : " + this.position);
        System.out.println("Employee Salary : " + this.position);
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
