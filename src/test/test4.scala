package test
//集合
object test4 {
  def main(args: Array[String]): Unit = {
    var index = 0;
    val numList = List(7, 2, 3, 4, 5, 6);

    // for loop execution with a collection  
    for (index <- numList) {
      println("Value of index: " + index);
    }
  }
}