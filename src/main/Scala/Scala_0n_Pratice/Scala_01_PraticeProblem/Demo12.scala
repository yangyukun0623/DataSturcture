package Scala_0n_Pratice.Scala_01_PraticeProblem

/**
  * ��Ŀ���ж�101-200֮���ж��ٸ����������������������
  * */
object Demo12 {
    def main(args: Array[String]): Unit = {
        var count = 0
        for (x <- 101 to 200){
            if(prime(x)){
                count += 1
                print(x + " ")
            }
        }
        println("\nһ����" + count + "������")
    }

    def prime(num:Int):Boolean = {
        if (num == 1 || num == 2)
            false
        else {
            for (x <- 2 to math.sqrt(num).toInt){
                if(num % x == 0){
                    return false
                }
            }
            true
        }
    }
}
