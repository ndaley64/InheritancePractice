/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package concrete;

/**
 *
 * @author Nathaniel
 */
public class Employee {
    protected String firstName;
    protected char midInitial;
    protected String lastName;
    protected String EmpID;

    public Employee() {
        firstName = "John";
        midInitial = 'J';
        lastName = "Doe";
        EmpID = "ABC123";
    }
    
    public Employee(String firstName, char midInitial, String lastName, String EmpID) {
        this.firstName = firstName;
        this.midInitial = midInitial;
        this.lastName = lastName;
        this.EmpID = EmpID;
    }

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

    
}
