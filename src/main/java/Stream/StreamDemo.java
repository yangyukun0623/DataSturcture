package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;


public class StreamDemo {
    public static void main(String[] args) throws IOException {

        Optional<Integer> reduce = Files.lines(Paths.get("D://Language/src/main/resources/data.txt")).flatMap(word -> Arrays.stream(word.split(" ")))
                .map(word -> 1).reduce((word, nums) -> nums + 1);

        System.out.println(new StringBuffer().hashCode());
    }
}
