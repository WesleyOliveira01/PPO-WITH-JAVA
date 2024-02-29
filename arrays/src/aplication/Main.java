package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import utils.Person;

public class Main {

  public static void main(String args[]) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Person> persons = new ArrayList<>();

    System.out.println(
      "Digite a quantidade de funcionarios a serem cadastrados:"
    );
    Integer quantity = sc.nextInt();

    for (int i = 0; i < quantity; i++) {
      System.out.printf("%d Funcionario:%n", i + 1);
      sc.nextLine();
      System.out.print("Nome: ");
      String nome = sc.nextLine();
      System.out.print("Salario: ");
      Double salary = sc.nextDouble();

      persons.add(new Person(i + 1, nome, salary));
    }
    addSalary(persons);
    sc.close();
  }

  public static void addSalary(List<Person> arr) {
    Scanner sc2 = new Scanner(System.in);
    System.out.println("Digite o id do funcionario");
    Integer id = sc2.nextInt();
    Person funcionario = arr
      .stream()
      .filter(person -> person.getId() == id)
      .findFirst()
      .orElse(null);
    if (funcionario == null) {
      System.out.println("Funcionario nao encontrado");
      showPersons(arr);
      sc2.close();
      return;
    }
    System.out.println("Digite a porcentagem do aumento: ");
    Double percent = sc2.nextDouble();
    Double aumento = percent / 100;

    Double salario = funcionario.getSalary();
    salario += (aumento * salario);
    funcionario.setSalary(salario);
    showPersons(arr);
    sc2.close();
  }

  public static void showPersons(List<Person> arr) {
    for (Person person : arr) {
      System.out.println(person);
    }
  }
}
