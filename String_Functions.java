public class String_Functions {

    public static boolean compareStrings(String str1,String str2){
        return str1.equals(str2) ;
    }

    public static String copyStrings(String str1){
        return new String(str1) ;

    }
    public static String concatenateString(String str1,String str2){
        return str1+str2;
    }
    public static void main (String[] args){
        String s1="abc";
        String s2="def";
        System.out.println("string comparision");
        System.out.println(compareStrings(s1,s2));

        String original="copy me!";
        System.out.println(copyStrings(original));

        String s4="hello";
        String s5="world!";
        System.out.println(concatenateString(s4,s5));

    }
}
