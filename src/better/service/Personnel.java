package better.service;

import better.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class Personnel {

    private List<Employee> employees;
    private static final String PRINT_PATTERN = "%s gagne %.2f euros";

    public Personnel() {
        this.employees = new ArrayList<>();
    }

    public void ajouterEmploye(Employee employee) {
        this.employees.add(employee);
    }

    public void afficherSalaires() {
        employees.forEach(employee -> System.out.println(String.format(PRINT_PATTERN, employee.getName(), employee.calculerSalaire())));
    }

    public double salaireMoyen() {
        double total = 0;
        for (Employee employee: employees) {
            total += employee.calculerSalaire();
        }
        return total / employees.size();
    }

    public Object[][] createTable (){
        Object[][] employeesTable = new Object[200][6];
        int pos = 0;
        for (Employee employee: employees) {
            employeesTable[pos][0] = employee.getLastname();
            employeesTable[pos][1] = employee.getFirstname();
            employeesTable[pos][2] = employee.getAge();
            employeesTable[pos][3] = employee.getPosition();
            employeesTable[pos][4] = employee.calculerSalaire();
            employeesTable[pos][5] = employee.getEntryYear();
            pos++;
        }
        return employeesTable;
    }
}
