import java.util.regex.*;

public class ValidIdentifier {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[a-zA-Z_$][a-zA-Z0-9_$]*");
        Matcher m = p.matcher("$hello");
        boolean b = m.matches();
        System.out.println(b);
    }
}
