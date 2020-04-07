package Scala_01_basic.Scala_01_DataType

import java.util

object Type {
  def main(args: Array[String]){
    /**
      * 1.Byte	8位有符号补码整数。数值区间为 -128 到 127
      * 2.Short	16位有符号补码整数。数值区间为 -32768 到 32767
      * 3.Int	32位有符号补码整数。数值区间为 -2147483648 到 2147483647
      * 4.Long	64位有符号补码整数。数值区间为 -9223372036854775808 到 9223372036854775807
      * 5.Float	32 位, IEEE 754 标准的单精度浮点数
      * 6.Double	64 位 IEEE 754 标准的双精度浮点数
      * 7.Char	16位无符号Unicode字符, 区间值为 U+0000 到 U+FFFF
      * 8.String	字符序列
      * 9.Boolean	true或false
      * 10.Unit	表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
      * 11.Null	null 或空引用
      * 12.Nothing	Nothing类型在Scala的类层级的最底端；它是任何其他类型的子类型。
      * 13.Any	Any是所有其他类的超类
      * 14.AnyRef	AnyRef类是Scala里所有引用类(reference class)的基类
      *
      *
      *
      *
      *
      * */
    def Fib(num:Int):Int = {
      if(num == 1 || num == 2)
        return 1
      else
        return Fib(num - 1) + Fib(num - 2)
    }
  }
}
