package test
//函数
object test5 {
  def printMe(){
    println("Hello, Scala!")
  }

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b
    return sum
  }
  def main(args: Array[String]): Unit = {
    printMe()
    printf("AASD" + addInt(2, 5))
  }
}