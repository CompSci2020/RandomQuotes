
package randomquotes;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class RandomQuotes {
    public static void main(String[] args) throws IOException {
        ArrayList<String> quotes = new ArrayList<String>();
        BufferedReader readFile = new BufferedReader(new FileReader("g:/quotes.txt"));
        String line = "";
        while((line = readFile.readLine()) != null){
            quotes.add(line);
        }

        int num = (int)(Math.random() * quotes.size());

        JOptionPane.showMessageDialog(null, "Random Quote:\n" + quotes.get(num));
    }
}
