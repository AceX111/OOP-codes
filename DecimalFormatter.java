package Errors;
import java.text.DecimalFormat;

public class DecimalFormatter {
    private DecimalFormat decimalFormat;
    public DecimalFormatter() {
        decimalFormat = new DecimalFormat("#.##");
    }
    public String formatDecimal(double number) {
        return decimalFormat.format(number);
    }
    public static void main(String[] args) {
        DecimalFormatter formatter = new DecimalFormatter();
        double number = 123.456789;
        String formattedNumber = formatter.formatDecimal(number);
        System.out.println("Original number: " + number);
        System.out.println("Formatted number: " + formattedNumber);
    }
}