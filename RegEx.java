import java.util.regex.*;
public class RegEx {
    public static void main(String[] args) {
        /*Pattern p = Pattern.compile(".m");
        Matcher m = p.matcher("am");
        boolean b = m.matches();
        System.out.println(b);*/
        System.out.println(Pattern.matches("[^amn]","m")); //should not include a/m/n
        System.out.println(Pattern.matches("[a-zA-S]", "M"));
        System.out.println(Pattern.matches("[A|G][a-z]{5,6}", "Adithya")); //Must start with either A/G and followed by either 5/6 characters
        System.out.println(Pattern.matches("[xyz]?", "y")); // 0 or 1
        System.out.println(Pattern.matches("[xyz]+", "z")); // 1 or more
        System.out.println(Pattern.matches("[xyz]*", "")); // 0 or more
        System.out.println(Pattern.matches("\\d{3}", "234")); // contains only numbers of length 4 [0-9]{4}
        System.out.println(Pattern.matches("\\D", "A")); // should not include any numbers [^0-9]
    }
}
