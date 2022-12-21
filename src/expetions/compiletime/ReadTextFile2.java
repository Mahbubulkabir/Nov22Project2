package expetions.compiletime;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile2 {
    public static void main(String[] args) {
        //final, finally and finalize
        //finalize is a method used in garbage collection

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader("/Users/nacer-zimu/IdeaProjects/Nov22Project2/lorem.txt");
            String str = "";

            try {
                br = new BufferedReader(fr);
                while ((str = br.readLine()) != null){
                    System.out.println(str);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if(br != null){
                        br.close();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }





    }
}
