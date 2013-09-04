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
    private String firstName;
    private char midInitial;
    private String lastName;
    private String EmpID;
    private double hourlyPay;
    private double hoursWorked;

    public HourlyEmployee(String firstName, char midInitial, String lastName, String EmpID, double hourlyPay) {
        this.firstName = firstName;
        this.midInitial = midInitial;
        this.lastName = lastName;
        this.EmpID = EmpID;
        this.hourlyPay = hourlyPay;
    }
    
    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setMidInitial(char midInitial) {
        this.midInitial = midInitial;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public char getMidInitial() {
        return midInitial;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
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
    
    @Override
    public double getPay(){
        return hoursWorked * hourlyPay;
    }
}