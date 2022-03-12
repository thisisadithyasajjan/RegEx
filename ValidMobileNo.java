import javax.sound.midi.Soundbank;
import java.util.regex.*;

public class ValidMobileNo {
    public static void main(String[] args) {
        String s="5678912376";
        Pattern p = Pattern.compile("[91]?[6-9][0-9]{9}");
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        if(b == true)
            System.out.println("Valid Mobile Number");
        else
            System.out.println("Invalid Mobile Number");
    }
}
