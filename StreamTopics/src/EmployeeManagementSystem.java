import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        List<Employee> emplist = new ArrayList<>();
        emplist.add(new Employee(101, "Pawan",50000, 30));
        emplist.add(new Employee(102, "Samadhan",60000, 30));
        emplist.add(new Employee(103, "Norman",70000, 30));
        emplist.add(new Employee(104, "Pralabh",80000, 30));

        System.out.println(emplist.toString());

        //Sorting in Employeename in ascending order
        emplist.stream().sorted(Comparator.comparing(Employee::getEmployeeName)).collect(Collectors.toList()).forEach(System.out::println);

        //Sorting in Employeename in descending order
        System.out.println();
        emplist.stream().sorted(Comparator.comparing(Employee::getEmployeeName)).collect(Collectors.toList()).forEach(System.out::println);

    }


}
