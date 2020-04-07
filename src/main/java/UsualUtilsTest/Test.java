package UsualUtilsTest;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        String path = "db.properties";
        Properties prop = new Properties();
        prop.load(new FileReader(path));
    }

    public static void f1(String name, Object...objs) {
        String str = "create table " + name + " (\n\t";
        Integer ints = 1;
    }
}
