import java.util.ArrayList;

public class sub_sequence2 {
    public static void main(String[] args) {
        String given="abc";
        ArrayList<String>list=new ArrayList<>();
        arrayofSequenceApproach1(given,"",list);
        System.out.println(list);

        ArrayList<String> a=arrayofSequenceApproach2(given, "");
        System.out.println(a);

    }
    public static void arrayofSequenceApproach1(String given ,String ans,ArrayList<String>list){
        if(given.isEmpty())
        { 
            list.add(ans);
            return;
        }
        char ch=given.charAt(0);
        arrayofSequenceApproach1(given.substring(1), ans+ch, list);
        arrayofSequenceApproach1(given.substring(1), ans, list);
    }

    // --------------------------------------------------------------------
    public static ArrayList<String> arrayofSequenceApproach2(String given ,String ans){
        ArrayList<String> list=new ArrayList<>();
        if(given.isEmpty()){
            list.add(ans);
            return list;
        }
        ArrayList<String> left=arrayofSequenceApproach2(given.substring(1), ans+given.charAt(0));
        ArrayList<String> right=arrayofSequenceApproach2(given.substring(1), ans);
        left.addAll(right);
        return left;
    }

        

}
