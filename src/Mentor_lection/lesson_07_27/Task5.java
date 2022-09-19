package Mentor_lection.lesson_07_27;

public class Task5 {
    /*
Создать две переменные m и n типа int.
Используя цикл for вывести на экран прямоугольник размером m на
n из восьмёрок.
Пример: m=2, n=4
8888
8888
 */
    public static void main(String[] args) {

        int m = 6;
        int n = 5;
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(n * m);

            }
            System.out.println();
        }
    }
}
