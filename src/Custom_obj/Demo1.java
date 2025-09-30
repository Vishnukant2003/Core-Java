package Custom_obj;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[]args){
        List<Employee> employeeList = new ArrayList<>();

        Employee employee1=new Employee(id:1,salary:16000);
        Employee employee2=new Employee(id:2,salary:16000);
        Employee employee3=new Employee(id:3,salary:16000);
        Employee employee4=new Employee(id:4,salary:16000);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        employeeList.forEach(System.out::println);

    }
}
