//Jason Chan 10/1/16 period 1

//original from programmer 2
//import java.util*
//	public class Goodluck{
//		public static void(string[] args
//			Scanner userinput = newScanner (system.in)
//			int total = scanner.nextInt();
//			int nextnum;
//			for int i = 1 <= totalnumber ; i++){
//				if (i % 2 = 0){
//					return i;
//					{
//					System.out.println("#" + i + "?")
//					double next = scanner next.double
//					sum += next;
//					}
// // :( i need to learn!

import java.util.*;
	public class Collab {
		public static void main(String[] args) {
			int nextNumEven = 0; 
			Scanner userInput = new Scanner(System.in);
				System.out.print("how many numbers? ");
				System.out.println();
			int totalNum = userInput.nextInt();
			int evenMax = 0;
			int allMax = 0; 
				System.out.print("enter " + (totalNum + 1) + " more numbers: ");
				System.out.println();
			int allMin = userInput.nextInt();
			for(int i = 1;i <= totalNum ; i++){
			int nextNum = userInput.nextInt();
				if(nextNum > allMax){
					allMax = nextNum;
				}
				if(nextNum < allMin){
					allMin = nextNum;
				}
				if(nextNum % 2 == 0){
					nextNumEven  = nextNumEven + nextNum; 
						if(nextNum>evenMax){
				evenMax = nextNum;
}
}
}
System.out.println("smallest number is: " + allMin);
System.out.println("largest number is: " +  allMax);
System.out.println("sum of the even numbers: " + nextNumEven);
System.out.println("largest even number is: " +  evenMax);

}
}



