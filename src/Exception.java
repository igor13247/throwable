import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.nio.file.Paths;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exception {
    static void getFile() throws IOException {
        String filePath = "C:\\Users\\наталья\\Desktop\\Throwable\\primes.txt";
        File file = new File(filePath);
        Scanner stringSc = new Scanner(System.in);
        Scanner scan = new Scanner(file);
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        System.out.println("Введите кол-во записей:");
        int kol = stringSc.nextInt();
        for (int i = 0; i < kol; i++) {
            System.out.println("Введите своё имя:");
            String name = stringSc.next();
            List<String> lines = Files.readAllLines(Paths.get(String.valueOf(file)), StandardCharsets.UTF_8);
            try {
                FileReader reader = new FileReader("primes.txt");
                /*Часть в которой должно проверять условие на наличие существования введенного имени в файле.
                if (reader == name){
                System.out.println("Вы ввели имя, которое уже существует");
                return;
                }*/
                out.write(" "+name);
            }
            catch (IOException e){
                e.printStackTrace();
            }
            System.out.println("Введите свой номер телефона:");
            int telefon = stringSc.nextInt();
            out.write(" "+telefon+"\n");
        }
        out.close();
    }

    public static void main(String[] args) {
        try {
            getFile();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}