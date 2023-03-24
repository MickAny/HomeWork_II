import java.util.*;
public class Task_66
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();

        System.out.println(a<b?"Сумма чисел от a до b равна: " + RetSum(a, b)
                :a==b?"Число a равно числу b!":"Число a меньше числа b!");
    }

    static int RetSum(int a, int b)
    {
        if(a==b) return b;
        return a + RetSum(a+1, b);
    }
}
/*
Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N
        M = 1; N = 15 -> 120
        M = 4; N = 8. -> 30*/




