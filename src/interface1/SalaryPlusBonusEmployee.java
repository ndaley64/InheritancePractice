/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author Nathaniel
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    protected double lastBonus;

    public SalaryPlusBonusEmployee(double lastBonus, String firstName, char midInitial, String lastName, String EmpID, double yearlySalary, double numPayPeriods) {
        super(firstName, midInitial, lastName, EmpID, yearlySalary, numPayPeriods);
        this.lastBonus = lastBonus;
    }
    
    public double getPayWithBonus(double bonus){
        return (yearlySalary / numPayPeriods) + bonus;
    }
}
