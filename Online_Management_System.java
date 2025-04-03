abstract class Product{
String productId;
String name;
double price;
public Product(String productId,String name,double price){
this.productId=productId;
this.name=name;
this.price=price;
}
abstract double calculateDiscountedPrice();
public void displayDetails(){
System.out.println("ProductID:"+productId);
System.out.println("Name:"+name);
System.out.println("Original price:$"+price);
System.out.println("Discounted price:$"+calculateDiscountedPrice());
}
}
class Electronics extends Product{
public Electronics(String productId,String name,double price){
super(productId,name,price);
}
double calculateDiscountedPrice(){
return price*0.90;
}
}
class Clothing extends Product{
public Clothing(String productId,String name,double price){
super(productId,name,price);
}
double calculateDiscountedPrice()
{
return price*0.85;
}
}
public class OnlineShoppingSystem{
public static void main(String[]args){
Product laptop=new Electronics("419","laptop",2000);
Product tshirt=new Clothing("194","T-shirt",500);
laptop.displayDetails();
tshirt.displayDetails();
}
}
----------------------------------------------------------
OUTPUT
Exam ID: 51
Subject: Maths
Total Marks: 89.0
Result:  pass
Exam ID: 52
Subject: Physics
Total Marks: 90.0
Result:  pass
------------------------------------------------------------
