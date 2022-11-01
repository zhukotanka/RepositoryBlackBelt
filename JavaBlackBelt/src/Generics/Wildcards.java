package Generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
    //    List <Number> list = new src <Integer>();
    //    List <Object> list = new src <Integer>();


        List <? super Number> list = new ArrayList <Object>();

        ArrayList <Double> list1 = new ArrayList <>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);


        ArrayList <Integer> list4 = new ArrayList <>();
        list4.add(31);
        list4.add(2);
        list4.add(4);
        showListInfo(list4);

        System.out.println(summ(list1));

        List <String> list2 = new ArrayList <>();
        list2.add("Ok");
        list2.add("Privet");
        list2.add("Poka");
        showListInfo(list2);

        System.out.println(summ(list4));
    }

    static public void showListInfo (List<?> list){
        System.out.println("Elements: " + list);

    }

    public static double summ(ArrayList <? extends Number> arrayList){
        double sum = 0;
        for (Number el: arrayList) {
            sum+=el.doubleValue();
        }
        return sum;
    }
}
