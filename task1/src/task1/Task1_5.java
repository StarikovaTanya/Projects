package task1;

public class Task1_5 {
	public static void main(String[] args){
		int sum=0;
		int pr=1;
		
		for (int i=0;i<args.length;i++)
		{		
			int perevod = Integer.parseInt(args[i]);
			System.out.print(args[i]+" ");
			sum=sum+perevod;
			pr=pr*perevod;}
			System.out.println("summa= "+sum);
			System.out.println("proizvedenie= "+pr);
		
	}

}
