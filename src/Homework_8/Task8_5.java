package Homework_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * RegEx. IP адрес.
 * 4 группы цифр (от 1 до 3 цифр в каждой) разделены точками. Группа содержит число в диапазоне от 1 до 255
 * Пример: 127.0.0.1  255.255.255.253   100.99.44.2
 */
public class Task8_5 {
    public static void main(String[] args) {

        String ipAddresses = """
                validates:
                192.68.35.35
                0.0.0.0
                255.0.0.0
                192.168.1.0
                192.168.0.1
                255.255.255.0
                1.1.1.1
                255.255.255.255
                249.249.249.249
                200.200.200.200
                199.199.199.199
                100.100.100.100
                99.99.99.99
                0.0.0.0
                9.9.9.9
                10.10.10.10
                99.99.99.99
                100.100.100.100
                109.109.109.109
                110.110.110.110
                199.199.199.199
                200.200.200.200
                249.249.249.249
                250.250.250.250
                255.255.255.255
                01.01.01.01
                09.09.09.09
                192.168.0.1
                255.255.255.255
                1.1.1.1

                should not validate:
                256.256.256.260
                192.168.0.0/24
                192.168..1
                192.168.1
                1
                1.
                1.1
                1.1.
                1.1.1
                1.1.1.
                1.1.1.1.
                1.1.1.1.1
                .1.1.1.1
                1.0.0.1.0
                010.1.1.1
                123456
                123123123123
                .127.0.0.1
                192.168.0.1000
                300.168.0.1
                192.168.0.1.
                192.168.0..1
                192.16a8.0.1
                123.234.345
                123.123
                11.11.1
                .192.168.0.1
                .192.168.0.
                .192.168.0
                ....
                .......
                ........""";
        String[] ipList = ipAddresses.split("\\n+");
        Pattern pattern = Pattern.compile("(([\\d]{1,2}|[1]\\d\\d|[12][0-5][0-5]|[2][0-4]\\d)\\.){3}([\\d]{1,2}|[1]\\d\\d|[12][0-5][0-5]|[2][0-4]\\d)");
        for (String i : ipList) {
            Matcher matcher = pattern.matcher(i);
            boolean isValid = matcher.matches();
            boolean isAnnotation = i.equals("validates:") || i.equals("should not validate:");
            if (isAnnotation) {
                System.out.println(i);
            } else if (isValid) {
                System.out.println(i + " | is valid IPv4");
            } else {
                System.out.println(i + " | is not valid IPv4");
            }
        }
    }
}
