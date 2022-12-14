package Mentor_lection.lessons_08_08;

public class Task_2 {
    /**
     * Каждый смайлик должен содержать допустимую пару глаз. Глаза можно обозначить как : или ;
     * У смайлика может быть нос, но это не обязательно.
     * Допустимые символы для носа - или ~
     * У каждого улыбающегося лица должен быть улыбающийся рот, который должен быть отмечен либо ), либо D
     * Использование дополнительных символов не допускается, кроме упомянутых.
     * <p>
     * Примеры валидных смайлов:   :) :D ;-D :~)
     * Примеры невалидных смайлов: ;( :> :} :]
     * <p>
     * Пример
     * countSmileys ([":)", "; (", ";}", ":-D"]); // должен вернуть 2;
     * countSmileys (["; D", ":-(", ":-)", "; ~)"]); // должен вернуть 1;
     * countSmileys ([";]", ": [", "; *", ": $", ";-D"]); // должен вернуть 1;
     * Примечание
     * В случае пустого массива возвратите 0.
     * Порядок элементов лица (глаза, нос, рот) всегда будет одинаковым.
     */
    public static void main(String[] args) {
        int output_0 = countSmileys(new String[]{":)", "; (", ";}", ":-D"});
        System.out.println(output_0);
        int output_1 = countSmileys(new String[]{"; D", ":-(", ":-)", "; ~)"});
        System.out.println(output_1);
        int output_2 = countSmileys(new String[]{";]", ": [", "; *", ": $", ";-D"});
        System.out.println(output_2);
        int output_3 = countSmileys(new String[]{});
        System.out.println(output_3);
    }

    public static int countSmileys(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == ':' || arr[i].charAt(0) == ';') {
                if ((arr[i].charAt(1) == '-' || arr[i].charAt(1) == '~') && (arr[i].charAt(2) == ')' || arr[i].charAt(2) == 'D')) {
                    count++;

                } else if (arr[i].charAt(1) == ')' || arr[i].charAt(1) == 'D') {
                    count++;
                }
            }
        }
        return count;
    }
}
