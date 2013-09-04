/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author Nathaniel
 */
public class SalariedEmployee implements Employee {
    private String firstName;
    private char midInitial;
    private String lastName;
    private String EmpID;
    private double yearlySalary;
    private double numPayPeriods;

    public SalariedEmployee(String firstName, char midInitial, String lastName, String EmpID, double yearlySalary, double numPayPeriods) {
        this.firstName = firstName;
        this.midInitial = midInitial;
        this.lastName = lastName;
        this.EmpID = EmpID;
        this.yearlySalary = yearlySalary;
        this.numPayPeriods = numPayPeriods;
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
    
    public double getYearlySalary() {
        return yearlySalary;
    }

    public double getNumPayPeriods() {
        return numPayPeriods;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public void setNumPayPeriods(double numPayPeriods) {
        this.numPayPeriods = numPayPeriods;
    }
    
    @Override
    public double getPay(){
        return yearlySalary / numPayPeriods;
    }
}
