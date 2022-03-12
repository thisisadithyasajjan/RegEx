import java.util.regex.*;

public class ValidEmailId {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-zA-Z0-9_\\-\\.]+[@][a-z]+\\.[a-z]{2,3}");
        Matcher m = p.matcher("ext-adithyas@perfios.com");
        boolean b = m.matches();
        if(b == true)
            System.out.println("Valid Email address");
        else
            System.out.println("Invalid Email address");
    }
}
