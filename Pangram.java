import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
	public static void main(String[] args) throws java.lang.Exception
	{

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = in.readLine();
		s = s.toLowerCase();
		for (char c = 'a'; c <= 'z'; c++)
		{
		    if (s.indexOf(c) == -1)
		    {
		        System.out.println("Not Pangram");
		        return;
		    }
		}
		System.out.println("Pangram");
	}
}
