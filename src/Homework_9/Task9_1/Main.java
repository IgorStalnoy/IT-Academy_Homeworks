package Homework_9.Task9_1;

public class Main {
    public static void main(String[] args) {

        CustomStack<Phone> stack = new CustomStack<>();
        Phone phone1 = new Phone(37529_111_11_11L, "Nokia 3310", 0.133, 200);
        Phone phone2 = new Phone(37529_222_22_22L, "Siemens ME45", 0.099, 300);
        Phone phone3 = new Phone(37529_333_33_33L, "Samsung C100", 0.076,400);
        Phone phone4 = new Phone(37529_333_33_33L, "iPhone 10", 0.176, 1000);
        Phone phone5 = new Phone(37529_333_33_33L, "iPhone 11", 0.026, 1200);
        Phone phone6 = new Phone(37529_333_33_33L, "iPhone 12", 0.071, 1400);
        stack.push(phone1);
        stack.push(phone2);
        stack.push(phone3);
        stack.push(phone3);
        stack.push(phone1);
        stack.push(phone6);
        stack.push(phone5);
        stack.push(phone4);
        System.out.println(stack);
        System.out.println(stack.getMaxElement());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.getMaxElement());

        CustomStack<String> stack2 = new CustomStack<>();
        stack2.push("A");
        stack2.push("g");
        stack2.push("h");
        stack2.push("k");
        stack2.push("W");
        stack2.push("t");
        stack2.push("3");
        stack2.push("8");
        stack2.push("k");
        stack2.push("a");
        System.out.println(stack2);
        System.out.println(stack2.getMaxElement());
        stack2.pop();
        stack2.pop();
        stack2.pop();
        stack2.pop();
        stack2.pop();
        System.out.println(stack2);
        System.out.println(stack2.getMaxElement());

        CustomStack<Integer> stack3 = new CustomStack<>();
        stack3.push(4);
        stack3.push(123);
        stack3.push(54);
        stack3.push(11);
        stack3.push(1);
        stack3.push(76);
        stack3.push(22);
        stack3.push(22);
        stack3.push(1);
        stack3.push(86);
        System.out.println(stack3);
        System.out.println(stack3.getMaxElement());
        stack3.pop();
        stack3.pop();
        stack3.pop();
        stack3.pop();
        System.out.println(stack3);
        System.out.println(stack3.getMaxElement());

    }
}