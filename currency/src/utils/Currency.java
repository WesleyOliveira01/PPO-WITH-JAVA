package utils;

public class Currency {

  public static double currencyConversio(double val) {
    double dolValue = 4.99;
    double conversionTax = 1.06;
    double conversion = (val / dolValue) * conversionTax;
    return conversion;
  }
}
