package west;

import java.util.*;

public class Rester
{

	public static void main(String[] args){
	    Scanner inp=new  Scanner(System.in);
	    System.out.println("enter name one:");
	    String n1=inp.nextLine();
	    System.out.println("enter name two:");
	    String n2=inp.nextLine();
	    int a=n1.length();
	    int b=n2.length();
	    int i=1;
	    int j=b;
	    int k=a;
	    int count=0;
	    while(i<=a) {

	        if (n1.substring(0, i) == n2.substring(j - 1, b)) {
	        	System.out.println((n2.substring(0, b))+(n1.substring(i, a)));
	            count++;
	        } else if (n2.substring(0, i) == n1.substring(k - 1, a)) {
	        	System.out.println((n1.substring(0, a))+(n2.substring(i, b)));
	            count++;
	        }


	        j--;
	        i++;
	        k--;
	    }
	    if(count==0){
	    	System.out.println(n1+n2);

	    }
	    else{
	        System.exit(0);
	    }
	    }

}
