package better.ui;

import better.service.*;

import javax.swing.*;

public class DisplayEmployees extends JPanel{
    private final Application app;
    private final Personnel listEmployee;
    private static String[] titles = {"First Name", "Last Name", "Age", "Profession", "Salary"};
    private static JTable employeesTable;

    private static JButton backButton = new JButton("Back");

    public DisplayEmployees (Application app, Personnel listEmployee) {
        this.runMenu();
        this.app = app;
        this.listEmployee = listEmployee;
        employeesTable = new JTable(listEmployee.createTable(), titles);
    }

    public void runMenu() {
        this.add(new JScrollPane(employeesTable));
        this.add(backButton);
        backButton.addActionListener(e -> app.displayHomeMenu());
    }
}
