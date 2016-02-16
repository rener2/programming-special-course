/**
 *@author <rerakk>
 */

import java.io.DataInputStream;
import java.io.IOException;

public class Main {

    public static void main(String [] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        String sentence;
        while ((sentence = dis.readLine()) != null) {
            Decode(sentence);
        }
        dis.close();
    }

    public static void Decode(String sentence){
        String resultaat = "";
        char letter;
        for(int i = 0;i<sentence.length();i++){
            int asciiTaht = ((int) sentence.charAt(i)) - 7;
            if (asciiTaht < 32) {resultaat = resultaat + "";}
            else{letter = (char) asciiTaht;
                resultaat = resultaat + letter;}}
        System.out.println(resultaat);
    }
}