import java.util.Scanner;
import net.codeJava.swing.OutputStuff;
public class IndependenceDriver {
	public static void main (String[] args){
		//sends outputs to a window rather than the console
		OutputStuff.openWindow();
		//intro text
		System.out.println("The Collatz Conjecture or 3n+1 Conjecture States:");
		System.out.println("Take any positive integer.");
		System.out.println("If it's even, divide by 2; if it's odd, multiply by 3 and then add 1.");
		System.out.println("It is said that this will always, eventually, result in 1.");
	System.out.println("Is it true? Enter a number and we'll find out!");
	Scanner scan = new Scanner(System.in);
	int start = scan.nextInt();//gets start value from user
	int count = 0;//sets up a count of how many steps the solving takes
	int working = start;//sets up a separate working variable, because we will need the start value later.
	System.out.println(start);
	while(working > 0){
	if (working == 1){//ends the program when the number becomes 0
		System.out.println("True for " + start);
		System.out.println("There were " + count + " steps.");
		working = working*0;
	}else{
		if(working < 0){//ends the program if the number becomes less than zero. This should not happen.
		System.out.println(working);
		System.out.println("I wasn't expecting this.");
		System.out.println(start + " has disproved the conjecture.");
		}else{//and now the actual solving
			if(working % 2 == 0){//if it's even...
				working = working/2;
				count++;
				System.out.println(working);
			}else{//if it's odd...
				working = working*3;
				working = working+1;
				count++;
				System.out.println(working);
			}
	}
	}
	}
	}
}
