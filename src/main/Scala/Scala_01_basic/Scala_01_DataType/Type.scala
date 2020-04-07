package Scala_01_basic.Scala_01_DataType

import java.util

object Type {
  def main(args: Array[String]){
    /**
      * 1.Byte	8λ�з��Ų�����������ֵ����Ϊ -128 �� 127
      * 2.Short	16λ�з��Ų�����������ֵ����Ϊ -32768 �� 32767
      * 3.Int	32λ�з��Ų�����������ֵ����Ϊ -2147483648 �� 2147483647
      * 4.Long	64λ�з��Ų�����������ֵ����Ϊ -9223372036854775808 �� 9223372036854775807
      * 5.Float	32 λ, IEEE 754 ��׼�ĵ����ȸ�����
      * 6.Double	64 λ IEEE 754 ��׼��˫���ȸ�����
      * 7.Char	16λ�޷���Unicode�ַ�, ����ֵΪ U+0000 �� U+FFFF
      * 8.String	�ַ�����
      * 9.Boolean	true��false
      * 10.Unit	��ʾ��ֵ��������������void��ͬ�������������κν���ķ����Ľ�����͡�Unitֻ��һ��ʵ��ֵ��д��()��
      * 11.Null	null �������
      * 12.Nothing	Nothing������Scala����㼶����׶ˣ������κ��������͵������͡�
      * 13.Any	Any������������ĳ���
      * 14.AnyRef	AnyRef����Scala������������(reference class)�Ļ���
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
