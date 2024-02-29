package ForMe;

public class MyMath {
    public static final double PI = 3.14;

    public static double sum(double... numbers){
        double sum = 0;
        for(double number: numbers){
            sum += number;
        }
        return sum;

    }
}
