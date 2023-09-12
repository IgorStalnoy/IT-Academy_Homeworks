package HomeWork_8;

/**
 * Вводится ненормированная строка, у которой могут быть пробелы в начале, в конце и между словами более одного пробела.
 * Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце, а между словами оставить только один пробел.
 */
public class Task8_2 {
    public static void main(String[] args) {

        String text = "        Steph took a photo of her             carefully arranged breakfast and flowers.            Her eggs and her coffee had gone cold," +
                " but the            plate looked really cool. It was               from an expensive art market she had            visited that morning. The " +
                "flowers were              ones she'd 'borrowed' from her neighbour's garden. No one had           noticed. Besides, she thought,                " +
                " flowers are for everyone to enjoy, aren't they? And, probably     only ten people a day walked              past old Mrs Robinson's garden." +
                " Posting              the picture on Instagram meant far more people would get to appreciate them.                ";
        System.out.println(text);
        text = text.replaceAll("^ *| *$", "").replaceAll(" {2,}", " ");
        System.out.println(text);

    }
}
