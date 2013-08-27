/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

import java.util.Scanner;

/**
 *
 * @author Nathaniel
 */
public class Tester {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        String tempFirstName;
        char tempMidInitial;
        String tempLastName;
        String tempEmpID;
        double tempHourlyPay;
        double tempYearlySalary;
        double tempNumPayPeriods;
        
        System.out.println("Hourly Employee");
        System.out.println("---------------------------------------------------");
        System.out.print("Enter first name: ");
        tempFirstName = keyboard.nextLine();
        System.out.print("Enter middle initial: ");
        tempMidInitial = keyboard.nextLine().charAt(0);
        System.out.print("Enter last name: ");
        tempLastName = keyboard.nextLine();
        System.out.print("Enter employee ID: ");
        tempEmpID = keyboard.nextLine();
        System.out.print("Enter hourly pay: ");
        tempHourlyPay = Double.parseDouble(keyboard.nextLine());
        
        HourlyEmployee h = new HourlyEmployee(tempFirstName, tempMidInitial, tempLastName, tempEmpID, tempHourlyPay);
        
        System.out.println(h.getLastName() + ", " +  h.getFirstName() + " " + h.getMidInitial());
        System.out.println("EmpID: " + h.getEmpID() + "   Hourly Pay: " + h.getHourlyPay());
        System.out.println("Pay this pay period: " + h.getPay());
        
        System.out.println("Salaried Employee");
        System.out.println("---------------------------------------------------");
        System.out.print("Enter first name: ");
        tempFirstName = keyboard.nextLine();
        System.out.print("Enter middle initial: ");
        tempMidInitial = keyboard.nextLine().charAt(0);
        System.out.print("Enter last name: ");
        tempLastName = keyboard.nextLine();
        System.out.print("Enter employee ID: ");
        tempEmpID = keyboard.nextLine();
        System.out.print("Enter yearly salary: ");
        tempYearlySalary = Double.parseDouble(keyboard.nextLine());
        System.out.print("Enter the number of pay periods: ");
        tempNumPayPeriods = Double.parseDouble(keyboard.nextLine());
        
        SalariedEmployee s = new SalariedEmployee(tempFirstName, tempMidInitial, tempLastName, tempEmpID, tempYearlySalary, tempNumPayPeriods);
        
        System.out.println(s.getLastName() + ", " +  s.getFirstName() + " " + s.getMidInitial());
        System.out.println("EmpID: " + s.getEmpID() + "   Salary: " + s.getYearlySalary());
        System.out.println("Pay this pay period: " + s.getPay());
    }
}
