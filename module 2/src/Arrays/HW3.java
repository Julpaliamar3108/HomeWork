package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HW3 {
    public static class task1 {
        public static void main(String[] args) {
            int[] arr = {1, 3, 12, 56, 3};
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
    }

    public static class task2 {
        public static void main(String[] args) {
            int[] arr = {45, 7, 89, 24, 2, 0, 6};
            int max1 = arr[0];
            int max2 = arr[0];
            int max3 = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max1 < arr[i]) {
                    max1 = arr[i];
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (max2 < arr[j] && arr[j] != max1) {
                    max2 = arr[j];
                }
            }
            for (int k = 0; k < arr.length; k++) {
                if (max3 < arr[k] && arr[k] != max1 && arr[k] != max2) {
                    max3 = arr[k];
                }
            }
            System.out.println(max1);
            System.out.println(max2);
            System.out.println(max3); // не пойму почему здесь не срабатывает правильно и выводит тоже второе максимальное число
        }
    }

    public static class task3 {
        public static void main(String[] args) {
            int[] arr = {7, 9, 3, 4, 5};
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public static class task4 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5, 6};
            int i = 0;
            int k = 0;
            int[] chet = new int[arr.length / 2];
            int[] nechet = new int[arr.length / 2];
            int[] nechetn = new int[arr.length / 2];
            //System.out.println(Arrays.toString(arr));
            // Разбираем по массивам четные и нечетные
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % 2 == 0) {
                    chet[i] = arr[j];
                    i = i + 1;
                } else {
                    nechet[k] = arr[j];
                    k = k + 1;
                }
            }//Сортируем новые массивы по возрастанию
            Arrays.sort(chet);
            Arrays.sort(nechet);
            // Переварачиваем массив с нечетными числами в новый массив
            for (int l = 0; l < nechet.length; l++) {
                nechetn[l] = nechet[nechet.length - 1 - l];
                //System.out.println(nechet[l]);
            }
            // Сводим получившиеся массивы в один
            int[] obsh = new int[arr.length];
            for (int n = 0; n < arr.length; n += 2) {
                obsh[n] = chet[(n / 2)];
                obsh[n + 1] = nechetn[(n / 2)];
                System.out.println(chet[(n / 2)]);
                System.out.println(obsh[n + 1]);
            }
        }
    }

        public static class task7 {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите четное положительное число: ");
                int n = scan.nextInt();

                while (n <= 0 || n % 2 != 0) {
                    System.out.println("Введите ЧЕТНОЕ ПОЛОЖИТЕЛЬНОЕ число: ");
                    n = scan.nextInt();
                }
                int k = 0;
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = (int) (Math.random() * (10 + 1)) - 5;
                    //if (arr[i] >= -5 && arr[i] <= 5) {
                    //k++;
                    //}
                }
                System.out.println(Arrays.toString(arr));
                int sum1 = 0;
                int sum2 = 0;
                for (int i = 0; i <= n / 2 - 1; i++) {
                    sum1 = sum1 + Math.abs(arr[i]);
                }
                for (int i = n / 2; i <= n - 1; i++) {
                    sum2 = sum2 + Math.abs(arr[i]);
                }
                if (sum1 > sum2) {
                    System.out.println("Сумма чисел левой половины " + sum1 + " больше суммы чисел правой половины модуля " + sum2);
                }
                if (sum2 > sum1) {
                    System.out.println("Сумма чисел правой половины " + sum2 + " больше суммы чисел левой половины модуля " + sum1);
                }
                if (sum1 == sum2) {
                    System.out.println("Сумма чисел левой половины " + sum1 + " равна сумме чисел правой половины модуля " + sum2);
                }
                //System.out.println(sum1);
                //System.out.println(sum2);
            }
        }

        public static class task6 {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int[] arr = {7, 10, 68, 45, 9};
                System.out.println("Введите значение элемента массива: ");
                int n = scan.nextInt();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == n) {
                        System.out.println("Индекс элемента: " + i);
                    }
                }
            }
        }

        public static class task8 {
            public static void main(String[] args) {
                int[] arr = new int[100];
                int sumobsh = 0;
                for (int i = 0; i < 100; i++) {
                    arr[i] = (int) (Math.random() * 10);
                    sumobsh = sumobsh + arr[i];
                }
                System.out.println(Arrays.toString(arr));
                System.out.println(sumobsh);
                int[] fib = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
                int sum = 0;
                for (int i = 0; i < fib.length - 1; i++) {
                    sum = sum + arr[fib[i]];
                    System.out.println(arr[fib[i]]);
                }
                System.out.println("Сумма чисел с индексом числа Фибоначчи: " + sum);
                System.out.println("Среднее значение: " + ((double) (sumobsh - sum) / 90));
            }
        }

        public static class task10 {
            public static void main(String[] args) {
                int[][] arr = new int[5][5];
                int sum;
                int sumobsh = 0;
                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        arr[i][j] = (int) (Math.random() * 10);
                        System.out.print(arr[i][j]);
                        sumobsh = sumobsh + arr[i][j];
                    }
                    System.out.println();
                }
                System.out.println(sumobsh);
                sum = arr[0][0] + arr[0][4] + arr[1][1] + arr[1][2] + arr[1][3] + arr[2][1] + arr[2][3] + arr[3][1] + arr[3][2] + arr[3][3] + arr[4][0] + arr[4][4];
                System.out.println("Сумма чисел, обозначенных 'Х': " + sum);
                System.out.println("Среднее значение из оставшихся чисел: " + ((double) (sumobsh - sum) / 13));
            }
        }
    }








    //public static class task000 {
        //public static void main(String[] args) {
        //Зададим корабли руками. Потом зарандомим }
          //  int g1 = 0;
          //  int v1 = 0;
           // int g21 = 2;
          //  int v21 = 2;
           // int g22 = 3;
           // int v22 = 2;
           // int [] [] [] [] [] pole = {{1, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}, {1, 0, 0, 0, 0}};

        		//for (int i = 0; i < pole.length; i++) {
           // for (int j = 0; j < pole[i].length; j++) {
                //System.out.print(pole[i][j] + "\t");
       // }