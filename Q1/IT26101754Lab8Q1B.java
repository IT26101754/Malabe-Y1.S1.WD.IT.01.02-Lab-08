import java.util.Scanner;

     public class IT26101754Lab8Q1B {
	 
	     public static void main(String[] args) {
		 
		 int[] myArray = new int[5];
		 int[] evenArray = new int[5];
		 int Count = 0;
		 int i;
		 
		 Scanner Sc = new Scanner(System.in);
		 
		 System.out.println("Enter 5 Numbers : ");
		 
		 for ( i = 0; i < myArray.length; i++)  {
		 
		     System.out.print("Enter a number " + (i + 1)  + " : ");
	         myArray[i] = Sc.nextInt();
			 
		}
		
		
		for ( i = 0; i < myArray.length; i++) {
			if (myArray[i] % 2 == 0) {
				evenArray[Count] = myArray[i];
				Count++;
			}

        }			
        
		System.out.println();
        System.out.println("myArray contents  : " );
       
        for ( i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");

        }
        
		System.out.println();
		System.out.println("evenArray contents : " );
		
		for ( i = 0; i < evenArray.length; i++) {
			System.out.print(evenArray[i] + " ");
		
		}
 
        System.out.println();
 
    }

}