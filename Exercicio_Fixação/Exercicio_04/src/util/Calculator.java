package util;

public class Calculator {

    public final double PI = 3.14159;

    public final double circumference(double radius){
            return 2.0 * PI * radius;
    }
    public final double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }
}
