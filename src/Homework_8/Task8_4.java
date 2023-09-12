package Homework_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * RegEx. Email.
 * Общий вид — логин@поддомен.домен.
 * Логин, как и поддомен — слова из букв, цифр, подчеркиваний, дефисов и точек. А домен (имеется в виду 1го уровня) — это от 2 до 6 букв.
 * Пример: myemail@gmail.com  a.petrov@gmail.com.au coder4575@yandex.ru
 */

public class Task8_4 {
    public static void main(String[] args) {

        String emails = """
                        a.petrov@gmail.com.au
                        myemail@gmail.com
                        a.petrov@gmail.com.au
                        1cod_er4575@yandex.ru
                        lama.loca.loca123@inca.com
                        pio_pio@factory.com
                        carnival666@hellmail.com
                        la-lalai@gmail.com
                        testmail@mail.com.de
                        testmail@mail.de.org
                        testmail@mail.de.рф
                        redaktor@москва-компания.рф
                        stalnoy.igor.a@gmail.com
                        testmail@mail.com
                        .testmail@mail.com
                        testmail@mail.com.
                """;
        String[] emailList = emails.split("\\s+");
        Pattern validEmailPattern = Pattern.compile("\\w[\\w.\\-]+@([а-я\\w\\-]+\\.)+([(a-z]{2,6}|[а-я]{2,6})");
        for (String i : emailList) {
            Matcher validEmailMatcher = validEmailPattern.matcher(i);
            boolean isValid = validEmailMatcher.matches();
            if (isValid) {
                System.out.println(i + " | is valid email");
            } else {
                System.out.println(i + " | is not valid email");
            }
        }
    }
}
