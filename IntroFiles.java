package files;



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.out;

public class IntroFiles {
    private static final String PATH_TO_FILE = "C:\\Users\\monas\\Documents\\SDA_Java\\cwiczenia\\src\\files\\file.txt";
    public static void main(String[] args){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PATH_TO_FILE));
            String line = null;
            //najpierw odczytujemy zawartosc lini, jesli byla pusta to bedzie zwrocona wartosc null
            //w drugiej czesci sprawdzamy czy odczytalismy cos (wtedy zmienna line bedzie rozna od null
            // jesli line ==null to obieg petli sie nie wykona
            while((line=reader.readLine()) !=null){
                System.out.println(line);
            }
            System.out.println(line);
        } catch (IOException e) {
            System.out.println("Nie udalo sie otwoorzyc pliku" + e.getMessage());
            e.printStackTrace();

        }
    }

}