//package Collections.MethodsEqualsAndHashCode;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Objects;
//
//public class EqualsExmpl1 {
//    public static void main(String[] args) {
//        Car car1 = new Car("BMW", 60000, "Black");
//        Car car2 = new Car("AUDI", 55000, "Green");
//        Car car3 = new Car("MERCEDES", 80000, "Black");
//        Car car4 = new Car("OPEL", 23000, "White");
//        Car car5 = new Car("BMW", 60000, "Pink");
//        Car car6 = new Car("BMW", 60001, "Black");
//        ArrayList<Car> carArrayList = new ArrayList <>();
//        carArrayList.add(car1);
//        carArrayList.add(car2);
//        carArrayList.add(car3);
//        carArrayList.add(car4);
//        carArrayList.add(car5);
//        carArrayList.add(car6);
//        System.out.println(carArrayList);
//
//        System.out.println("|------------Overrided Equals------------|");
//        System.out.println(car1.equals(car2));
//        System.out.println(car1.equals(car6));
//        System.out.println("|------------Comparable------------|");
//        Collections.sort(carArrayList);
//        System.out.println(carArrayList);
//        System.out.println("|------------Comparator------------|");
//        Collections.sort(carArrayList, new sortByPrice());
//        System.out.println(carArrayList);
//
//    }
//}
//
//class Car implements Comparable <Car>{
//    String name;
//    int price;
//    String color;
//
//    public Car(String name, int price, String color) {
//        this.name = name;
//        this.price = price;
//        this.color = color;
//    }
//
//    public String toString(){
//        return "| Name: " + name + " | Price: " + price + " | Color: " + color + " | " + "\n";
//    }
//
//    //@Override
//    public boolean equals(Object auto) {
//        Car car = (Car) auto;
//        boolean res = false;
//        if (this.name.equals(car.name) && this.price==car.price && color.equals(car.color)) {
//            res = true;
//        }
//
//        return res;
//    }
//
//
//    @Override
//    public int compareTo(Car car) {
//        return this.price-car.price;
//    }
//}
//
//class sortByPrice implements Comparator <Car>{
//
//    @Override
//    public int compare(Car car1, Car car2) {
//        return car2.price-car1.price;
//    }
//}
