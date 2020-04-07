package Scala_0n_Pratice.Scala_01_PraticeProblem.system

import scala.io.StdIn

class CustomerView {
	//定义一个循环变量，控制是否退出while
	var loop = true
	//定义一个key用于接收用户输入的选项
	var key = ' '
	def mainMenu() = {
		do {
			println("--------------客户信息管理软件--------------")
			println("                   1 添 加 客 户")
			println("                   2 修 改 客 户")
			println("                   3 删 除 客 户")
			println("                   4 客 户 列 表")
			println("                   5 退       出")
			println("请选择（1-5）：")
			key = StdIn.readChar()
			key match {
				case '1' => println("添 加 用 户")
				case '2' => println("修 改 用 户")
				case '3' => println("删 除 用 户")
				case '4' => println("客 户 列 表")
				case '5' => this.loop = false
			}
		} while (loop)
		println("你推出了软件系统...")
	}

	def list() = {
		println()
		println("--------------客户列表--------------")
		println("编号\t\t姓名\t\t性别\t\t年龄t\t电话\t\t邮箱")
		val customers = new CustomerService().list()
		for (customer <- customers) {
			println(customer)
		}
		println("------------客户列表完成------------")
	}
}
