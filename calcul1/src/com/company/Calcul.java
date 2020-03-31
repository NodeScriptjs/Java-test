package com.company;
import java.lang.*;
public class Calcul {
    private	int a;
    private	int b;

    public Calcul(){
        this.a = 0;
        this.b = 0;
    }

    public  Calcul(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        int result = a + b;
        return result;
    }

    public int subs(){
        int result = a - b;
        return result;
    }
    public int multi(){
        int result = a * b;
        return result;
    }
    public int div(){
        int result = a / b;
        return result;
    }

}
