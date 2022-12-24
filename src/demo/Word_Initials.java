package demo;

public class Word_Initials {
	public static void main(String[] args) {
		String s=" Rohit Sharma Mumbai";
		
		String a[]=s.split(" ");
		
		for(int i=0;i<a.length;i++) {
			//String s1=a[i];
			//System.out.print(s1.charAt(0)+" ");
			//System.out.print(a[i].charAt(0)+" ");
			if(i==0) {
				System.out.print(a[i].charAt(0)+" ");
			}
			else if(i==1) {
				System.out.print(a[i].charAt(0)+" ");
			}
			else {
				System.out.println(a[i]);
			}
			
			
		}
	}

}
