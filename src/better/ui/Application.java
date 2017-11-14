package better.ui;

import javax.swing.*;
import better.service.*;
import better.domain.*;

public class Application extends JFrame{
    private static Personnel listEmployee = new Personnel();

    public Application(Personnel listEmployee) {
        this.listEmployee = listEmployee;
        this.setTitle("Employee Management");
        this.setSize(1280, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        displayHomeMenu();
    }

    public static void main(String[] args){
        listEmployee.ajouterEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000));
        listEmployee.ajouterEmploye(new Representant("Léon", "Vendtout", 25, "2001", 20000));
        listEmployee.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, "1998", 1000));
        listEmployee.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
        listEmployee.ajouterEmploye(new TechnARisque("Jean", "Flippe", 28, "2000", 1000));
        listEmployee.ajouterEmploye(new ManutARisque("Al", "Abordage", 30, "2001", 45));

        Application application = new Application(listEmployee);
    }

    public void displayHomeMenu() {
        this.getContentPane().removeAll();
        this.setContentPane(new Home(this));
        this.revalidate();
        this.repaint();
    }

    public void displayAddEmployeeMenu () {
        this.getContentPane().removeAll();
        this.setContentPane(new AddEmployee(this, listEmployee));
        this.validate();
        this.repaint();
    }

    public void displayDisplayEmployeesMenu () {
        this.getContentPane().removeAll();
        this.setContentPane(new DisplayEmployees(this, listEmployee));
        this.validate();
        this.repaint();
    }

    public void submitForm () {

    }
}
