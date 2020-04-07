package DBRealtive.test;

import DBRealtive.utils.JDBCUtil;
import org.junit.jupiter.api.Test;


import java.sql.*;
import java.util.Scanner;


public class Shop {
    Scanner scanner = new Scanner(System.in);
    Connection con = JDBCUtil.getConnection();
    Statement state = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String[][] admins = new String[5][2];
    String username = "admin";
    String password = "123456";

    @Test
    public void main() {
        boolean bool = true;
        do {
            System.out.println("1、用户购买");
            System.out.println("2、进入后台管理");
            System.out.println("0、退出");
            System.out.println("请选择：");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    //userShopMainView();
                    break;
                case 2:
                    loginView();
                    break;
                case 0:
                    System.out.println("程序退出！");
                    bool = false;
                default:
                    System.out.println("输入有错误，请重新输入。");
                    break;
            }
        } while (bool);
    }

    // 初始化方法
    public void init() {
        admins[0][0] = "admin";
        admins[0][1] = "123456";

    }
    public void loginView() {
        System.out.println("欢迎...........!");
        int count = 0;
        do {
            System.out.println("请输入用户名： ");
            String usrername = scanner.nextLine();
            System.out.println("请输入密码：");
            String password = scanner.nextLine();
            // 验证是否登录成功
            if(isLogin(username, password)) {
                count = 0; // 清空
                // 验证身份
                if ("admin".equals(username)) {
                    adminView();
                } else {
                    managerView();
                }
            } else {
                count++;
                System.out.println("登录失败！" + count + "次");
                if (count == 3) {
                    System.out.println("程序马上就要关闭了！");
                }
            }
        } while (count < 3);
    }

    /**
     * 验证用户名密码是否登录成功
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录成功返回true，否则返回false
     */
    public boolean isLogin(String username, String password) {
        String sql = "select * from Manager where username = ? and password = ?";
        String name = null;
        String pass = null;
        try{
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            rs.last();
            if (rs.getRow() != 0){
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        } finally {
            JDBCUtil.close(con, ps, rs);
        }
    }

    public boolean existsId(String id) {

        String sql = "select * from goods where id = ?";
        int c = 0;
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            rs.last();
            c = rs.getRow();
            if (c != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        } finally {
            JDBCUtil.close(con, ps, rs);
        }
    }

    public boolean findById(String id) {
        if (existsId(id)){
            return true;
        } else {
            return false;
        }
    }

    public void managerView() {
        System.out.println("欢迎进入管理员界面!");
    }

    /*
     * 超管界面
     */
    public void adminView() {
        System.out.println("欢迎进入超管界面！");
        do {
            System.out.println("1、查询所有管理员信息");
            System.out.println("2、增加管理员信息");
            System.out.println("3、修改管理员信息");
            System.out.println("4、删除管理员信息");
            System.out.println("0、退出超管界面");
            System.out.print("请选择：");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 0:
                    return;
                case 1:
                    System.out.println("进入查询所有管理员信息界面");
                    showManagerView();
                    break;
                case 2:
                    System.out.println("进入增加管理员信息界面");
                    newManagerView();
                    break;
                case 3:
                    System.out.println("进入修改管理员信息界面");
                    changeManagerView();
                    break;
                case 4:
                    System.out.println("进入删除管理员信息界面");
                    delManagerView();
                    break;
                default:
                    System.out.println("输入有误，请重新输入。");
            }
        } while (true);
    }


