/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitexample;

/**
 * Holds employee data
 * @author J392018
 */
public class Employee {
    protected String name;
    protected int employeeNum;

    public Employee(String name, int employeeNum) {
        this.name = name;
        this.employeeNum = employeeNum;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }
    
    public String PrintDetails()
    {
        return employeeNum + " " + name;
    }
    
}
