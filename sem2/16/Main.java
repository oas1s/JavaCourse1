import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

    }

    public static List<String> getFolder(String file){
        String[] strings = file.split("\\/");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <strings.length-1 ; i++) {
            stringBuilder.append(strings[i] + "/");
        }
        StringBuilder stringBuilder1 = new StringBuilder();
        String[] strings1 = strings[strings.length-1].split("\\.");
        for (int i = 0; i < strings1.length-1; i++) {
            stringBuilder1.append(strings1[i] + ".");
        }
        return List.of(stringBuilder.toString(),stringBuilder1.toString());
    }
}
