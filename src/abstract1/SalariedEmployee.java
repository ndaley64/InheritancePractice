/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author Nathaniel
 */
public class SalariedEmployee extends Employee {
    protected double yearlySalary;
    protected double numPayPeriods;

    public SalariedEmployee(String firstName, char midInitial, String lastName, String EmpID, double yearlySalary, double numPayPeriods) {
        super(firstName, midInitial, lastName, EmpID);
        this.yearlySalary = yearlySalary;
        this.numPayPeriods = numPayPeriods;
    }

    public String getFirstName() {
        return firstName.toUpperCase();
    }

    public char getMidInitial() {
        return midInitial;
    }

    public String getLastName() {
        return lastName.toUpperCase();
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
