/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author Nathaniel
 */
public class HourlyEmployee extends Employee {
    protected double hourlyPay;
    protected double hoursWorked;

    public HourlyEmployee(String firstName, char midInitial, String lastName, String EmpID, double hourlyPay) {
        super(firstName, midInitial, lastName, EmpID);
        this.hourlyPay = hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    
    public double getPay(){
        return hoursWorked * hourlyPay;
    }
}
