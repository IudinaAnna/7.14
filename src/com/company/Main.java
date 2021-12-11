package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static int Product(int...a) {
        System.out.print("Аргументы: ");
        for(int i:a)
            System.out.print(i + " ");
        System.out.println();
        int result=1;
        for(int i=0;i<a.length;i++)
        {
            result*=a[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Произведение 1: "+Product(1,2));
        System.out.println("Произведение 2: "+Product(2,4,6));
        System.out.println("Произведение 3: "+Product(10,1,8,3));
    }
}
