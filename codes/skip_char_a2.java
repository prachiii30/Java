public class skip_char_a2 {
    public static void main(String[] args) {
        String ans=skipChar("abacdeafaa");
        System.out.println(ans);
    }
    public static String skipChar(String given){
        if(given.isEmpty()){
            return "";
        }
        char ch=given.charAt(0);
        if(ch!='a'){
            return ch+skipChar(given.substring(1));
        }
        else
        {
            return skipChar(given.substring(1));
        }
    }
}
