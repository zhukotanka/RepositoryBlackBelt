package Generics;

import java.util.ArrayList;

public class ParameterizedMethod <T>{

    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList <>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(5);
        GenMethod genMethod = new GenMethod();


        System.out.println(genMethod.getSecondElement(arrayList));
    }
}

class GenMethod {
    public <T> T getSecondElement(ArrayList <T> arrayList){
        return arrayList.get(1);
    }
}