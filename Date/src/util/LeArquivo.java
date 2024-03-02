package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeArquivo {

  public static void getLines(String filename) {
    try {
      FileReader file = new FileReader(filename);
      BufferedReader br = new BufferedReader(file);
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
      br.close();
      file.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
