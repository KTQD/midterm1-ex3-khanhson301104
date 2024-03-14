import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String replacedLine = line.replace("Nha Trang", "Vũng Tàu");
                bufferedWriter.write(replacedLine);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("Da thay the");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
