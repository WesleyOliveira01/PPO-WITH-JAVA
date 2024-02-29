package application;

import java.util.Locale;
import java.util.Scanner;
import utils.Currency;
import utils.Person;

public class Main {

  static Person newPerson = new Person("Wesley", 22);

  public static void main(String[] args) {
    newPerson.showPersonDetails();
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter currency value: ");
    double val = sc.nextDouble();
    System.out.printf("Currency: %.2f%n", Currency.currencyConversio(val));
    sc.close();
  }
}
