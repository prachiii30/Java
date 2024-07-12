public class sub_sequence {
    public static void main(String[] args) {
        genereate_subSequence("abc","");
    }
    public static void genereate_subSequence(String given,String ans){
        if(given.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch=given.charAt(0);

        genereate_subSequence(given.substring(1), ans+ch);
        genereate_subSequence(given.substring(1), ans);
    }
    
}
