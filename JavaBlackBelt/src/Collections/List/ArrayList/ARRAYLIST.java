package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

//------------------СПОСОБЫ СОЗДАНИЯ ARRAYLIST-----------------------//
public class ARRAYLIST{
    public static void main(String[] args) {
        ArrayList <String> arrayList1 =  new ArrayList<String>();
        arrayList1.add("Arthur");
        arrayList1.add("Tanya");
        System.out.println(arrayList1);

        ArrayList <String> arrayList2 =  new ArrayList<>();
        arrayList2.add("Arthur");
        arrayList2.add("Tanya");
        System.out.println(arrayList2);

        ArrayList <String> arrayList3 =  new ArrayList<>(40);
        arrayList3.add("Arthur");
        arrayList3.add("Tanya");
        System.out.println(arrayList3);

        List <String> arrayList4 =  new ArrayList<>();
        arrayList4.add("Arthur");
        arrayList4.add("Tanya");
        System.out.println(arrayList4);

        List <String> arrayList5 =  new ArrayList<>(arrayList4);

        System.out.println(arrayList5);

    }

}


