import java.util.Arrays;
import java.util.List;

public class FindClosetNumberToZero {
    public static void main(String[] args) {
        List<Integer> test = Arrays.asList(-4, -2, 1, 4, 8);
        int closest = test.get(0);
        for (int x : test) {
            if (Math.abs(x) < Math.abs(closest) ||
                    Math.abs(x) == Math.abs(closest) && x > closest) {
                closest = x;
            }
        }
        System.out.println("test: " + closest);
    }
}
