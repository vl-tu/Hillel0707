package Mentor_lection.lessons_09_08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    static String text = "ЖИЗНЬ\\nВ Днепре хотят перекрыть движение транспорта на косе на Красном Камне\\nСоздано 03.04.2021\\n\\n\" +\n"
            + "                \"В Днепре планируют перекрыть движение по косе в Новокодакском районе города, на жилмассиве Красный Камень. \" +\n"
            + "                \"Для ограничения движения там хотят установить шлагбаум.\\n\\nЗапретить собираются05.06.2000 движение транспорта на \" +\n"
            + "                \"рекреационной территории косы в направлении острова Горелого на основании письма инспекции по вопросам \" +\n"
            + "                \"благоустройства горсовета от 18 марта 2021 года.\n";

    public static void main(String[] args) {


        final Pattern pattern = Pattern.compile("(\\d{2}+.){2}+\\d{4}|\\d{2}+ [а-я]{5,8} \\d{4}");
        final Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

