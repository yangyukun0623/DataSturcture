package Scala_07_MySQL

import java.sql.{Connection, DriverManager}

object Connection {
    def main(args: Array[String]): Unit = {
        val driver = "com.mysql.jdbc.Driver"
        val url = "jdbc:mysql://localhost:3306/scala"
        val username = "root"
        val password = "606623"
        Class.forName(driver)
        val conn:Connection = DriverManager.getConnection(url, username, password)
        println(conn)
        
    }
}
