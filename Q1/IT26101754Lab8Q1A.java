import java.util.Scanner;

     public class IT26101754Lab8Q1A {
	 
	     public static void main(String[] args) {
		 
		 int numberArray[] = new int[5];
		 int i;
		 
		 Scanner Sc = new Scanner(System.in);
		 
		 System.out.println("Enter 5 Numbers : ");
		 
		 for ( i = 0; i < numberArray.length; i++)  {
		 
		     System.out.print("Enter a number " + (i + 1)  + " : ");
	         numberArray[i] = Sc.nextInt();
			 
		}

        System.out.println();
        System.out.println("Array in Reverse Order : " );

        for ( i = 4; i >= 0; i--) {
            System.out.print(numberArray[i] + " ");

        }
 
    }

}