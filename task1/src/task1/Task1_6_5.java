package task1;

import java.util.Scanner;

public class Task1_6_5 {
	public static void main(String[] args){
		System.out.print("������� ����� ����� �� ����������� ������? ");
		   Scanner scan = new Scanner(System.in);
		     int razmer = scan.nextInt();
		     if (razmer  == 0) {
		         System.out.print("��������� ���������.");
		         System.exit(0);}
				System.out.println("������� chisla  � ������� <Enter>: ");
			for(int i=0;i<razmer;i++){
				int number = scan.nextInt();
				if(number/100!=(number%100/10)&(number%100/10)!=(number%100%10/10)&(number/100!=number%100%10/10))
					System.out.println(" podhodit");
				else System.out.println(" ne podhodit");
			
			}
	}

}
