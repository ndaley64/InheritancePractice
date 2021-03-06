/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author Nathaniel
 */
public class HourlyEmployee extends Employee {
    private double hourlyPay;
    private double hoursWorked;

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
    
    @Override
    public double getPay(){
        return hoursWorked * hourlyPay;
    }
}
