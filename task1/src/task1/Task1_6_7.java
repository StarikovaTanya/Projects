package task1;

import java.util.Scanner;

public class Task1_6_7 {
	public static void main(String[] args){
		System.out.print("������� ����� ����� �� ����������� ������? ");
		   Scanner scan = new Scanner(System.in);
		     int razmer = scan.nextInt();
				System.out.println("������� chislo  � ������� <Enter>: ");
				Integer[] number=new Integer[razmer];
				for(int j=0;j<number.length;j++)
					number[j]=scan.nextInt();
				for(int i=1;i<number.length-1;i++){
					if(number[i]==(number[i-1]+number[i+1])/2)
						System.out.println(number[i]);
					
				}
}
}
