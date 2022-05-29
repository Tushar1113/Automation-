package string_all;

public class Reverse_ByWord 
{
  public static void main(String[] args) 
  {
	 String a= "Mountain is Blue";
	 String b[]= a.split(" "); //indexing with reference of spaces
	 for (int i=b.length-1;i>=0;i--)//reversing words
	 {
		System.out.print(b[i]+" "); 
	 }
}
}
