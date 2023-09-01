package Homework_6.Task_6_2;

public class Phone {
    private final long number;
    private final String model;
    private final double weight;  //kg

    Phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void printPhone() {
        System.out.println("Number : +" + this.number + "| Model : " + this.model + "| Weight : " + this.weight + "kg");
    }

    void receiveCall(String name) {
        System.out.println(name + " is calling" + " +" + getNumber());
    }

    void receiveCall(String name, long number) {
        System.out.println(name + " is calling" + " +" + number);
    }

    void sendMessage(long... numbers) {
        for (long number : numbers) {
            System.out.println("Message sent from number: " + this.number + " to number : +" + number);
        }
        System.out.println();
    }

    private long getNumber() {
        return number;
    }
}
