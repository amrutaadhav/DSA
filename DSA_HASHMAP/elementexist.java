import java.util.*;
public class elementexist {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> set = new HashSet<>();
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
      set.add(sc.nextInt());
    }
    int search = sc.nextInt();
 
 
  if(set.contains(search)){
    System.out.println("element found");
  }else{
    System.out.print("element not found");
  }
 sc.close();
  }
}

