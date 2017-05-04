package test
import Array._
object ArrayTest2 {
  def main(args: Array[String]) {
    //多维数组
    var myMatrix = ofDim[Int](3, 3)

    // 创建矩阵
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }

    // 打印二维阵列
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }

    //合并数组
    //以下实例中，我们使用 concat() 方法来合并两个数组，concat() 方法中接受多个数组参数
    var myList1 = Array(1.9, 2.9, 3.4, 3.5)
    var myList2 = Array(8.9, 7.9, 0.4, 1.5)

    var myList3 = concat(myList1, myList2)

    // 输出所有数组元素
    for (x <- myList3) {
      println(x)
    }

    //创建区间数组
    //以下实例中，我们使用了 range() 方法来生成一个区间范围内的数组。range() 方法最后一个参数为步长，默认为 1：
    var myList4 = range(10, 20, 2)
    var myList5 = range(10, 20)

    // 输出所有数组元素
    for (x <- myList4) {
      print(" " + x)
    }
    println()
    for (x <- myList5) {
      print(" " + x)
    }
  }
}