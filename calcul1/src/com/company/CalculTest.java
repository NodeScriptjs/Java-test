package com.company;

import java.lang.String;

class Main {
    public static void main (String[] args ){
        read readClass = new read();
        int one;
        int two;
        int res;

        do{
        System.out.print("Bведите первое число от 0 до 10:");
            one  = readClass.readInt();
            test(one);
            System.out.print("Bведите второе число от 0 до 10:");
            two = readClass.readInt();
            test2(two);

        Calcul calcul = new Calcul(one,two);


        System.out.println("Выберите действие ");
        System.out.println("1. Сложить ");
        System.out.println("2. Вычесть ");
        System.out.println("3. Умножить ");
        System.out.println("4. Делить ");
        System.out.println("0. Выход");
        System.out.println("Выберите номер пункта ");

         res = readClass.readInt();

        switch (res) {
            case 1:
                System.out.println(calcul.add());
                break;
            case 2:
                System.out.println(calcul.subs());
                break;
            case 3:
                System.out.println(calcul.multi());
                break;
            case 4:
                System.out.println(calcul.div());
                break;
            case 0:
                System.out.print("Завершение программы");
                break;
            default:
                System.out.println("Неверный пункт");
           }
        } while (res != 0);
    }
    public static  void test (int a){
        if (a < 0 || a > 10){
            System.out.println("Первое  число не соответствует параметрам!");
            System.exit(1);
        }
    }

    public static  void test2 (int b){
        if (b < 0 || b > 10){
            System.out.println("Второе  число не соответствует параметрам!");
            System.exit(1);
        }
    }

}
