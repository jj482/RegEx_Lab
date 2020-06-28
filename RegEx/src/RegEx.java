import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static String getNameFromLine (String line){

        String name = "";
        String text =line;
        Pattern pattern = Pattern.compile("[А-Я]");
        Pattern pattern_literal = Pattern.compile("[А-Я]");
        Matcher m = pattern_literal.matcher(text);
        String literal = "" ;
        while (m.find()){
            int start=m.start();
            int end=m.end();
            literal += text.substring(start,end);
        }

//            System.out.println(literal);

        String[] strings1 = pattern.split(text);
        int i=-1;
        for (String s : strings1) {
            if(i>=0) {
//                System.out.println(literal.charAt(i) + s);
                name += literal.charAt(i) + s ;
            }
            i++;
        }

        return name;
    }
}
