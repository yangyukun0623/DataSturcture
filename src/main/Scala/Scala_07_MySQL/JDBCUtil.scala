package Scala_07_MySQL

import java.sql.{Connection, DriverManager}

object JDBCUtil {
	var database = "scala"
	private val driver =  "com.mysql.jdbc.Driver"
	private val url = "jdbc:mysql://localhost:3306/" + database
	private var user = "root"
	private var password = "606623"


//	def this(database:String = this.database, user:String = this.user, password:String = this.password) {
//		Class.forName(driver)
//		this.database = database
//		this.user = user
//		this.password = password
//	}

	def getConnection(database:String = database, user:String = user, password:String = password): Connection = {
		this.database = database
		DriverManager.getConnection(url, user, password)
	}

	def close(closeables:AutoCloseable*) : Unit = {
		for (closeable <- closeables) {
			if (closeable != null) {
				closeable.close()
			}
		}
	}
}
