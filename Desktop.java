package week3.day2;

public class Desktop implements Hardware,Software{
	
	public void desktopModels()
	{
		System.out.println("Desktop model");
	}
	
	public void hardwareResources()
	{
		System.out.println("Hardware resources");
	}
	public void softwareResources()
	
	{
		System.out.println("Software resources");
	}
	

	public static void main(String[] args) 
	{
		Desktop objDeskTop = new Desktop();
		objDeskTop.desktopModels();
		objDeskTop.hardwareResources();
		objDeskTop.softwareResources();
		

	}

}
