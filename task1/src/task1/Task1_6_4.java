package task1;

import java.util.Scanner;

public class Task1_6_4 {
	public static void main(String[] args){
		 System.out.print("������� ����� ����� �� ����������� ������? ");
	   Scanner scan = new Scanner(System.in);
	     int razmer = scan.nextInt();
	     if (razmer  == 0) {
	         System.out.print("��������� ���������.");
	         System.exit(0);}
		
		System.out.println("������� chisla  � ������� <Enter>: ");
				Integer[] number=new Integer[razmer];
		for(int i=0; i<razmer;i++){
			number[i]=scan.nextInt();
			if((number[i] %5)==0&(number[i] %7)==0)	
				System.out.println("�������");
			else System.out.println("ne �������");
	}

}}
