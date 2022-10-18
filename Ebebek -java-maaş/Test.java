import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Melih" , 750,35, 2019));
        employees.add(new Employee("Esra"  , 10500 , 50, 2014));
        employees.add(new Employee("Göktuğ", 23000, 45, 2008));
        employees.add(new Employee("Betül" , 33000, 40, 2002));


        for ( Employee i : employees)
            System.out.println(i.toString());
        System.out.println();
    }
}
