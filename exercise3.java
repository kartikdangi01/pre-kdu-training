import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class exercise3 {
    public static void main(String[] args) {
        String filePath = "sample.csv";

        try{
            FileReader file = new FileReader(filePath);    
            BufferedReader br = new BufferedReader(file);    

            Map<String, Integer> hmap = new HashMap<>();

            String line;
            while ((line = br.readLine()) != null) {
            
                String[] words = line.split(",");
                for (String word : words) {
                    hmap.put(word, hmap.getOrDefault(word, 0) + 1);
                }
            }

            PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue())
            );

            maxHeap.addAll(hmap.entrySet());

            System.out.println("Top 3 Repeated Words:");
            for (int i = 0; i < 3 && !maxHeap.isEmpty(); i++) {
                Map.Entry<String, Integer> entry = maxHeap.poll();
                System.out.println(entry.getKey() + " : " + entry.getValue() + " times");
            }

            br.close();
        }
        catch(IOException exception){

        }
    }
}
