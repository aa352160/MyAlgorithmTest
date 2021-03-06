package com.jh352160.algorithm;

/**
 * Created by jh352160 on 2016/10/14.
 *
 * 6. ZigZag Conversion
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 *
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class Convert {

    public static String convert(String s,int numRows){

        if (numRows==1){
            return s;
        }

        StringBuilder temp=new StringBuilder(s);
        StringBuilder convert=new StringBuilder();
        for (int i=1;i<=numRows;i++){
            if (i==1||i==numRows){
                for (int j = i-1; j < temp.length(); j+=((numRows-1)*2)) {
                    convert.append(temp.charAt(j));
                }
            }else{
                boolean isCenter=false;
                for (int j = i-1; j < temp.length();j+=isCenter?(numRows-i)*2:(i-1)*2) {
                    convert.append(temp.charAt(j));
                    isCenter=!isCenter;
                }
            }
        }
        return convert.toString();
    }

}
