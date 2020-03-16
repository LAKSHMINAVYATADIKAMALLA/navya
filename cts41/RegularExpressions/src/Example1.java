import java.util.regex.Pattern;

public class Example1 
{
	public static void main(String[] args)
	{
		System.out.println(Pattern.matches("^(PRO[a-z]{4}[0-9]{3})$","PROappu017"));
		System.out.println(Pattern.matches("FIN[a-z]{4}[0-9]{3}","FINsiju254"));
		System.out.println(Pattern.matches("Test[a-z]{4}[0-9]{3}","Testakka247"));
		System.out.println(Pattern.matches("PRO[a-z]{4}[0-9]{3}","PROapu017"));
		System.out.println(Pattern.matches("FIN[a-z]{4}[0-9]{3}","FINsiju25"));
		System.out.println(Pattern.matches("Test[a-z]{4}[0-9]{3}","Tetakka247"));
		System.out.println(Pattern.matches("(#)[A-Fa-f0-9]{8}","#ffffffff"));
		System.out.println(Pattern.matches("(?=.*\\d)(?=.*[@#$]).{6,20}","123$#568"));
	}

}
