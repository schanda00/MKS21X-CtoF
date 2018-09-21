public class CtoFTester{

public static double celsiusToFahrenheit(double c) {
    return (9/5) * c  + 32 ;
}

public static double fahrenheitToCelsius(double f) {
    return ((f - 32)*5)/9;

}

public static void main(String[] args) {
        double cel = 38.5;
        double far = 130.9;
        double a = celsiusToFahrenheit(cel);
        double b = fahrenheitToCelsius(far);

        System.out.println( cel + " Celsius = " + a + " Fahrenheit");
        System.out.println( far + " Fahrenheit = " + b + " Celsius");
}

}
