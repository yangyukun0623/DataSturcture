package Scala_0n_Pratice.Scala_01_PraticeProblem.system

import scala.collection.mutable.ArrayBuffer

class CustomerService {
	//customers是存放客户的，这里我们先初始化，为了测试
	val customers = ArrayBuffer(new Customer(1, "tom", '男', 10, "110", "tom@sohu.com"))

	def list() = {
		this.customers
	}

	def add(customer: Customer) = {
		//设置id

	}
}
