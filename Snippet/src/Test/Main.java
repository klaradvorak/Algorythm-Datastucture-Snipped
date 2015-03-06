package Test;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by Klara on 2.3.2015.
 */
public class Main {
    private static String neco;
    private static String [] words;
    private static String userInput;

    public static void main(String[] args) throws IOException {

        Path path= FileSystems.getDefault().getPath("D:\\School\\Algorithm&Datastructure\\Snippet\\test.txt");
        neco= Files.readAllLines(path).toString();
        neco=neco.toLowerCase();
        words = neco.split("[\\W]");

     //   for (int i = 0; i<worlds.length;i++) { System.out.print(worlds[i]+" ");}

        Scanner in= new Scanner(System.in);
        System.out.println("world");
        userInput=in.next();
        System.out.println("amount of character ");
        int value=in.nextInt();

        sereach(userInput,value);
    }
    public static void sereach(String word, int value){

        for (int i=0; i<words.length;i++) {
            int min= i-(value+1);
            int max= i+(value+1);
            if(words[i].equals(word)){
                if(min<0){
                    System.out.println("to small value");
                    min=0;
                }else if (max>words.length){
                    System.out.println("to big value");
                    max=words.length-1;
                }
                for (int j=min; j <=max;j++){
                    System.out.print(words[j]+" ");
                }
                System.out.println();
            }
        }
    }
}
