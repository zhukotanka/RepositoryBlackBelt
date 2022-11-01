package Collections.Map.HashMap;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;

public class hashMapExmp1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap <>();
        map1.put(53546, "Zaur Tregulov");
        map1.put(13430, "Ivan Ivanov");
        map1.put(4546, "Maria Sidoriva");
        map1.put(790898, "Nikolai Petrov");
        map1.putIfAbsent(null, "Nikolai Reptile");
        System.out.println(map1);
        System.out.println(map1.get(null));
        System.out.println(map1.get(324354));
        map1.remove(13430);
        System.out.println(map1);
        System.out.println(map1.containsValue("Zaur Tregulov"));
        System.out.println(map1.containsValue("Oleg Tregulov"));
        System.out.println(map1.containsKey(4546));
        System.out.println(map1.containsKey(13430));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        //System.out.println(map1.entrySet());
        
    }
}
