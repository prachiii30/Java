import java.util.ArrayList;

public class sub_sequence2 {
    public static void main(String[] args) {
        String given="abc";
        ArrayList<String>list=new ArrayList<>();
        arrayofSequenceApproach1(given,"",list);
        System.out.println(list);
        
    }
    public static void arrayofSequenceApproach1(String given ,String ans,ArrayList<String>list){
        if(given.isEmpty())
        {   
            list.add(ans);
            // System.out.println(list);
            return ;
        }
        
        arrayofSequenceApproach1(given.substring(1), given.charAt(0)+ans, list);
        arrayofSequenceApproach1(given.substring(1), ans, list);


    }
        

}
