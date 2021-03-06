/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author Nathaniel
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double lastBonus;

    public SalaryPlusBonusEmployee(double lastBonus, double yearlySalary, double numPayPeriods, String firstName, char midInitial, String lastName, String EmpID) {
        super(firstName, midInitial, lastName, EmpID, yearlySalary, numPayPeriods);
        this.lastBonus = lastBonus;
    }
    
    public double getPayWithBonus(double bonus){
        lastBonus = bonus;
        
        return (this.getYearlySalary() / this.getNumPayPeriods()) + bonus;
    }
}
