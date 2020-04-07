package Scala_01_basic.Scala_03_ParttenMatch
/**
  * ʹ��Ԫ�棨ģʽƥ�䣩
  * 1.ʹ��Tuple2�洢2�����ݵ�
  * 2.����Ԫ���е�ÿ��Ԫ��
  * 3.ʹ��TupleN��洢�������ϵ����ݵ�
  * 4.�����Ԫ����ʹ��ģʽƥ��
  * 5.����Ԫ��Ŀ�ݷ�ʽ
  * */
object TupleN {
  def main(args: Array[String]): Unit = {
    //1.ʹ��Tuple2�洢2�����ݵ�
    println("Step 1: Using Tuple2 to store 2 data points")
    val glazedDonutTuple = Tuple2("Glazed Donut","Very Tasty")
    println(s"Glazed Donut with 2 data point = $glazedDonutTuple")

    //2.����Ԫ���е�ÿ��Ԫ��
    println("\nStep 2: Access each element in tuple")
    val donutType = glazedDonutTuple._1
    val donutTasteLevel = glazedDonutTuple._2
    println(s"$donutType taste level is $donutTasteLevel")

    //3.ʹ��TupleN��洢�������ϵ����ݵ�
    println("\nStep 3: Using TupleN classes to store more than 2 data points")
    val glazedDonut = Tuple3("Glazed Donut","Very Tasty",2.50)
    println(s"${glazedDonut._1} taste level is ${glazedDonut._2} and it's price is ${glazedDonut._3}")

    //4.�����Ԫ����ʹ��ģʽƥ��
    println("\nStep 4: How to use pattern matching on Tuples")
    val strawberryDonut = Tuple3("Strawberry Donut", "Very Tasty", 2.50)
    val plainDonut = Tuple3("Plain Donut", "Tasty", 2)
    val donutList = List(glazedDonut,strawberryDonut,plainDonut)
    val priceOfPlainDonut = donutList.foreach {
      tuple => {
        tuple match {
          case ("Plain Donut",taste,price) => println(s"Donut type = Plain Donut, price = $price")
          case d if d._1 == "Glazed Donut" => println(s"Donut type = ${d._1}, price = ${d._3}")
          case _ => None
        }
      }
    }

    //5.����Ԫ��Ŀ�ݷ�ʽ
    println("\nStep 5: Shortcut for creating Tuples")
    val chocolateDonut = ("Chocolate Donut", "Very Tasty", 3.0)
    println(s"Chocolate donut taste level = ${chocolateDonut._2}, price = ${chocolateDonut._3}")

    println("\nTip 1: A more elegant pattern matching within foreach function")
    donutList.foreach {
      case ("Plain Donut", taste, price) => println(s"Donut type = Plain Donut, price = $price")
      case d if d._1 == "Glazed Donut" => println(s"Donut type = ${d._1}, price = ${d._3}")
      case _ => None
    }
  }
}
