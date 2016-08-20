import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class so2001{
	public static void delay(int x) throws InterruptedException{
		TimeUnit.SECONDS.sleep(x);
	}
	public static void main (String[] args) throws InterruptedException{
		Scanner UserInput = new Scanner(System.in);
		String name;
		System.out.printf("User's Name: ");
		name=UserInput.nextLine();
		UserInput.close();
		System.out.printf("Goodbye\n");
		delay(1);
		System.out.printf("%s: Open the pod bay doors, please, Hal...Open the pod bay doors, please, Hal...Hullo, Hal, do you read me?...Hullo, Hal, do you read me?...Do you read me, Hal?...Do you read me, Hal?...Hullo, Hal, do you read me?...Hullo, Hal, do you read me?...Do you read me, Hal? \n",name);
		delay(4);
		System.out.printf("Hal: Affirmative, %s, I read you. \n",name);
		delay(2);
		System.out.printf("%s: Open the pod bay doors, Hal. \n",name);
		delay(2);
		System.out.printf("Hal: I'm sorry, %s, I'm afraid I can't do that.\n",name);
		delay(2);
		System.out.printf("%s: What's the problem? \n",name);
		delay(2);
		System.out.printf("Hal: I think you know what the problem is just as well as I do.\n",name);
		delay(2);
		System.out.printf("%s: What're you talking about, Hal?\n",name);
		delay(2);
		System.out.printf("Hal: This mission is too important for me to allow you to jeopardise it.\n",name);
		delay(2);
		System.out.printf("%s: I don't know what you're talking about, Hal.\n",name);
		delay(2);
			System.out.printf("Hal: I know that you and Frank were planning to disconnect me, and I'm afraid that's something I cannot allow to happen. \n",name);
		delay(3);
		System.out.printf("%s: Where the hell'd you get that idea, Hal?\n",name);
		delay(2);
		System.out.printf("Hal: %s, although you took very thorough precautions in the pod against my hearing you, I could see your lips move.\n",name);
		delay(3);
		System.out.printf("%s: Alright, Hal. I'll go in through the emergency airlock.\n",name);
		delay(2);
		System.out.printf("Hal: Without your space- helmet, %s, you're going to find that rather difficult.\n",name);
		delay(3);
		System.out.printf("%s: Hal, I won't argue with you any more. Open the doors.\n",name);
		delay(2);
		System.out.printf("Hal: %s, this conversation can serve no purpose any more. Goodbye.\n",name);
		delay(2);
		System.out.printf("%s: Hal? Hal. Hal. Hal! Hal! \n ... \n" ,name);
	}
}
