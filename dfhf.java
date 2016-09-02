package dh;

import java.util.Scanner;

public class dfhf {
	public static void main(String[]args){
		double a[];
		double max,min;
		a=new double[10];
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入十个数");
		for(int i=0;i<10;i++){
			a[i]=reader.nextInt();
		}
		max=min=a[0];
		for(int i=0;i<10;i++){
			if(a[i]>max)
			max=a[i];
			if(a[i]<min);
			min=a[i];
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
}

