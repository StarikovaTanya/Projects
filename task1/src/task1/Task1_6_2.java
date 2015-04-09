package task1;

import java.util.Scanner;

public class Task1_6_2 {
	public static void main(String[] args){


			 System.out.print("Сколько целых чисел вы собираетесь ввести? ");
		     Scanner scan = new Scanner(System.in);
		     int razmer = scan.nextInt();
		     if (razmer  == 0) {
		         System.out.print("Программа завершена.");
		         System.exit(0);}
			
			System.out.println("Введите chisla  и нажмите <Enter>: ");
					Integer[] number=new Integer[razmer];
					int min=9999, max=0;
			for(int i=0; i<razmer;i++){
				number[i]=scan.nextInt();
				if (max < number[i]) max = number[i];
				if (min > number[i]) min = number[i];}
				
		
	System.out.println("Max: "+max);
	System.out.println("Min: "+min);
		

	}
}
