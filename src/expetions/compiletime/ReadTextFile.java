package expetions.compiletime;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("/Users/nacer-zimu/IdeaProjects/Nov22Project2/lorem.txt");
        BufferedReader br = new BufferedReader(fr);

        String str = "";

        while ((str = br.readLine()) != null){
            System.out.println(str);
        }

        fr.close();
        br.close();
    }
}
