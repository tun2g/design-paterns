package creational_paterns.prototype;

public class Computer implements Cloneable{

    private Integer version;
    private String name;

    public Computer(Integer version, String name){
        this.version = version;
        this.name = name;
    }

    @Override
    protected Computer clone(){
        try {
            return (Computer) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString(){
        return this.name + " version: " + this.version;
    }
}
