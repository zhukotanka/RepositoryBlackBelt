package Generics;

public class ParametrizedClass {
    public static void main(String[] args) {
//        Info <String> info1 = new Info <>("privet");
//        System.out.println(info1);
//        Info <Integer> info2 = new Info <>(123);
//        System.out.println(info2);
//
//        String s1 = info1.getValue();
//        Integer s2 = info2.getValue();
//        System.out.println(s1 + " " + s2);

//        Info<Bus> info3 = new Info <>(new Bus());
//
//        System.out.println(info3);
//        Bus b1= info3.getValue();

        Info<Integer> info4 = new Info <>(12);

        System.out.println(info4);
        Integer b2= info4.getValue();

        Info<Byte> info5 = new Info <>((byte)14);

        System.out.println(info5);
        Byte b3= info5.getValue();

    }

//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }




}

class Info <T extends Number >{
    private T value;
    public Info(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{ " +
                "value = " + value +
                '}';
    }

    public  T getValue(){
        return value;
    }
}

interface I1{}
interface I2{}

//class Parent{
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//}

//class Child extends Parent{
//    public void abc(Info<Integer> info){
//        Integer s = info.getValue();
//    }
//}

class Bus{}
