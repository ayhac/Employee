/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Praktikum
 */
public class Manager extends Employee {
    private int gol;
    public void displayData() {
        System.out.println("Manager name: "+getName());
        System.out.println("Manager salary: "+getSalary());
    }

    /**
     * @return the gol
     */
    public int getGol() {
        return gol;
    }

    /**
     * @param gol the gol to set
     */
    public void setGol(int gol) {
        this.gol = gol;
    }

    @Override
    public double getSalary() {
        if(gol==1) {
            return super.getSalary(); //To change body of generated methods, choose Tools | Templates.   
        } else if(gol==2) {
            return super.getSalary() * 1.5;
        } else if(gol==3) {
            return super.getSalary() * 1.75;
        } else {
            return super.getSalary() * 2;
        } 
    }
        
        
      
    
    
    
}
