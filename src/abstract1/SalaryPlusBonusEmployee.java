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
    protected double lastBonus;
    
    public double getPayWithBonus(double bonus){
        lastBonus = bonus;
        
        return (yearlySalary / numPayPeriods) + bonus;
    }
}
