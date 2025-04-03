abstract class Vehicle{
String vehicleNumber;
String brand;
double dailyRate;
public Vehicle(String vehicleNumber,String brand,double dailyRate){
this.vehicleNumber=vehicleNumber;
this.brand=brand;
this.dailyRate=dailyRate;
}
abstract double calculateRent(int days);
public void printDetails(int days){
System.out.println("Vehicle Number: "+vehicleNumber);
System.out.println("Daily Rate:$" +dailyRate);
System.out.println("Brand: "+brand);
System.out.println("Total Rent for"+days+"days:$"+calculateRent(days));
}
}
class Car extends Vehicle{
public Car(String vehicleNumber,String brand,double dailyRate){
super(vehicleNumber,brand,dailyRate);
}
double calculateRent(int days){
return(dailyRate*days)*0.90;
}
}
class Bike extends Vehicle{
public Bike(String vehicleNumber,String brand,double dailyRate){
super(vehicleNumber,brand,dailyRate);
}
double calculateRent(int days){
return(dailyRate*days)-0.1;
}
}
public class VehicleRent{
public static void main(String[]args){
Vehicle c1=new Car("419","BMW",13);
Vehicle b1=new Bike("194","yamaha",29);
System.out.println("car rental details: ");
c1.printDetails(5);
System.out.println("\nBike rental details: ");
b1.printDetails(5);
}
}
-------------------------------------------------------------------
OUTPUT
car rental details:
Vehicle Number: 419
Daily Rate:$13.0
Brand: BMW
Total Rent for5days:$58.5

Bike rental details:
Vehicle Number: 194
Daily Rate:$29.0
Brand: yamaha
Total Rent for5days:$144.9
---------------------------------------------------------------------
