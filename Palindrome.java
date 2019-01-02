class Palindrome
{
  public static void main(String [] args){
    String str,rev="";
    str=args[0];
    int l=str.length();
    for(int i=l-1;i>=0;i--)
    rev=rev+str.charAt(i);
    if(str.equalsIgnoreCase(rev))
    System.out.println("The Entered Input is A Palindrome");
    else
    System.out.println("The Entered Input is not A Palindrome");
  }
}
