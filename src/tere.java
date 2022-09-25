public class tere {
    public static void main(String[] args) {

        int[] arrayInitial = {1, 2, 3, 4, 5, 6};
        int[] newArray = arrExtension(arrayInitial, 7);
        printArray(newArray);
    }

    public static int[] arrExtension(int[] arrayInitial, int number) {
        int[] newArray = new int[arrayInitial.length + 1];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = arrayInitial[i];
        }
        newArray[newArray.length - 1] = number;

        return newArray;
    }

    public static void printArray(int[] arrayPrint) {
        for (int number : arrayPrint) {
            System.out.print(number + " ");
        }
    }
}
