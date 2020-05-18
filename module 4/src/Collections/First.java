package Collections;


import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class First {
    public void GetNumberOfSymbol(String string,char symbol) throws Exception{
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
            newSymbols.add(str.charAt(i));
        }
        for (Character chars :newSymbols) {
            if(chars == symbol){
                count++;
            }
        }//System.out.println("В слове " + str + " символ " + symbol + " встречается " + count +  " раза");
        FileWriter resultFile = new FileWriter("resultNew.txt");
        resultFile.write('\n' + "В слове " + str + " символ k встречается " + count +  " раза");
        resultFile.close();


    }


}
