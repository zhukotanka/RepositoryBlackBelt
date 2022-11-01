package Collections.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExmp {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList <>();
        arrayList.add("Zaur");
        arrayList.add("Vova");
        arrayList.add("Kate");
        arrayList.add("Bublik");
        arrayList.add("Sasha");

        Iterator <String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList);
    }
}
