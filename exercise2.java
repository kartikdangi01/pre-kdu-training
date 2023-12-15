import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>(10);
        HashSet<String> hset = new HashSet<>();
        HashMap<String, Integer> hmap = new HashMap<>();

        System.out.println("Enter 10 strings : ");

        for(int i = 0; i < 10; i++){
            String str = sc.nextLine();
            arr.add(str);
            hset.add(str);
            hmap.put(str,hmap.getOrDefault(str, 0) + 1);
        }

        System.out.println("ArrayList contains : ");
        for(String ele : arr){
            System.out.println(ele);
        }
        
        System.out.println("HashSet contains : ");
        for(String ele : hset){
            System.out.println(ele);
        }

        System.out.println("HashMap contains : ");
        for(String ele : hmap.keySet()){
            int val = hmap.get(ele);
            System.out.println(ele + " with frequency " + val);
        }
        sc.close();
    }
}
