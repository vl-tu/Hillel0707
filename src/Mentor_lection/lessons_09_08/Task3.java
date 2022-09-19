package Mentor_lection.lessons_09_08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    static String text = "Мова значно за 4441-3333-4444-5555 позичила синтаксис 09 79999999із C і C++.\" +\n"
            + "                \" Зокрема, взято за основу об'єктну модель С++, проте \" +\n"
            + "                \"її 5375 2222 3333 4444модифіковано. 334 ть появи деяких конфліктних\" +\n"
            + "                \" 5375222233334444 ситуацій, що могли виникнути через помилки\n";

    public static void main(String[] args) {


        final Pattern pattern = Pattern.compile("(\\d{4}[ \\-]?){4}");
        final Matcher matcher = pattern.matcher(text);

        System.out.println("We found next card numbers: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
