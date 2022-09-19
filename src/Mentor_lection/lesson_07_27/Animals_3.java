package Mentor_lection.lesson_07_27;
/*
в) Порахувати кількість ніг у кожного із наборів із розрахунку, що гуска має 2 ноги, а вівця чотири
Доповнити висновок на консоль:
“В хатинці є 1 гуска та 4 вівці. Кількість ніг = 18”
     “В хатинці є 2 гуски та 3 вівці. Кількість ніг = 16”
*/

public class Animals_3 {
    public static void main(String[] args) {
        int ship = 4;
        int ship_legs = 4;
        int duck_legs = 2;

        for (int i = 1; i < 5; i++) {
            String duck_text = " Гуска";
            String ship_text = " Ввівця";
            if (i > 1) {
                duck_text = " Гуски";
            }
            if (ship > 1) {
                ship_text = " Ввівці";
            }
            System.out.println(" В хатинці є " + i + duck_text + " та " + ship + ship_text + ". Кількість ніг = " + ((i * duck_legs) + (ship * ship_legs)));
            ship--;
        }
    }
}
