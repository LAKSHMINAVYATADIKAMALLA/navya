import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collector;

class Product2
{
int id;
String name;
double price;
public Product2(int id, String name, double price)
{
super();
this.id = id;
this.name = name;
this.price = price;
}
@Override
public String toString()
{
return "Product2 [id=" + id + ", name=" + name + ", price=" + price + "]";
}

}
public class MaxUserDefined {


public static void main(String[] args) {
// TODO Auto-generated method stub
Product2 p1=new Product2(1001,"Apple",5000);
Product2 p2=new Product2(1002,"Sony",4000);
Product2 p3=new Product2(1003,"Voltos",2000);
Product2 p4=new Product2(1004,"MI",10000);
Product2 p5=new Product2(1005,"Apple",50000);
Product2 p6=new Product2(1006,"Apple",9000);
Product2 p7=new Product2(1007,"Apple",6000);
Product2 p8=new Product2(1008,"Sony",40600);
Product2 p9=new Product2(1009,"Sony",40060);
Product2 p10=new Product2(10010,"Sony",8000);
ArrayList<Product2> products=new ArrayList<Product2>();
products.add(p1);
products.add(p2);
products.add(p3);
products.add(p4);
products.add(p5);
products.add(p6);
products.add(p7);
products.add(p8);
products.add(p9);
products.add(p10);

Product2 p=products.stream()
.filter(a->a.name=="Apple")
.map(a->a)
.min((Product2 a,Product2 b)->a.price<b.price?-1:1)
.get();
System.out.println(p);

/*Product2 q=products.stream()
.max((Product2 a,Product2 b)->a.price<b.price?-1:1)
.get();
System.out.println(q);*/

}

}

