package com.jh352160.algorithm;

/**
 * Created by jh352160 on 2016/10/11.
 *
 *3. Longest Substring Without Repeating Characters
 *
 *Given a string, find the length of the longest substring without repeating characters.
 *
 *Examples:
 *
 *Given "abcabcbb", the answer is "abc", which the length is 3.
 *
 *Given "bbbbb", the answer is "b", with the length of 1.
 *
 *Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        StringBuilder temp=new StringBuilder();
        String a="";
        for (int i = 0; i < s.length(); i++) {
            if(temp.indexOf(s.substring(i,i+1))==-1){
                temp.append(s.substring(i,i+1));
            }else{
                if (temp.length()>a.length()){
                    a=temp.toString();
                }
                temp=new StringBuilder(temp.substring(temp.indexOf(s.substring(i,i+1))+1)).append(s.substring(i,i+1));
            }
        }
        if (temp.length()>a.length()){
            a=temp.toString();
        }
        return a.length();
    }

}
