package com.company;

import java.util.Scanner;

import static java.lang.System.*;

public class read {
        public int readInt (){
            Scanner in = new Scanner(System.in);
            int j = 0;
            if(in.hasNextInt())
                j = in.nextInt();
            else {
                out.println("Вы ввели не целое число ");
                exit(1);
            }
            return j;
        }
    }

