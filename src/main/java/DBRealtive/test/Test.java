package DBRealtive.test;

import DBRealtive.dao.Admins;
import DBRealtive.dao.Products;
import DBRealtive.dao.SuperAdmins;
import DBRealtive.utils.JDBCUtil;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
    @org.junit.jupiter.api.Test
    public void test1() throws SQLException, IllegalAccessException, InstantiationException {
//        Class<Student> s = Student.class;
//        Field[] fields = s.getDeclaredFields();
//        for (Field field : fields){
//            field.setAccessible(true);
//            System.out.println(field.get(new Student()));
//        }
        Connection conn = JDBCUtil.getConnection();
    }

    public String getClassName(Class clazz ){
        //String name = args.getClass().getName();
        //System.out.println(name.length());
        return clazz.getSimpleName();
    }
}
class Student{
    String name;
    Integer age;
}