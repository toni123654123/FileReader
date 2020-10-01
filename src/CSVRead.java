import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVRead {
    public static void readFile(String pathname){
        try{
            FileReader file = new FileReader(pathname);
            BufferedReader bf = new BufferedReader(file);
            String line = null;
            while((line = bf.readLine())!=null){
                String[] country = line.split(",");
                System.out.println("Code: "+country[4] + "," +"Country: "+country[2]);
            }
        }
        catch (IOException e){
            e.getMessage();
        }

    }
}
