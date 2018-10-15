package MainPackage;

import java.util.Scanner;

public class Zadacha2 {
    public static int digitsCount(int number){
        int count=0;
        while(number!=0){
            number/=10;
            count++;
        }
        return count;
    }
    public static void func(){
        System.out.print("Number: ");
        Scanner S=new Scanner(System.in);
        int number;
        number=S.nextInt();
        while(digitsCount(number)!=5){
            System.out.print("Number: ");
            number=S.nextInt();
        }
        S.close();
        int[] digits=new int[5];
        for(int i=0; i<5;i++){
            digits[i]=number%10;
            number/=10;
        }
        if(digits[0]==digits[4]){
            System.out.println("1st and 5th are equal!");
        }else{
            System.out.println("1st and 5th are not equal!");
        }
        if(digits[1]==digits[3]){
            System.out.println("2nd and 4th are equal!");
        }else{
            System.out.println("2nd and 4th are not equal!");
        }
    }
    public static boolean isPolindrome(String src){
        char[] helper;
        helper = src.toCharArray();
        boolean flag = true;
        for (int i = 0; i < helper.length / 2; i++) {
            if (helper[i] != helper[helper.length-1 - i]) {
                flag = false;
            }
        }
        return flag;
    }
}
