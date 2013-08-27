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
    protected double lastBonus;
    
    public double getPay(double bonus){
        return (yearlySalary / numPayPeriods) + bonus;
    }
}
