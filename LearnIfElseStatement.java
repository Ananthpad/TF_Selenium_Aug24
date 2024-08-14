package week1.day2;

public class LearnIfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int marks=20;
       
        if (marks>40) {
        	System.out.println(" you are in grade C");
        	
		}else if (marks>30) {
			System.out.println("you are in grade B");
		}else if (marks>50) {
			System.out.println("you are in grade A");
		}else {
			System.out.println("you are in grade O"); 
		}
        
	}

}
