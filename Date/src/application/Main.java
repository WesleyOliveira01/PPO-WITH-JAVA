package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);

        LocalDate data = LocalDate.now();

        System.out.println("Data de hoje: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }
}
