import java.util.HashSet;
import java.util.Set;

public class HelloWorld{

     public static void main(String []args){
        
         Car car1 = new Car("Honda City");
         Car car2 = new Car("Honda Amaze");
         
         Set<Car> cars = new HashSet<Car>();
         cars.add(car1);
         
         System.out.println("Car 1 hashcode: "+ car1.hashCode());
         System.out.println("Car 2 hashcode: "+ car2.hashCode());
         
         System.out.println("Set contains object : "+cars.contains(car2));
         
     }
}
