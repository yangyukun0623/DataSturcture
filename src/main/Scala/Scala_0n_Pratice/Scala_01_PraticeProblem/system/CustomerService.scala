package Scala_0n_Pratice.Scala_01_PraticeProblem.system

import scala.collection.mutable.ArrayBuffer

class CustomerService {
	//customers�Ǵ�ſͻ��ģ����������ȳ�ʼ����Ϊ�˲���
	val customers = ArrayBuffer(new Customer(1, "tom", '��', 10, "110", "tom@sohu.com"))

	def list() = {
		this.customers
	}

	def add(customer: Customer) = {
		//����id

	}
}
