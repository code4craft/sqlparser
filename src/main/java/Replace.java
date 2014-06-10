import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author code4crafer@gmail.com
 */
public class Replace {

    public static String camelhumpToUnderline(String str) {
        return str.replaceAll("([A-Z\\d]{1})","_$1").toLowerCase().replaceFirst("^_","");
    }

    public static String underlineToCamelhump(String str) {
        Matcher matcher = Pattern.compile("_?([a-z])([a-z\\d]+)").matcher(str);
        StringBuilder accum = new StringBuilder();
        while (matcher.find()){
            accum.append(matcher.group(1).toUpperCase()).append(matcher.group(2));
        }
        return accum.toString();
    }

    public static void main(String[] args) {
        String a = "AbstactRegionLog";
        String x = camelhumpToUnderline(a);
        System.out.println(x);
        System.out.println(underlineToCamelhump(x));
    }
}
