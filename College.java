package week3.day2;

public class College extends University{
	
	
	public  void ug()
	{
		System.out.println("?Unimplmented method of University");
	}

	public static void main(String[] args) {
	
		College objCollege = new College();
		objCollege.ug();

	}

}
