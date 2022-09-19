package Mentor_lection.lessons_09_08;


// как проверить email на валидность
//        String text = "kjhkjh@sdfdsf.sdf";


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {

        final String testText = "kjhkjh@sdfdsf.sdf";

        Pattern pattern = Pattern.compile("^[A-Z0-9!#$%^&*(-)_+=]+@+[A-Z0-9]+\\.+[a-z0-9]{2,6}$", Pattern.CASE_INSENSITIVE);
        final Matcher matcher = pattern.matcher(testText);

        if (matcher.matches()) {
            System.out.println("email is valid");
        } else {
            System.out.println("email not valid");
        }

    }
}
