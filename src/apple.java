import java.util.Scanner; 
import java.util.Random;


public class apple {
	int firstn , secondn; void input() {

	    System.out.println("What range of numbers do you want?\n");
	    System.out.print("From : ");
	    Scanner fnum = new Scanner(System.in);
	    firstn = fnum.nextInt();
	    System.out.print("To : ");
	    Scanner snum = new Scanner(System.in);
	    secondn = snum.nextInt();

	}
	int getFirstNumber()
	{
	    return firstn;
	}
	int getSecondNumber()
	{
	    return secondn;
	}
	void random(int firstn , int secondn)
	{
	    int randomNumbers;
	    Random range = new Random();
	    randomNumbers = firstn + range.nextInt(secondn);

	    System.out.printf("Random number generated by the computer is %s" ,randomNumbers);


	}
}

