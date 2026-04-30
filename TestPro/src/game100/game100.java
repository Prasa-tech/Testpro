package game100;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class game100 {
	public static void main(String[] args) {
		byte myAge=30;
		byte herAge=myAge;
		//long viewscount=3_123_456_789L;
		float price=10.99F;
		Date now = new Date();
		System.out.println(now);
		System.out.println(herAge);
		
		byte x=1;
		byte y=x;
		Point point1= new Point();
		Point point2=point1;
		point1.x=2;
		
		System.out.println(point2);
		System.out.println("how is the weather?");
		
		String message = "Hello World" + "!!";
		System.out.println(message.indexOf("l"));
		
		
		System.out.println(message.replace("!","*"));
		System.out.println(message.toLowerCase());

		int[] numbers= {5,3,2,2,1};
		System.out.println(numbers.length);
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		//int[] [] [] rays= new int[5][2][3];
		//>>int [][][] rays= {[1,2,3],[2,3,4],[4,5,6]};
		//	System.out.println(Arrays.deepToString(rays));
		
		int yx =2;
		yx +=2;
		System.out.println(yx);
		
		int yxx=10+3*2;
		System.out.println(yxx);
		
		double hay=1.1;
		int hax =(int)hay+2;  //casting
		System.out.println(hax);
		
		String lax ="1.1";
		double lay = Double.parseDouble(lax) + 2;
		System.out.println(lay);
		
		double result = Math.random()*100;
		System.out.println(result);
		
		
		String res = NumberFormat.getPercentInstance().format(0.1);
		System.out.println(res);
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("Name: ");
		String name = scanner.nextLine().trim();
		System.out.println("You are " +name);
		
		
		
		
	}

}
