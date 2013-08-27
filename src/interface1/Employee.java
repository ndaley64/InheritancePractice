/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author Nathaniel
 */
public interface Employee {
    public void setFirstName(String firstName);

    public void setMidInitial(char midInitial);

    public void setLastName(String lastName);

    public void setEmpID(String EmpID);
    
    public String getFirstName();

    public char getMidInitial();

    public String getLastName();

    public String getEmpID();

    public double getPay();
}
