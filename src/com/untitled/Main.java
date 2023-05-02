package com.untitled;

import java.util.Scanner;

public class Main {

 // данная строчка  scan.nextLine(); для получения информации от ползователя.
 // данная строчка int num = scan.nextInt(); так-же получения информации от пользователя только цифры.

 // System.out.print("Введите ваше имя: ");
 // String username = scan.nextLine();

 // System.out.println("Привет, " + username );
 // System.out.print("Введите цифры: ");

 // int num = scan.nextInt();
 // byte num2 = scan.nextByte();
 // boolean b = scan.nextBoolean();
 // float num3 = scan.nextFloat();


 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  // здесь сложение отнимание а так же умножение!.
  short  num1 = 50, num2  = 10;
  int res = num1 + num2; // + - *
  System.out.println("Результат: " + res);

  // Деление использовать float для вывода не целых чисел!
  float num3 = 50, num4  = 33;
  float res1 = num3 / num4;
  System.out.println("Результат: " + res1);

  float num5 = 50, num6  = 33;
  float res2 = num5 % num6;
  System.out.println("Результат: " + res2);
  //-----------------------------------------------------------------

  float num7 = 50, num8  = 33;
  float res3 = num7 % num8;

  res3 += 10; //сокращение - + * / %
  res3++; // -- ++ ** // %%

  System.out.println("Результат: " + res3);
  System.out.println("------------------------------------------------");

  // калькулятор самый простой и приметивный на Java ! ------------------------------------------

  System.out.println("Введите 1 число: ");
  float num9 = scan.nextFloat();

  System.out.println("Введите 2 число: ");
  float num10 = scan.nextFloat();

  float res11 = num9 + num10;
  float res12 = num9 - num10;
  float res13 = num9 * num10;
  float res14 = num9 / num10; // если прописать 0 то выдаст ошибку потому нельзя делить на ноль!

  System.out.println("Результат: ");
  System.out.println(res11 + "\n" + res12 + "\n" + res13 + "\n" + res14);
 }
}
