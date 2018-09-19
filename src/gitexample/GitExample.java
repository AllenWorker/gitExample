/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitexample;

/**
 * This program is to demonstrate git
 * 
 */
public class GitExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager emp1 = new Manager("John", 1953);
        //System.out.println(emp1.PrintDetails());
        
        Employee emp2 = new Employee("Charlie", 234);
        Employee emp3 = new Employee("Bell", 345);
        emp1.addRmployee(emp2);
        emp1.addRmployee(emp3);
        System.out.println(emp1.PrintDetails());
    }
    
}
