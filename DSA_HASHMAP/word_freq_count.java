import java.util.*;
public class word_freq_count {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String[] words = str.split(" ");
        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<words.length;i++){

            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }
            else{
                map.put(words[i],1);
            }
        }

        System.out.println(map);
        sc.close();

    }
}
