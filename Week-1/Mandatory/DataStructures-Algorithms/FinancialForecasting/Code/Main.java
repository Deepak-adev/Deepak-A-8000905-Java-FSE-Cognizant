public class Main {

    public static void main(String[] args) {

        FinancialForecast forecast = new FinancialForecast();

        double currentValue = 10000;
        double growthRate = 0.10;
        int years = 5;

        forecast.displayForecast(currentValue,growthRate,years);
    }
}