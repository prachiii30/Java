public class skip_string_apple {
    public static void main(String[] args) {
        String ans=skipString("appleabcdapple");
        System.out.println(ans);
    }
    public static String skipString(String given){
        if(given.isEmpty())
        return "";
    
        if(given.startsWith("apple")){
            return skipString(given.substring(5));
        }
        else
            {
                char ch=given.charAt(0);
                return ch+skipString(given.substring(1));
            }
    }
    
}
