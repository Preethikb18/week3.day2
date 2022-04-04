package week3.day2;

public class Automation extends MultipleLangauge implements Language,TestTool{
	
	public  void ruby()
	{
		System.out.println("Ruby language");
	}
	
	public void Java()
	{
		System.out.println("Java language");
	}
	
	public void Selenium()
	{
		System.out.println("Selenium language");
	}

	public void python()
	{
		System.out.println("Python language of  Automation");
	}
	public static void main(String[] args)
	{
		Automation objAutomation = new Automation();
		objAutomation.Java();
		objAutomation.Selenium();
		objAutomation.ruby();
		objAutomation.python();
		
		
	}

}
