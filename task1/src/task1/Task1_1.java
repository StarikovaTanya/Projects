package task1;
import java.util.Scanner;

public class Task1_1 {
	public static void main(String[] args){
		System.out.println("Введите Ваше имя и нажмите <Enter>: ");
		Scanner scan=new Scanner(System.in);
					String name= scan.next();
					for (String a: args)
		System.out.println(a+" "+name+"!");
				scan.close();
				
	}

}
