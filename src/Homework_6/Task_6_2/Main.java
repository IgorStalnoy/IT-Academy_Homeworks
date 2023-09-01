package Homework_6.Task_6_2;

public class Main {
    //Создайте класс Phone, который содержит поля number, model и weight.
    //Создайте три экземпляра (instance) этого класса.
    //Выведите в консоль их значения.
    //Добавить в класс Phone методы: receiveCall (один параметр – имя звонящего). Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращае номер телефона. Вызвать эти методы для каждого из объектов
    //Добавить второй метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
    //Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
    //Метод выводит на консоль номера этих телефонов.
    public static void main(String[] args) {

        Phone phone1 = new Phone(37529_111_11_11L, "Nokia 3310", 0.133);
        Phone phone2 = new Phone(37529_222_22_22L, "Siemens ME45", 0.099);
        Phone phone3 = new Phone(37529_333_33_33L, "Samsung C100", 0.076);

        System.out.println();
        phone1.printPhone();
        phone2.printPhone();
        phone3.printPhone();

        System.out.println();
        phone1.receiveCall("John");
        phone2.receiveCall("Alice");
        phone3.receiveCall("George");

        System.out.println();
        phone1.receiveCall("John", 37529_444_44_44L);
        phone2.receiveCall("Alice", 37529_555_55_55L);
        phone3.receiveCall("George", 37529_666_66_66L);

        System.out.println();
        phone1.sendMessage(37529_456_89_47L, 37525_111_45_44L, 37533_456_89_99L);
        phone2.sendMessage(37529_734_61_22L, 37525_788_15_84L, 37533_367_60_25L);
        phone3.sendMessage(37529_126_16_72L, 37525_412_43_26L);

    }
}
