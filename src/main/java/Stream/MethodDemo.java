package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MethodDemo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100) + 1);
        }

        list.stream()
                .map(x -> x.toString())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
