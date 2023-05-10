package Kju_7;

public class DoubleValueEveryNextCall {
    private static int times = 0;

    public static int getNumber() {
        times = (times == 0) ? 1 : times*2;
        return times;
    }

    public static void main(String[] args) {
        System.out.println( DoubleValueEveryNextCall.getNumber());
        System.out.println( DoubleValueEveryNextCall.getNumber());
        System.out.println( DoubleValueEveryNextCall.getNumber());
        System.out.println( DoubleValueEveryNextCall.getNumber());
    }


}
