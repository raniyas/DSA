//Problem -> For given String consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

import java.io.*;

public class LongestPlaindrome {

	public static void main(String[] args) throws IOException {
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter a string");
				String s = input.readLine();
		        int[] count = new int[128];
		        for (char c: s.toCharArray())
		            count[c]++;

		        int result = 0;
		        for (int v: count) {
		            result += v / 2 * 2;
		            if (result % 2 == 0 && v % 2 == 1)
		                result++;
		        }
		        System.out.println(result);
		

	}

}
