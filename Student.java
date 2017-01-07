import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;


public class Student {
	
	Scanner s=new Scanner(System.in);
	 BufferedReader br = new BufferedReader(
             new InputStreamReader(System.in));
	 String n;
	 int c;
	 String grade;
	void read(){
		System.out.println("enter name:");
		n=s.nextLine();
		System.out.println("enter class:");
		c=s.nextInt();
		System.out.println("enter grade:");
		try {
			grade=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

void dispay()
{
System.out.println("\nNAME:"+n+"\nCLASS:"+c+"\nGRADE:"+grade+"\n");	
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of students :");
		int n=s.nextInt();
		Student[] p=new Student[n];
		
		for(int i=0;i<=n;i++)
		{
			p[i] = new Student(); 
			p[i].read();
			p[i].dispay();
		}
		
		
	}}
