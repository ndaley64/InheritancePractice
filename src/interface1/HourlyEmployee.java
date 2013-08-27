/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author Nathaniel
 */
public class HourlyEmployee implements Employee {
    protected String firstName;
    protected char midInitial;
    protected String lastName;
    protected String EmpID;
    protected double hourlyPay;
    protected double hoursWorked;

    public HourlyEmployee(String firstName, char midInitial, String lastName, String EmpID, double hourlyPay) {
        this.firstName = firstName;
        this.midInitial = midInitial;
        this.lastName = lastName;
        this.EmpID = EmpID;
        this.hourlyPay = hourlyPay;
        this.hoursWorked = hoursWorked;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMidInitial(char midInitial) {
        this.midInitial = midInitial;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getMidInitial() {
        return midInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmpID() {
        return EmpID;
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
