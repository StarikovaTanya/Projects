package task1;

import java.util.Scanner;

public class Task1_6_3 {
	
	public static void main(String[] args){
	 System.out.print("Сколько целых чисел вы собираетесь ввести? ");
     Scanner scan = new Scanner(System.in);
     int razmer = scan.nextInt();
     if (razmer  == 0) {
         System.out.print("Программа завершена.");
         System.exit(0);}
	
	System.out.println("Введите chisla  и нажмите <Enter>: ");
			Integer[] number=new Integer[razmer];
	for(int i=0; i<razmer;i++){
		number[i]=scan.nextInt();
		if((number[i] %3)==0|(number[i] %9)==0)	
			System.out.println("делятся");
		else System.out.println("no делятся");
}
}}