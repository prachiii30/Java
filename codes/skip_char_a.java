public class skip_char_a {
    public static void main(String[] args) {
        skipChar("aaabcdeafgaaaa", "");
        
    }
    public static void skipChar(String given,String ans){
        if(given.isEmpty()){
        System.out.println(ans);
        return;
        }
        char ch=given.charAt(0);
        if(ch=='a'){
            skipChar(given.substring(1), ans);
        }
        else
            skipChar(given.substring(1), ans+ch);

    }
    
}
