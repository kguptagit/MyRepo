package week1Assignement;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0,temp;
		int num =121;
		temp=num;
while(num>0)
{
		int lastNum = num % 10;  //reminder>> last number
		num=num/10;              //will remove the last number
		result = result*10 + lastNum; //will concate the number from last number

	}

if(temp==result) {
System.out.println("Number is palindrome");
	}
else
	System.out.println("Number is not palindrome");
	
	
	
	}
	
	

}
