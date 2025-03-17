public class CurrencyConversion {
    public static void main(String args[]) {

       double amountInUSD = 100.0;
       System.out.println("Initial amount in USD: " + amountInUSD);

       double exchangeRateUSDToEUR = 0.85;
       double amountInEUR = exchangeRateUSDToEUR * amountInUSD;
       System.out.println("Amount in EUR after conversion: " + amountInEUR);

       amountInEUR -= 55;
       System.out.println("Amount in EUR after expenditure: " + amountInEUR);

       amountInUSD = amountInEUR / exchangeRateUSDToEUR;
       System.out.printf("Amount in USD after converting back: $%.2f", amountInUSD);

    }
}
