package task1;
import java.util.Scanner;
public class Task1_4 {
	public static void main(String []args){
		System.out.println("������� ������");
		Scanner scan=new Scanner(System.in);
		String s2= scan.next();
		for (String s1: args)
		{
			//System.out.println(s2);
		System.out.println(s1);
			if(s1.equals(s2))//��� �������� ==-��� ������
			System.out.println("verno!");
		else 
			System.out.println("ne verno!");
		scan.close();
	}
}}
