/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitexample;

import java.util.ArrayList;

/**
 *
 * @author J392018
 */
public class Manager extends Employee{
    
    private ArrayList<Employee> employees = new ArrayList<>();
    
    public Manager(String name, int employeeNum) {
        super(name, employeeNum);
    }
    
    public void addRmployee( Employee empNew)
    {
        employees.add(empNew);
    }
    
    public void removeEmployee(Employee existingEmp)
    {
        employees.remove(existingEmp);
    }
    
    @Override
    public String PrintDetails()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(employeeNum + " ");
        sb.append(name + " ");
        sb.append("\n");
        for (Employee e : employees)
        {
            sb.append("Employee: " + e.name);
            sb.append("\n");
        }
        return sb.toString();
    }
}
