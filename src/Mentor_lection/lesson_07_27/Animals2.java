package Mentor_lection.lesson_07_27;
/*
 б) змінити закінчення в залежності від числа, яке стоїть перед словом гуска и вівця.
	“В хатинці є 1 гуска и 4 вівці”
	“В хатинці є 2 гускі и 3 вівці”
 */

public class Animals2 {
    public static void main(String[] args) {
        int ship = 4;
        for (int i = 1; i < 5; i++) {
            String duck_text = " Гуска";
            String ship_text = " Ввівця";
            if (i > 1) {
                duck_text = " Гуски";
            }
            if (ship > 1) {
                ship_text = " Ввівці";
            }
            System.out.println(" В хатинці є " + i + duck_text + " та " + ship-- + ship_text);
        }
    }
}
