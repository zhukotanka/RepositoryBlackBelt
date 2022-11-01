package Collections.List.Vector;

import java.util.Vector;

public class VectorExmpl1 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector <>();
        vector.add("Petya");
        vector.add("Misha");
        vector.add("Oleg");
        vector.add("Kate");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.get(2));
        vector.remove("Misha");
        System.out.println(vector);
    }
}
