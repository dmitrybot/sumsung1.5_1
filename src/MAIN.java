import java.util.*;
public class MAIN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double n;
        n = in.nextDouble();
        System.out.println(n >= 3 && n <= 8 ? true : false);
    }
}