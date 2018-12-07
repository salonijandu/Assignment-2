package lab11;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Laptops {
   /*
    *variables for the class Laptops
    */
    private String make;
    private int screensize;
    private int ram;
    private int memory;

    
    /*
    *constructor for the Laptops passing the parameters of make, screensize, ram, memory
    */
    public Laptops(String make, int screensize, int ram, int memory) {
        setMake(make);
        setScreensize(screensize);
        setRam(ram);
        setMemory(memory);
        
    }

    
    /**
     * get set methods begins
     */
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make == null || make.isEmpty()) {
    		throw new IllegalArgumentException("Make cannot be empty");
    	}
        else
        this.make = make;
    }

    public int getScreensize() {
        return screensize;
    }

    public void setScreensize(int screensize) {
        if(screensize> 0)
        this.screensize = screensize;
        else
            throw new IllegalArgumentException("Not a valid value for screensize");
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if(ram> 0)
        this.ram = ram;
        else
            throw new IllegalArgumentException("Not a valid value for RAM");
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        if(memory>0)
        this.memory = memory;
        else
            throw new IllegalArgumentException("Not a valid value for Memory");
        
        
    }

    
   
    
    
    
    
    
}
