package ca.vanier;
 
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        int flag = 0;
        int i;
        ArrayList<CarPojo> cars = new ArrayList<>();
 
        for (i = 0; flag == 0; i++) {
            System.out.println("Enter car model,brand,year");
            cars.add(new CarPojo(args[i], args[i++], Integer.parseInt(args[i + 2])));
            System.out.println("do you want to add car if yes press 0 if no press 1");
            flag = Integer.parseInt(args[i + 3]);
        }
        System.out.println("Saving to database....");
 
    }
}