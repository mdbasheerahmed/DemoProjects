package com.basheer.java8;

public class Test {

 
		    public static boolean isSubsequence(String s, String t) {
		        int m = s.length();
		        int n = t.length();

		        int i = 0;
		        for (int j = 0; j < n; j++) {
		            if (s.charAt(i) == t.charAt(j)) i++;
		            if (i == m) return true;
		        }
		        return false;
		    }

		    public static void main(String[] args) { 
		        String s = "babgbag";
		        String t = "bag";
		        System.out.println(isSubsequence(s, t));
		    }

		


}
