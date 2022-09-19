package Homeworks.homeworks_12;

public class Homeworks_12 {
    public static void main(String[] args) {

        String arr[] = new String[101];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = String.valueOf(i);

            int change = Integer.parseInt(arr[i]);

            if (change % 3 == 0) {
                String a = "Hello";
                arr[i] = a;
            }
            if (change % 5 == 0) {
                String b = "World";
                arr[i] = b;
            }
            if ((change % 5 == 0) && (change % 3 == 0)) {
                String c = "HelloWorld";
                arr[i] = c;
            }
            System.out.print(arr[i] + " ");
        }
    }
}