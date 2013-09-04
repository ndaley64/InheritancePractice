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
    private double yearlySalary;
    private double numPayPeriods;

    public SalariedEmployee(String firstName, char midInitial, String lastName, String EmpID, double yearlySalary, double numPayPeriods) {
        super(firstName, midInitial, lastName, EmpID);
        this.yearlySalary = yearlySalary;
        this.numPayPeriods = numPayPeriods;
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
