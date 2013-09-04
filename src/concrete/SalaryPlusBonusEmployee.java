/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author Nathaniel
 */
public class SalaryPlusBonusEmployee extends SalariedEmployee{
    private double lastBonus;

    public SalaryPlusBonusEmployee(double lastBonus, String firstName, char midInitial, String lastName, String EmpID, double yearlySalary, double numPayPeriods) {
        super(firstName, midInitial, lastName, EmpID, yearlySalary, numPayPeriods);
        this.lastBonus = lastBonus;
    }
    
    public double getPay(double bonus){
        this.lastBonus = bonus;
        return (this.getYearlySalary()/ this.getNumPayPeriods()) + bonus;
    }
}
