package string_all;

public class Remove_Spaces 
{
 public static void main(String[] args) 
 {
   String a= "Let the sun shine";
   String b=a.replaceAll("\\s", "");
   System.out.println(b);
}
}
