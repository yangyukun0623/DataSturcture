package Scala_0n_Pratice.Scala_01_PraticeProblem.system

import scala.io.StdIn

class CustomerView {
	//����һ��ѭ�������������Ƿ��˳�while
	var loop = true
	//����һ��key���ڽ����û������ѡ��
	var key = ' '
	def mainMenu() = {
		do {
			println("--------------�ͻ���Ϣ�������--------------")
			println("                   1 �� �� �� ��")
			println("                   2 �� �� �� ��")
			println("                   3 ɾ �� �� ��")
			println("                   4 �� �� �� ��")
			println("                   5 ��       ��")
			println("��ѡ��1-5����")
			key = StdIn.readChar()
			key match {
				case '1' => println("�� �� �� ��")
				case '2' => println("�� �� �� ��")
				case '3' => println("ɾ �� �� ��")
				case '4' => println("�� �� �� ��")
				case '5' => this.loop = false
			}
		} while (loop)
		println("���Ƴ������ϵͳ...")
	}

	def list() = {
		println()
		println("--------------�ͻ��б�--------------")
		println("���\t\t����\t\t�Ա�\t\t����t\t�绰\t\t����")
		val customers = new CustomerService().list()
		for (customer <- customers) {
			println(customer)
		}
		println("------------�ͻ��б����------------")
	}
}
