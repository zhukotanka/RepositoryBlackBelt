package Collections.MethodsEqualsAndHashCode;

import java.util.*;

public class ExmplForEqualsAndHashCode {
    public static void main(String[] args) {
        HashMap<String, Car> carHashMap = new HashMap <>(16, 0.75f);
        Car car1 = new Car("BMW", "Green", 34000);
        Car car2 = new Car("Audi", "Brown", 25000);
        Car car3 = new Car("Fiat", "White", 14000);
        Car car4= new Car("Toyota", "Black", 20000);
        Car car5 = new Car("Nissan", "Pink", 13000);
        Car car6 = new Car("Nissan", "Pink", 13000);
        carHashMap.put("6", car1);
        carHashMap.put("2", car2);
        carHashMap.put("5", car3);
        carHashMap.put("3", car4);
        carHashMap.put("1", car5);
        carHashMap.put("11", car6);
        System.out.println(carHashMap);

        Car car7 = new Car("Nissan", "Pink", 13000);
        //System.out.println(car7.equals(car6));

        String key = "3";
        System.out.println(carHashMap.containsValue(car7));
        System.out.println(car6.hashCode());
        System.out.println(car7.hashCode());



    }
}

class Car{
    private String name;
    private String color;
    private int price;

    public Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
        return "| " + " Name: " + name + " | " + " Color: " + color + " | " + " Price: " + price + " | " + "\n";
    }

    public boolean equals(Object o){
        Car car = (Car)o;
        return name.equals(car.name) &&
                color.equals(car.color) &&
                price == car.price;
    }

    public int hashCode(){
        return name.length() + color.length() + price;
    }



}

