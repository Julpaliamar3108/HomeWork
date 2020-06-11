package Collections;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class First {

    public void GetNumberOfSymbol(String string, char symbol) throws Exception {
        //записываем строку в файл
        FileWriter collectionFile = new FileWriter("collectionNew.txt");
        collectionFile.write(string);
        collectionFile.close();

        FileReader fr = new FileReader("collectionNew.txt");
        Scanner scan = new Scanner(fr);
        String str = scan.nextLine(); // если считываем строку из файла

        //String str  = string; // если считываем строку из параметров
        List<Character> newSymbols = new ArrayList<>();
        int i;
        int count = 0;
        for (i = 0; i < str.length(); i++) {
            newSymbols.add(str.toLowerCase().charAt(i));
        }
        for (Character chars : newSymbols) {
            if (chars.equals(symbol)) {
                count++;
            }
        }System.out.println(String.format("В строке \"%s\"  символ  \'%s\' встречается %s раз(а)", str, symbol, count));        // результат в консоль
        // если выводить результат в файл
        FileWriter resultFile = new FileWriter("resultNew.txt");
        resultFile.write(String.format("В строке \"%s\"  символ  \'%s\' встречается %s раз(а)", str, symbol, count)); // запись в файл
        resultFile.close();
    }


    public void getNumberOfEachSymbol(String string) throws IOException {
        List<Character> allSymbols = new ArrayList<>();
        int i;
        Set<String> result = new HashSet<>();
        int count = 0;

        for (i = 0; i < string.length(); i++) {
            allSymbols.add(string.charAt(i));
        }
        System.out.println(allSymbols);

        for (char char1 : allSymbols) {
            for (char char2 : allSymbols) {
                if (char1 == char2) {
                    ++count;
                }
            }
            result.add(System.lineSeparator() + char1 + " встречается " + count + " раз(а)");
            count = 0;
        }
        System.out.println(result);                                             // вывод в консоль

        FileWriter resultFile2 = new FileWriter("result.txt");
        resultFile2.write(String.valueOf(result));                              // запись в файл
        resultFile2.close();
    }
    }


