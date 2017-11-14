package better.ui;

import javax.swing.*;


import java.awt.*;


public class Home extends JPanel {
    private final Application app;
    //private JPanel home = new JPanel();
    private JButton addEmployeeButton = new JButton("Add Employee");
    private JButton displayEmployeesButton = new JButton("Display Employees");

    public Home (Application app) {
        runMenu();
        this.app = app;
    }

    public void runMenu() {
        this.setLayout(new FlowLayout());
        this.add(addEmployeeButton);
        addEmployeeButton.addActionListener(e -> app.displayAddEmployeeMenu());
        this.add(displayEmployeesButton);
        displayEmployeesButton.addActionListener(e -> app.displayDisplayEmployeesMenu());
        this.setVisible(true);
    }

}
