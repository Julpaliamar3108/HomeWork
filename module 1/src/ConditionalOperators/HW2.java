package ConditionalOperators;
import java.util.Scanner;
public class HW2 {
    public static class task1 {
        public static void main(String[] args) {
            Scanner t = new Scanner(System.in);
            System.out.println("Введите три целых числа: ");
            int n1 = t.nextInt();
            int n2 = t.nextInt();
            int n3 = t.nextInt();
            if (n2 < n1 && n1 > n3) {
                System.out.println("Максимальное число: " + n1);
            }
            if (n1 < n2 && n2 > n3) {
                System.out.println("Максимальное число: " + n2);
            }
            if (n2 < n3 && n3 > n1) {
                System.out.println("Максимальное число: " + n3);
            }
        }

        public static class task9_1 {
            public static void main(String[] args) {
                Scanner t = new Scanner(System.in);
                System.out.println("Введите три целых числа: ");
                int n1 = t.nextInt();
                int n2 = t.nextInt();
                int n3 = t.nextInt();
                if (n2 > n1 && n1 < n3) {
                    System.out.println("Минимальное число: " + n1);
                }
                if (n1 > n2 && n2 < n3) {
                    System.out.println("Минимальное число: " + n2);
                }
                if (n2 > n3 && n3 < n1) {
                    System.out.println("Минимальное число: " + n3);
                }
            }
        }

        public static class task2 {
            public static void main(String[] args) {
                int a = 3;
                int b = 7;
                int c;
                c = a;
                a = b;
                b = c;
                System.out.println(a);
                System.out.println(b);
            }
        }

        public static class task3 {
            public static void main(String[] args) {
                Scanner t = new Scanner(System.in);
                System.out.println("Введите четное и нечетное числа: ");
                int k1 = t.nextInt();
                System.out.println("Введите еще одно число");
                int k2 = t.nextInt();
                if (k1 % 2 != 0) {
                    System.out.println("Нечетное:" + k1);
                }
                if (k2 % 2 != 0) {
                    System.out.println("Нечетное:" + k2);
                }
            }
        }

        public static class task4 {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Загадайте число от 1 до 5");
                System.out.println("Это 3? (y/n)");
                String answer = scan.nextLine();
                if (answer.equals("y")) {
                    System.out.println("Eh!");
                } else {
                    System.out.println("Это число больше 3х? (y/n)");
                    String answer2 = scan.nextLine();
                    if (answer2.equals("y")) {
                        System.out.println("Это число 4? (y/n)");
                        String answer3 = scan.nextLine();
                        if (answer3.equals("y")) {
                            System.out.println("Eh!");
                        }
                        if (answer3.equals("n")) {
                            System.out.println("Это число 5!");
                        }
                    }

                    if (answer2.equals("n")) {
                        System.out.println("Это число 2? (y/n)");
                        String answer4 = scan.nextLine();
                        if (answer4.equals("y")) {
                            System.out.println("Eh!");
                        }
                        if (answer4.equals("n")) {
                            System.out.println("Это число 1!");
                        }
                    }
                }
            }

        }


        public static class task5 {
            public static void main(String[] args) {
                //Если год не делится на 4, значит он обычный.
                //Иначе надо проверить не делится ли год на 100.
                //Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
                //Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
                //Если год делится на 400, то он високосный.
                //Иначе год обычный.
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите год: ");
                int year = scan.nextInt();
                if (year % 4 == 0 && year % 100 != 0) {
                    System.out.println("В году 366 дней");
                }
                if (year % 400 == 0) {
                    System.out.println("В году 366 дней");
                } else {
                    System.out.println("В году 365 дней");
                }
            }
        }

        public static class task6 {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите число: ");
                int number = scan.nextInt();
                int left = number % 3;
                if (left == 0) {
                    System.out.println("Число кратно трем");
                }
                if (left != 0) {
                    System.out.println("Число не кратно трем, остаток:" + left);
                }
            }
        }

        public static class task7 {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите значения трех сторон треугольника: ");
                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = scan.nextInt();
                if (a + c > b && b + c > a && a + b > c) {
                    System.out.println("Это треугольник");
                } else {
                    System.out.println("Это не треугольник");
                }
            }
        }


        public static class task10 {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите число: ");
                int numb = scan.nextInt();
                int left = numb % 2;
                if (left == 0) {
                    System.out.println("Введенное число является четным");
                }
                if (left != 0) {
                    System.out.println("Введенное число является нечетным");
                }
            }
        }


        public static class task8 {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите число от 1 до 100: ");
                int age = scan.nextInt();
                switch (age / 10) {
                    case (0):
                        System.out.println("Вы юнец");
                        break;
                    case (1):
                        System.out.println("Пора взросления");
                        break;
                    case (2):
                        System.out.println("Пора становления");
                        break;
                    case (3):
                        System.out.println("Пора профессионального развития");
                        break;
                    case (4):
                        System.out.println("Вы семьянин");
                        break;
                    case (5):
                        System.out.println("Время для внуков");
                        break;
                    case (6):
                        System.out.println("Время для внуков продолжается");
                        break;
                    case (7):
                        System.out.println("Че хотите, то и делайте:))");
                        break;
                    case (8):
                        System.out.println("Устала придумывать:)");
                        break;
                    case (9):
                        System.out.println("Время для отдыха");
                        break;
                    case (10):
                        System.out.println("Вам пора");
                        break;
                }
            }
        }

        public static class task12 {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите число");
                int num = scan.nextInt();
                int f = 1;
                for (int i = 1; i <= num; i++) {
                    f = f * i;
                }
                System.out.println(f);
            }
        }

        public static class task13 {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите число");
                int num = scan.nextInt();

                for (int i = 1; i <= num; i++) {
                    System.out.println(i + "");
                }
                int k = 0;
                for (int i = 1; i <= num; i++) {
                    k = k + i;
                }
                System.out.println(k);
            }
        }

        public static class task14 {
            public static void main(String[] args) {
                int num = 356;
                int sum = 0;
                int mult = 1;
                int eachNumber;
                eachNumber = num % 10;
                sum = sum + eachNumber;
                mult = mult * eachNumber;
                num = num / 10;
                eachNumber = num % 10;
                sum = sum + eachNumber;
                mult = mult * eachNumber;
                num = num / 10;
                eachNumber = num % 10;
                sum = sum + eachNumber;
                mult = mult * eachNumber;
                System.out.println(sum);
                System.out.println(mult);
            }
        }

        public static class task15 {
            public static void main(String[] args) {
                int n = 1;
                while (n*n <= 45){
                    System.out.println(n*n + "");
                    n++;
                }
            }
        }
    }
}



