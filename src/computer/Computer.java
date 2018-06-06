
package computer;

public class Computer {
    
    private double processTact;
    private double memory;
    private int hardDrive;

    public Computer() {
        this.memory = 1.0;
        this.hardDrive = 4444;
        this.memory = 500;
    }

    
    
    public Computer(double processTact, double memory, int hardDrive) {
        this.processTact = processTact;
        this.memory = memory;   
        this.hardDrive = hardDrive;
    }
    
    public double getProcessTact() {
        return this.processTact;
    }
    
    public void setProcessTact(double processTact) {
        this.processTact = processTact;
    }
    
    public double getMemory() {
        return this.memory;
    }
    
    public void setMemory(double memory) {
        this.memory = memory;
    }
    
    public int getHardDrive() {
        return this.hardDrive;
    }
    
    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }
    
    
    
}
