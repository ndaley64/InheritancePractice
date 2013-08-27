/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract1;

/**
 *
 * @author Nathaniel
 */
public abstract class Employee {
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

    public abstract String getFirstName();

    public abstract char getMidInitial();

    public abstract String getLastName();

    public abstract String getEmpID();

    public abstract double getPay();
}
