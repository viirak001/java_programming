package JavaClassAndObject.HomeObject;

import JavaClassAndObject.modelClass.EmployeeClass;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeObject04 {
    public static void main(String[] args) {

        EmployeeClass employees = new EmployeeClass();
        employees.setDataEmployee(1, UUID.randomUUID().toString(), "Virak", "CEO", 300.30);
//        employees.getDataEmployee();
//        System.out.println(employees);

        // Add new Data for Employee :
        EmployeeClass employeess = new EmployeeClass();
        employeess.setDataEmployee(2, UUID.randomUUID().toString(), "Verak", "CEO", 300.0);

        //
        List<EmployeeClass> employee = new ArrayList<>();
        employee.add(employees);
        employee.add(employeess);

        // for each
        for (EmployeeClass em: employee){
            System.out.println(em);
        }
    }
}
