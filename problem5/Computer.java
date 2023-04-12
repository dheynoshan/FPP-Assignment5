package problem5;

public class Computer {
    private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed){
        this.manufacturer=manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }
    public double computePower(){
        return ramSize*processorSpeed;
    }
    @Override
    public String toString(){
        String s = "Manufacturer: " + manufacturer +"\nProcessor: "+
                processor + "\nRam: " + getRamSize() + "\nProcessor Speed: "+
                getProcessorSpeed() + "\nPower: " + computePower();
        return  s;
    }
    @Override
    public boolean equals(Object obj){
        if(obj==null)
            return false;
        if(!(obj instanceof Computer))
            return false;
        Computer comp = (Computer) obj;
        return this.manufacturer==comp.manufacturer &&
                this.ramSize==comp.ramSize &&
                this.processor==comp.processor &&
                this.processorSpeed==comp.processorSpeed;
    }
}
