package week3.day2;

public class Students {

	int sRoll=0;
	String sName;
	String sEmail;
	Long sPhone;
	
	
	public void getStudentInfo()
	{
		System.out.println("Student id" + " " + sRoll);
		System.out.println("Student name " + " " + sName);
		System.out.println("Student email " + " " + sEmail);
		System.out.println("Student phone " + " " + sPhone);
	}
	public void getStudentInfo(int roll,String name, String email)
    {
		sRoll=roll;
		sName =name;
		sEmail =email;
		System.out.println("Student id" + " " + sRoll);
		System.out.println("Student name " + " " + sName);
		System.out.println("Student email " + " " + sEmail);
		
    }
	
	public void getStudentInfo(int roll,String name)
    {
		sRoll=roll;
		sName =name;
		
		System.out.println("Student id" + " " + sRoll);
		System.out.println("Student name " + " " + sName);
		
    }
	
	public void getStudentInfo(String name, String email)
    {

		sName =name;
		sEmail =email;
		System.out.println("Student name " + " " + sName);
		System.out.println("Student email " + " " + sEmail);
		
    }
	public void getStudentInfo(Long phone,String email)
    {
		sPhone=phone;
		sEmail =email;
		System.out.println("Student phone" + " " + sPhone);
		System.out.println("Student email " + " " + sEmail);
		
    }
	
	
	
	
	
	public static void main(String[] args) 
	{
		Students objStudent =new Students();
		objStudent.getStudentInfo();
		objStudent.getStudentInfo(12, "Preethi");
		objStudent.getStudentInfo("Preethi", "preethi.ischool@gmail.com");
		objStudent.getStudentInfo(13, "Sannidhi", "Sannidhi.Kootgal@gmail.com");
		
		objStudent.getStudentInfo(9535347755L, "preethi.ischool@gmail.com");
		
	}

}
