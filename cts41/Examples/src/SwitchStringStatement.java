
public class SwitchStringStatement {

	public static void main(String[] args) {
		String color ="blue";
		String shirt ="shirt";
		switch (color)
		{
		case "blue":
			shirt="blue"+shirt;
			break;
		case"red":
			shirt ="red"+shirt;
			default:
				shirt="white"+shirt;
		}
		System.out.println("shirt type:"+shirt);
	}

}
