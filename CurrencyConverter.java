import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to Currency Converter!");
        System.out.println("Available currencies: USD, EUR, GBP, JPY, INR");
        
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();
        
        System.out.print("Enter the source currency (e.g., USD): ");
        String sourceCurrency = scanner.next().toUpperCase();
        
        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.next().toUpperCase();
        
        double result = convertCurrency(amount, sourceCurrency, targetCurrency);
        if(result == -1){
            System.out.println("Invalid currency!");
        } else {
            System.out.println(amount + " " + sourceCurrency + " equals " + result + " " + targetCurrency);
        }
        
        scanner.close();
    }
    
    public static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        double conversionRate = getConversionRate(sourceCurrency, targetCurrency);
        if (conversionRate == -1) {
            return -1;
        } else {
            return amount * conversionRate;
        }
    }
    
    public static double getConversionRate(String sourceCurrency, String targetCurrency) {
        // Conversion rates for demonstration purposes
        double usdToEur = 0.85;
        double usdToGbp = 0.72;
        double usdToJpy = 109.58;
        double usdToInr = 74.15;
        
        switch (sourceCurrency) {
            case "USD":
                switch (targetCurrency) {
                    case "EUR":
                        return usdToEur;
                    case "GBP":
                        return usdToGbp;
                    case "JPY":
                        return usdToJpy;
                    case "INR":
                        return usdToInr;
                    default:
                        return -1;
                }
            case "EUR":
                switch (targetCurrency) {
                    case "USD":
                        return 1 / usdToEur;
                    default:
                        return -1;
                }
            case "GBP":
                switch (targetCurrency) {
                    case "USD":
                        return 1 / usdToGbp;
                    default:
                        return -1;
                }
            case "JPY":
                switch (targetCurrency) {
                    case "USD":
                        return 1 / usdToJpy;
                    default:
                        return -1;
                }
            case "INR":
                switch (targetCurrency) {
                    case "USD":
                        return 1 / usdToInr;
                    default:
                        return -1;
                }
            default:
                return -1;
        }
    }
}
