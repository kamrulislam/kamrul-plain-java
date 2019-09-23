package kamrul;

import kamrul.file.FileReader;
import java.util.List;

public class KamrulPlainJavaApplication {

    public static void main(String[] args) {
        System.out.println(
            "Hello from Kamrul"
        );
        FileReader fileReader = new FileReader("./input.csv");
        List<String> result = fileReader.getDataFromCsv();

        System.out.println("length: " + result.size());
    }
}


