public class Testing {
public static void main(String[] args) {
     double[] CI = {109.38, 81.07, 127.25, 192.53, 94.16, 152.28, 185.15, 97.19, 157.64, 59.28,
        152.01, 152.00, 93.96, 119.72, 90.34, 69.62, 139.43, 70.54, 105.90, 116.49
    };
    double sum=Double.POSITIVE_INFINITY;
    for(double i: CI){
        if (sum>i) {
            sum=i;
        }

    }
    System.out.println("sum ="+sum/100);
}
}
