import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        int arr[] = [100,70,];
//        List<Integer> test[] = [100,70,200,35,65,73,45,10];
        List<Integer> input = new ArrayList<>();
        input.add(100);
        input.add(70);
        input.add(200);
        input.add(35);
        input.add(65);
        input.add(73);
        input.add(45);
        input.add(10);

        Collections.sort(input, Collections.reverseOrder());
        System.out.println(input);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i<input.size(); i+=2){
            result.add(input.get(i) + input.get(i+1));
        }
        System.out.println(result);
    }
}