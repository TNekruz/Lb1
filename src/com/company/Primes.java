package com.company;

//вывод всех простых чисел от 0 до 100
public class Primes {

    //определяет простое число или нет
    public static boolean isPrime(int n)
    {
        for (int i = 2; i<n; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //проверяем все числа от 0 до 100 и если он простое, то выводим его
        for (int i = 2; i <=100; i++)
        {
            if (isPrime(i))
                System.out.println(i);
        }
    }
}
