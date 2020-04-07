package Scala_01_basic.Scala_01_DataType
/**
  * Scala-���ת���ַ������������ַ���
  * 1.���ת��Json String
  * 2.ʹ�÷�б��ת������
  * 3.ʹ��������''''''ת���ַ�
  * 4.ʹ��stripMargin���������ı�
  *
  * */
object Escape {
    def main(args: Array[String]): Unit = {
        //1.���ת��Json String
        println("Step 1: How to escape a Json String")
        //val donutJson: String = "{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"
        println()

        //2.ʹ�÷�б��ת������
        println("Step 2: Using backslash to escape quotes")
        val donutJson2: String = "{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
        println(s"donutJson2 = $donutJson2")
        println()

        //3.ʹ��������''''''ת���ַ�
        println("Step 3: Using triple quotes \"\"\" to escape character")
        val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
        println(s"donutJson3 = $donutJson3")
        println()

        //4.ʹ��stripMargin���������ı�
        println("Step 4: Creating multi-line text using stripMargin")
        val donutJson4:String =
            """
              |{zde
              |"donut_name":"Glazed Donut",
              |"taste_level":"Very Tasty",
              |"price":2.50
              |}
            """.stripMargin
        println(s"donutJson4 = $donutJson4")
    }
}
