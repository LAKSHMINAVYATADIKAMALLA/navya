/*
	abstract class Market
	{
	abstract public void payment();
	abstract public void implementSecurityforOnline();
	public void selectProducts()
	{
		System.out.println("goods are selected as per base company rules");
	}
	public void shipmentOfGoods()
	{
		System.out.println("goods will delivered as per base co,pamy rules");
	}

}
class Market1  extends abstractMarket{
	public void payment()
	{
		System.out.println("cash payment only..");
		
	}
	public void insuranceOnproducts()
	{
		System.out.println("insurance is also provided");
		
	}
	public void implementSecurityforOnline()
	{
		System.out.println("no online security is given");
	}
}
class Market2 extends abstractMarket
{
	public void payment()
	{
		System.out.println("UPI payments only");
	}
	public void implementSecurityforOnline()
	{
		System.out.println("cash is provided");
	}
}
public class TestabstractMarket  
{
	public static void main(String[]args)
	{
		Market1=new Market1();
		m1.payment();
		m1.insuranceOnproducts();
		m1.implementSecurityforOnline();
		Market2=new Market2();
		m2.payment();
		m2.implementSecurityforOnline();
		
	}
}
*/
