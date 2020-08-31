package ru.iroshchin.j_one.hw6;

import sun.font.DelegatingShape;

import javax.print.attribute.standard.Finishings;
import java.io.*;
import java.util.Scanner;

public class Main {


    public static void concatenateFiles (String file1, String file2, String concFile) throws IOException{
        FileOutputStream fos = new FileOutputStream(concFile);
        int ch;
        FileInputStream fis = new FileInputStream(file1);
        while ((ch = fis.read()) != -1)
           fos.write(ch);
        fis.close();

        fis = new FileInputStream (file2);
        while ((ch = fis.read()) != -1)
            fos.write(ch);
        fis.close();

       fos.flush();
       fos.close();

    }

    public static void writeContent (String fileName, String content) throws FileNotFoundException{
        PrintStream ps = new PrintStream(new FileOutputStream(fileName));
        ps.print(content);
    }

    public static void readContent(String file) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(file));

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
    }


    public static boolean searchForMatch (String file, String matchWord) throws  IOException{
        FileInputStream fis = new FileInputStream(file);
        byte[] searchWord = matchWord.getBytes();
        int ch;
        int i = 0;
        while ((ch = fis.read()) != -1){
            if (ch == searchWord[i])
                i++;
                else {
                    i = 0;
                    if(ch == searchWord[0])
                        i++;
                }
                if (i == searchWord.length){
                    fis.close();
                    return true;
                }
            }
        fis.close();
        return false;
        }

   public static void main(String[] args) {

    Scanner SCNR = new Scanner(System.in);


    try{
        writeContent("text1.txt","Mr. and Mrs. Dursley, of number four, Privet Drive, were proud to say that they were perfectly normal, thank you very much. " );

        writeContent("text2.txt","They were the last people you'd expect to be involved in anything strange or mysterious, because they just didn't hold with such nonsense.");

        readContent("text1.txt");
        System.out.println();
        readContent("text2.txt");
        concatenateFiles ("text1.txt", "text2.txt", "concFile.txt");

        System.out.println("Содержимое двух файлов: ");
        readContent("concFile.txt");

        System.out.println("Введите искомое слово: ");
        String matchWord = SCNR.nextLine();


        System.out.println("Это слово присутствует в тексте? - " + searchForMatch("concFile.txt", matchWord));


    }catch (FileNotFoundException e){
        e.printStackTrace();
    }catch (IOException ex){
        ex.printStackTrace();
    }
}


}