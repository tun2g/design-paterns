package creational_paterns.prototype;

public class Main {
    public static void main(String[] args){
        Computer computer = new Computer(1,"AA");
        Computer computer1 = computer.clone();
        System.out.println(computer1.toString());
    }
}
