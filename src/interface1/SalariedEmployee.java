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
    protected String firstName;
    protected char midInitial;
    protected String lastName;
    protected String EmpID;
    protected double yearlySalary;
    protected double numPayPeriods;

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
    
    public double getPay(){
        return yearlySalary / numPayPeriods;
    }
}
