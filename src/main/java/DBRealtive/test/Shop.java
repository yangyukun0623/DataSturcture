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
            System.out.println("1���û�����");
            System.out.println("2�������̨����");
            System.out.println("0���˳�");
            System.out.println("��ѡ��");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    //userShopMainView();
                    break;
                case 2:
                    loginView();
                    break;
                case 0:
                    System.out.println("�����˳���");
                    bool = false;
                default:
                    System.out.println("�����д������������롣");
                    break;
            }
        } while (bool);
    }

    // ��ʼ������
    public void init() {
        admins[0][0] = "admin";
        admins[0][1] = "123456";

    }
    public void loginView() {
        System.out.println("��ӭ...........!");
        int count = 0;
        do {
            System.out.println("�������û����� ");
            String usrername = scanner.nextLine();
            System.out.println("���������룺");
            String password = scanner.nextLine();
            // ��֤�Ƿ��¼�ɹ�
            if(isLogin(username, password)) {
                count = 0; // ���
                // ��֤���
                if ("admin".equals(username)) {
                    adminView();
                } else {
                    managerView();
                }
            } else {
                count++;
                System.out.println("��¼ʧ�ܣ�" + count + "��");
                if (count == 3) {
                    System.out.println("�������Ͼ�Ҫ�ر��ˣ�");
                }
            }
        } while (count < 3);
    }

    /**
     * ��֤�û��������Ƿ��¼�ɹ�
     *
     * @param username �û���
     * @param password ����
     * @return ��¼�ɹ�����true�����򷵻�false
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
        System.out.println("��ӭ�������Ա����!");
    }

    /*
     * ���ܽ���
     */
    public void adminView() {
        System.out.println("��ӭ���볬�ܽ��棡");
        do {
            System.out.println("1����ѯ���й���Ա��Ϣ");
            System.out.println("2�����ӹ���Ա��Ϣ");
            System.out.println("3���޸Ĺ���Ա��Ϣ");
            System.out.println("4��ɾ������Ա��Ϣ");
            System.out.println("0���˳����ܽ���");
            System.out.print("��ѡ��");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 0:
                    return;
                case 1:
                    System.out.println("�����ѯ���й���Ա��Ϣ����");
                    showManagerView();
                    break;
                case 2:
                    System.out.println("�������ӹ���Ա��Ϣ����");
                    newManagerView();
                    break;
                case 3:
                    System.out.println("�����޸Ĺ���Ա��Ϣ����");
                    changeManagerView();
                    break;
                case 4:
                    System.out.println("����ɾ������Ա��Ϣ����");
                    delManagerView();
                    break;
                default:
                    System.out.println("�����������������롣");
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
     * �ͷ���Դ
     */


    /*
     * ��ѯ���й���Ա��Ϣ����
     */
    public void showManagerView() {
        System.out.println("��ӭ�����ѯ���й���Ա��Ϣ���棡");
        System.out.println("---------------------------");
        showManager();
        System.out.println("---------------------------");
        System.out.println("���س������أ�");
        scanner.nextLine();
    }

    /*
     * ��ʾ���й���Ա��Ϣ��ҵ�񷽷�
     */
    public void showManager() {

        String sql = "select * from Manager";
        System.out.println("���\t����Ա����\t����");

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
     * ���ӹ���Ա��Ϣ
     */
    public void newManagerView() {
        System.out.println("��ӭ�������ӹ���Ա��Ϣ���棡");
        newManager();
        showManager();
    }

    /*
     * ��ѯ��ǰ����Ա����Ч�����ķ���
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
     * ��ѯ�û����Ƿ����
     *
     * @param username
     * @return ���ڷ���true�������ڷ���false
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
     * @return �½��ɹ�����true�����򷵻�false
     */
    public void newManager() {
        boolean bool = false;
        do {
            System.out.println("���������ӵı�ţ�");
            int newid = scanner.nextInt();
            System.out.println("�����������û�����");
            String newusername = scanner.next();
            System.out.println("���������룺");
            String newpassword = scanner.next();
            System.out.println("���ٴ��������룺");
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
                System.out.println("�������벻һ�£����������룡");
                bool = true;
            }
        } while (bool);
    }



    /*
     * �޸Ĺ���Ա��Ϣ����
     */
    public void changeManagerView() {
        System.out.println("��ӭ�����޸Ĺ���Ա��Ϣ���棡");
        changeManager();
        showManager();
    }

    /*
     * �޸Ĺ���Ա��Ϣҵ�񷽷�
     */
    public void changeManager() {
        boolean bool = false;
        do {
            System.out.println("�������û�����");
            String username = scanner.next();
            System.out.println("�����������룺");
            String newpassword = scanner.next();
            System.out.println("���ٴ�ȷ�������룺");
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
                System.out.println("�����������������룡");
                bool = true;
            }
        }while(bool);
    }


    /*
     * ɾ������Ա��Ϣ����
     */
    public void delManagerView() {
        System.out.println("��ӭ����ɾ������Ա��Ϣ���棡");
        boolean bool = false;
        do {
            showManager();
            System.out.print("������ѡ��ɾ���ı�ţ�");
            int choose = scanner.nextInt();
            scanner.nextLine();
            int count = getManagerCount();
            if (choose >= 1 && choose <= count) {
                System.out.println("�Ƿ�ȷ��ɾ��(y/n)?");
                String isDel = scanner.next();
                if ("y".equalsIgnoreCase(isDel)) {
                    if (delManager(choose)) {
                        System.out.println("ɾ���ɹ���");
                        showManager();
                    } else {
                        System.out.println("ɾ��ʧ�ܣ�");
                    }
                }
                bool = false;
            } else {
                System.out.println("ѡ�����������ѡ��");
                bool = true;
            }
        } while (bool);
    }

    /**
     * ɾ������Աҵ�񷽷�
     *
     * @param id ���
     * @return ɾ���ɹ�����true��ɾ��ʧ�ܷ���false
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
