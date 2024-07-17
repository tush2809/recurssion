package com.codewithbabbar;

import java.util.Scanner;

import static java.util.Collections.emptyEnumeration;
import static java.util.Collections.swap;

public class RecursionsDay4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //String input = scanner.nextLine();
        //char[] inputCharArray =input.toCharArray();
        //reverseString(inputCharArray,0,input.length()-1);
        //System.out.println(checkPalindrome(inputCharArray,0,input.length()-1)? "Is Palindrome Number": "Is Not Palindrome Number");
        int number=scanner.nextInt();
        int power = scanner.nextInt();
        //System.out.println(calculateThePower(number,power,1));

        System.out.println(calculateThePowerOptimization(number,power));
    }

    static void reverseString(char[] input,int i, int j){
        if(i>j){
            return;
        }
       swap(input,i,j);
        i++;
        j--;
        reverseString(input,i,j);
    }

    static char[] swap(char[] input,int i,int j){
        char temp=input[j];
        input[j]=input[i];
        input[i]=temp;
        return input;
    }

    static boolean checkPalindrome(char[] input, int i, int j){
        if(i>j)
            return true;
        if(input[i]!=input[j]){
            return false;
        }
        i++;
        j--;
       return checkPalindrome(input,i,j);
    }


    static int calculateThePower(int a, int b,int power){
        if(b==0){
            return power;
        }
        power *= a;
        b--;
        return calculateThePower(a,b,power);
    }

    static int calculateThePowerOptimization(int a, int b){

        if (b==0) {
            return 1;
        }
        if(b==1){
            return a;
        }
        int ans = calculateThePowerOptimization(a,b/2);
        if(b%2==0){
            return ans * ans;
        }else {
            return a * ans * ans;
        }

    }

}
