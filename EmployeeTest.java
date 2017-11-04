import java.util.Scanner;

class EmployeeTest {
	   static void  employeeAge(int age) throws MyOwnException{
	      if(age < 0)
	         throw new MyOwnException("Age can't be less than zero");
	      else
	         System.out.println("Input is valid!!");
	   }
	   public static void main(String[] args)throws Exception
	   {
		 
		   Scanner sc=new Scanner(System.in);
		   String s="yes";
		   boolean b=true;
		   b=s.equals(sc.next());
		   while(b)
		   {
	       try {
	            employeeAge(sc.nextInt());
	       }
	       catch (MyOwnException e) 
	       {
	            e.printStackTrace();
	       }
	       finally
	       {
	    	   try{
	    	sc.close(); 
	    	   }
	    	   catch(Exception e)
	    	   {}
	       }
	       }
	   }}