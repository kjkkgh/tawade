package demo;

import java.util.Scanner;

public class WhiteSpaces {
public static void main(String[] args) {
	//String s1=" p u n e ";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string with spaces:");
	String s1=sc.nextLine();
	int count=0;
	String s2="";
	String s3="";
	for(int i=0;i<=s1.length()-1;i++) {
		char v=s1.charAt(i);
		if(v==' ') {
			count++;
			 s2=s1.replace(" ","");
		}
	}
	s3=s3+s2;
	System.out.println(s3);
	System.out.println(count);
}
}
