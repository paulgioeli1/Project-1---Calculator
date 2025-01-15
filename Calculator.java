/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author paulg
 */
public class Calculator {

    public static int addemup(int num1, int num2){
        return num1 + num2;
    }
    
    public static int subtractem(int num1, int num2){
        return num1 - num2;
    }
    
    public static int multiplyem(int num1, int num2){
        return num1*num2;
    }
    
    public static double divideem(double num1, double num2){
        if(num2 == 0){
            System.out.println("Divide by zero error!");
        }else{
            return num1 / num2;
        }
        return 0;
    }
    
    public static int exponentiate(int num1, int num2){
        int result = num1;
        for(int i = 1; i < num2; i++){
             result *= num1;
        }
        return result;
    }
    
    public static int modulo(int num1, int num2){
        return num1 % num2;
    }
   
    public static void main(String[] args) {
        System.out.println(addemup(4, 5));
        System.out.println(subtractem(4, 5));
        System.out.println(multiplyem(4, 5));
        System.out.println(divideem(4, 5));
        System.out.println(exponentiate(4, 5));
        System.out.println(modulo(4, 5));        
    }
}


