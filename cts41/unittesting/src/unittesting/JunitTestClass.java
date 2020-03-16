package unittesting;



public class JunitTestClass 
{
	@BeforeAll
	public void beforeClassBegins()
	{
		System.out.println("this method will be execute before begining of the class");
	}
	@Test
	public void test2()
	{
		System.out.println("this is test case2");
	}
	@BeforeEach
	public void preMethod()
	{
		System.out.println("this is premethod...");
	}
	@Test
	public void test1()
	{
		System.out.println("this is unittesting");
	}

	@AfterEach
	public void postMethod()
	{
		System.out.println("this will be execute");
	}
	

}