//    public Connection getConnection() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/system", "root", "606623");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return con;
//    }
    /*
     * 释放资源
     */


    /*
     * 查询所有管理员信息界面
     */
    public void showManagerView() {
        System.out.println("欢迎进入查询所有管理员信息界面！");
        System.out.println("---------------------------");
        showManager();
        System.out.println("---------------------------");
        System.out.println("按回车键返回！");
        scanner.nextLine();
    }

    /*
     * 显示所有管理员信息的业务方法
     */
    public void showManager() {

        String sql = "select * from Manager";
        System.out.println("编号\t管理员名称\t密码");

        try {

            state = con.createStatement();
            ResultSet rs = state.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt("id")+"\t"+rs.getString("username")+"\t"+rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs,state,con);
        }
    }

    /*
     * 增加管理员信息
     */
    public void newManagerView() {
        System.out.println("欢迎进入增加管理员信息界面！");
        newManager();
        showManager();
    }

    /*
     * 查询当前管理员中有效个数的方法
     */
    public int getManagerCount() {
        String sql = "select * from Manager";
        int sum = 0;
        try {
            state = con.createStatement();
            rs = state.executeQuery(sql);
            rs.last();
            sum = rs.getRow();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(rs, state, con);
        }
        return sum;
    }

    /**
     * 查询用户名是否存在
     *
     * @param username
     * @return 存在返回true，不存在返回false
     */
    public boolean existsUserName(String username) {
        String sql = "select * from Manager where username = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if(rs.next()) {
                return false;
            }else {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            JDBCUtil.close(rs,state,con);
        }
        return false;
    }

    /**
     *
     * @param //username
     * @param //passworld
     * @return 新建成功返回true，否则返回false
     */
    public void newManager() {
        boolean bool = false;
        do {
            System.out.println("请输入增加的编号：");
            int newid = scanner.nextInt();
            System.out.println("请输入新增用户名：");
            String newusername = scanner.next();
            System.out.println("请输入密码：");
            String newpassword = scanner.next();
            System.out.println("请再次输入密码：");
            String renewpassword = scanner.next();
            if (newpassword.equals(renewpassword)) {
                if (existsUserName(username)) {
                    bool = false;
                } else {
                    String sql = "insert into Manager values(?,?,?)";
                    try {
                        ps = con.prepareStatement(sql);
                        ps.setString(1, String.valueOf(newid));
                        ps.setString(2, newusername);
                        ps.setString(3, newpassword);
                        state.executeUpdate(sql);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }finally {
                        JDBCUtil.close(state,con);
                    }
                    bool = false;
                }
            }else {
                System.out.println("两次密码不一致，请重新输入！");
                bool = true;
            }
        } while (bool);
    }



    /*
     * 修改管理员信息界面
     */
    public void changeManagerView() {
        System.out.println("欢迎进入修改管理员信息界面！");
        changeManager();
        showManager();
    }

    /*
     * 修改管理员信息业务方法
     */
    public void changeManager() {
        boolean bool = false;
        do {
            System.out.println("请输入用户名：");
            String username = scanner.next();
            System.out.println("请输入新密码：");
            String newpassword = scanner.next();
            System.out.println("请再次确认新密码：");
            String renewpassword = scanner.next();
            if(newpassword.equals(renewpassword)) {
                String sql = "update Manager set password = '"+newpassword+"' where username = '"+username+"'";
                try {
                    state = con.createStatement();
                    state.executeUpdate(sql);
                } catch (SQLException e) {
                    e.printStackTrace();
                }finally {
                    JDBCUtil.close(state,con);
                }
                bool = false;
            }else {
                System.out.println("输入有误，请重新输入！");
                bool = true;
            }
        }while(bool);
    }


    /*
     * 删除管理员信息界面
     */
    public void delManagerView() {
        System.out.println("欢迎进入删除管理员信息界面！");
        boolean bool = false;
        do {
            showManager();
            System.out.print("请输入选择删除的编号：");
            int choose = scanner.nextInt();
            scanner.nextLine();
            int count = getManagerCount();
            if (choose >= 1 && choose <= count) {
                System.out.println("是否确认删除(y/n)?");
                String isDel = scanner.next();
                if ("y".equalsIgnoreCase(isDel)) {
                    if (delManager(choose)) {
                        System.out.println("删除成功！");
                        showManager();
                    } else {
                        System.out.println("删除失败！");
                    }
                }
                bool = false;
            } else {
                System.out.println("选择错误，请重新选择！");
                bool = true;
            }
        } while (bool);
    }

    /**
     * 删除管理员业务方法
     *
     * @param id 编号
     * @return 删除成功返回true，删除失败返回false
     */
    public boolean delManager(int id) {
        int count = getManagerCount();

        String sql = "delete from Manager where id = "+id;
        try {
            state = con.createStatement();
            state.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

}
