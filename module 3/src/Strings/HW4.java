package Strings;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW4 {
    public static class task1 {
        public static void main(String[] args) {
            String sentence = "Hello, world! My name is Roman =)";
            char[] chars = sentence.toCharArray();
            int counter = 0;

            for (char char1 : chars) {
                for (char char2 : chars) {
                    if (char1 == char2) {
                        ++counter;
                    }
                }
                System.out.println(char1 + " == " + counter);
                counter = 0;

            }
        }
    }

    public static class task2 {
        public static void main(String[] args) {
            String str = "cat dog lion";
            String[] str2 = str.split(" ");
            System.out.println(Arrays.toString(str2));
            String globalStr = "";
            for (int i = 0; i < str2.length; i++) {

                String myStr = str2[i];
                String reverseWord = "";
                for (int k = myStr.length() - 1; k >= 0; k--) {
                    reverseWord += myStr.charAt(k);
                }
                globalStr += reverseWord + " ";
            }
            System.out.println(globalStr);
        }
    }

    public static class task4 {
        public static void main(String[] args) {
            String string = "Everybody want to steal my girl";
            System.out.println("Длина строки составляет " + string.length());
        }
    }

    public static class task3 {
        public static void main(String[] args) {
            StringBuffer string = new StringBuffer("Your wonder under summer skies");
            string.delete(4, 11);
            System.out.println(string);
        }
    }

    public static class task5 {
        public static void main(String[] args) {
            System.out.println("Напишите предложение:");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String[] strArr = str.split(" ");
            String reverseString = "";
            String[] reverArr = new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String word = strArr[i];
                String reverseWord = "";
                for (int k = word.length() - 1; k >= 0; k--) {
                    reverseWord += word.charAt(k);
                }
                reverArr[i] = reverseWord;
            }
            for (int i = strArr.length - 1; i >= 0; i--) {
                reverseString += reverArr[i] + " ";
            }
            System.out.println(reverseString);
        }
    }

    public static class task7 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            String str = "";
            for (; ; ) {
                System.out.println("Введите слово: ");
                String word = scan.nextLine();
                if (word.equals("EXIT")) {
                    break;
                } else {
                    str += word + " ";
                }
            }
            String[] newArr = str.split(" ");
            for (int i = 1; i < newArr.length; i++) {
                int j = rand.nextInt(i);
                String temp = newArr[i];
                newArr[i] = newArr[j];
                newArr[j] = temp;
            }
            System.out.println(Arrays.toString(newArr));
            String finalString = "";
            for (int i = 0; i <= newArr.length - 1; i++) {
                finalString += newArr[i] + " ";
            }
            System.out.println(finalString);

        }
    }

    public static class task6 {
        public static void main(String[] args) {
            String str = "cowboy dog butterfly lion tiger";
            String newString = "";
            String[] arr = str.split(" ");
            for (int count = 0; count < arr.length - 1; count++) {
                for (int i = 0; i <= arr.length - 2; i++) {
                    if (arr[i].length() > arr[i + 1].length()) {
                        String temp;
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
            for (int i = 0; i <= arr.length -1; i++){
                newString += arr[i] + " ";
            }
            System.out.println(newString);
            // ***
            String newString2 = "";
            String[] arr1 = str.split(" ");
            for (int count = 0; count < arr.length - 1; count++) {
                for (int i = 0; i <= arr1.length - 2; i++) {
                    if (arr1[i].charAt(0) > arr1[i + 1].charAt(0)) {
                        String temp;
                        temp = arr1[i];
                        arr1[i] = arr1[i + 1];
                        arr1[i + 1] = temp;
                    }
                }
            }
            for (int i = 0; i <= arr1.length -1; i++){
                newString2 += arr1[i] + " ";
            }
        }
        }
    }




