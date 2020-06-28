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
    public static String getAgeFromLine (String line){

        String age = "";
        String pattern = "(\\d{2})";
        Pattern r = Pattern.compile(pattern);
        // Теперь создаем объект соответствия.
        Matcher m = r.matcher(line);
        if (m.find( )) {
            age = m.group(0);
//            System.out.println("Found age: " + m.group(0) );
        }else {

//            System.out.println("NO MATCH");

        }
        return age;
    }

    public static String getPhoneFromLine (String line){

        Pattern pattern = Pattern.compile("[А-Я]");
        Pattern pattern_gital = Pattern.compile("[0-9]");
        Matcher m = pattern_gital.matcher(line);
        String literal = "" ;
        while (m.find()){
            int start=m.start();
            int end=m.end();
            literal += line.substring(start,end);
        }


//        System.out.println("Found phone: " + literal );

        String phone = "";
        if (literal.length()>=11) {
            phone = "+" + literal.charAt(0) + " (" + literal.substring(1, 4) + ") "
                    + literal.substring(4, 7) + " " + literal.substring(7, 9) + " " + literal.substring(9, 11);
        }
        return phone  ;

    }
}
