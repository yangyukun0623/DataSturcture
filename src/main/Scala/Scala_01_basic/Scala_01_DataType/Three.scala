package Scala_01_basic.Scala_01_DataType

object Three {
    def main(args: Array[String]): Unit = {
        //Scala中不支持三目运算符
        //val num = 5 > 4 ? 5 : 4 //没有
        //在Scala中使用if-else实现
        val num = if (5 > 4) 5 else 4
        println(num)

        //求两个数的最大值
        val n1 = 4
        val n2 = 8
        var res = if (n1 > n2) n1 else n2
        println("res = " + res)

        val n3 = 11
        res = if (res > n3) res else n3
        println("res = " + n3)

        //运算符优先级
        /** 1.()[]
          * 2.单目运算      ！~
          * 3.算术运算符     // * / % + -
          * 4.移位运算符     >> >>> <<
          * 5.比较运算符（关系运算符）== !=
          * 6.位运算        & ^ \
          * 7.关系运算符    && ||
          * 8.赋值运算符    = += -= *= /= %= >>= <<= &= ^= |=
          * */
    }
}
