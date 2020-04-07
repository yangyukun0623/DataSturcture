package Scala_01_basic.Scala_02_LogicStructure

object ForDemo2 {
	def main(args: Array[String]): Unit = {
		//ѭ������
		//ѭ����������ѭ������ʽ��Ҳ�������ж�ʽ�� ������
		//����ʽΪtrue�����ѭ�����ڲ��� Ϊfalse��������������continue
		for (i <- 1 until 10 if i != 2) {
			print(i + ", ")
		}
		println("\n--------------------")

		//�������
		for (i <- 1 to 6; j = 4 - i) {
			println(s"i = $i, j = $j")
		}
		println("\n--------------------")

		//Ƕ��ѭ��
		for (i <- 1 until 10; j <- 1 to i) {
			print(f"$j%2d *$i%2d = ${i * j}%-2d ")
			if (i == j) println()
		}
		println("\n--------------------")
		//ѭ������ֵ
//		var res = for (i <- 1 to 10) yield i
//		println(res)

		val res = for (i <- 1 to 10) yield {
			if (i % 2 == 0) {
				i
			} else {
				"����ż��"
			}
		}
		println(res)
		println("\n--------------------")

		//ʹ�û����Ŵ���С����
		for {
			i <- 1 to 6
			j = i * 2
		} {
			println(s"i = $i, j = $j")
		}
		println("\n--------------------")

		//��ӡ1~100֮��������9�ı����������ĸ������ܺ�
		var count = 0
		var sum = 0
		for (i <- 9 to 100 by 9) {
			count += 1
			sum += i
		}
		println(s"count = $count, sum = $sum")
		println("\n--------------------")

		//ͳ��1~200֮���ܱ�5���������ܱ�3�����ĸ���
		count = 0
		for (i <- 1 to 200 if i % 5 == 0 && i % 3 != 0) {
			count += 1
		}
		println(s"count = $count")


	}


}
