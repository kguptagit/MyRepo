package week1Assignement;

public class Fibonnaci {

	public static void main(String[] args) {
	// 0,1,1,2,3,5,8,13
		//n1=n,n2=n+1,n3=n1+n2,n4=n2+n3
	int n1=0,n2=1,n3;
	int num=8;
	
	for(int i=1;i<=num;i++) {
		System.out.print(n1+", ");
		n3=n1+n2;
		n1=n2;
		n2=n3;
		
		
	}

	}

}
