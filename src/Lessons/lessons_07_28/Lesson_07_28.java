package Lessons.lessons_07_28;

public class Lesson_07_28 {
    public static void main(String[] args) {
//        String text = "Hello i am Maks";
//        if (text.equalsIgnoreCase("Hello I am Maks")) {
//            System.out.println("Ok");
//        } else {
//            System.out.println("fail");
//        }
//        System.out.println("------------------------------------------------------------------------");
//
//        String text2 = "Hello I am Alex";
//        System.out.println(text2.indexOf("l"));
//        System.out.println(text2.lastIndexOf("l"));
//
//        System.out.println("------------------------------------------------------------------------");
//
//        int num = 1256341;
//        String temp = String.valueOf(num);
//        System.out.println(temp);
//
//        System.out.println("------------------------------------------------------------------------");
//
//        String num3 = "456987";
//        int temp3 = Integer.parseInt(num3);
//        System.out.println(temp3);
//
//        System.out.println("------------------------------------------------------------------------");

//        double number = 5.45;
//        System.out.println(Math.round(number));
//        System.out.println(Math.floor(number));
//        System.out.println(Math.ceil(number));
//        System.out.println("------------------------------------------------------------------------");

        String[] Newarr = {"Hello", "my", "name", "Maks"};
        reverseArray(Newarr);
    }

    public static void reverseArray(String[] arr) {
        int lenghtArr = arr.length;

        String temp;

        for (int i = 0; i < lenghtArr / 2; i++) {
            temp = arr[lenghtArr - i - 1];
            arr[lenghtArr - i - 1] = arr[i];
            arr[i] = temp;
        }
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }
}

