package com.example.test;

public class Series {

    public static int nSum(int n){
        int result = 0;
        for(int i=0; i<=n; i++){
            result = result + i;
        }
        return result;
    }
    public static int factorial(int n){
        int result = 1;
        if(n == 0){
            return result;
        }else{
            for(int i = 1; i <= n; i++){
                result = result*i;
            }
        }
        return result;

    }
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return n+fibonacci(n-1)
    }
}
