package string_all;

import java.util.Arrays;

public class Array_Duplicate 
{
  public static void main(String[] args) 
  {
	 int a[]= {12,24,45,36,34,23,24};
	 Arrays.sort(a);
	 
	 for (int i=0;i<a.length;i++)
	 {
		 int b=a[i];
		 int counter=0;
		  
		 for (int j=0;j<a.length;j++)
		 {
			 if(b==a[j])
			 {
				counter++; 
			 }
		 }
		if (counter>1)
		{
			System.out.println("Duplicate No:" + a[i]);
			break;
		}
	 }
	 
}
}
