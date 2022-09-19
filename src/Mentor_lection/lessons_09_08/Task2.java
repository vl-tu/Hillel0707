package Mentor_lection.lessons_09_08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    static String text = "Мова значно запозичила синтаксис 0979999999із C і C++. " +
            "Зокрема, взято за основу об'єктну модель С++, +380965647893проте " +
            "її модифіковано. Усунуто можливіс+380660112233ть " +
            "появи деяких конфліктних ситуацій, що могли виникнути через помилки " +
            "прогр+38045654645аміста та полегшено сам процес розробки об'єктно-орієнтованих ";

    public static void main(String[] args) {


        final Pattern pattern = Pattern.compile("(\\+380|0)+\\d{9}");
        final Matcher matcher = pattern.matcher(text);
        System.out.println("We found next phone numbers: ");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}

