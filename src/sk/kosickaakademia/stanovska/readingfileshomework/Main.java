package sk.kosickaakademia.stanovska.readingfileshomework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String a;
       List<String> list1= new ArrayList<String>();
        List<String> list2= new ArrayList<String>();
       File file = new File("resources/a.txt");
        try {
           BufferedReader br= new BufferedReader (new FileReader(file));
            while ((a =br.readLine()) != null)
                list1.add(a);
        String b;
        File file2 = new File("resources/b.txt");
        if (list1 != list2) {
                System.out.println("čísla zo súboru a ktore nie su v b");
                System.out.println(list1);
            }
        if (list2!= list1){
            System.out.println("čísla so súboru b ktore nie su v a");
            System.out.println(list2);
        }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
