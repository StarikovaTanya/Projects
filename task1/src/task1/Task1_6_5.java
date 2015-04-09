package task1;

import java.util.Scanner;

public class Task1_6_5 {
	public static void main(String[] args){
		System.out.print("Сколько целых чисел вы собираетесь ввести? ");
		   Scanner scan = new Scanner(System.in);
		     int razmer = scan.nextInt();
		     if (razmer  == 0) {
		         System.out.print("Программа завершена.");
		         System.exit(0);}
				System.out.println("Введите chisla  и нажмите <Enter>: ");
			for(int i=0;i<razmer;i++){
				int number = scan.nextInt();
				if(number/100!=(number%100/10)&(number%100/10)!=(number%100%10/10)&(number/100!=number%100%10/10))
					System.out.println(" podhodit");
				else System.out.println(" ne podhodit");
			
			}
	}

}
