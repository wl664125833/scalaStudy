package test

object ListTest {
  //  Scala 列表类似于数组，它们所有元素的类型都相同，但是它们也有所不同：
//  列表是不可变的，值一旦被定义了就不能改变，其次列表 具有递归的结构（也就是链接表结构）而数组不是。。
//列表的元素类型 T 可以写成 List[T]。例如，以下列出了多种类型的列表：
  
  // 字符串列表
  val site: List[String] = List("Runoob", "Google", "Baidu")

  // 整型列表
  val nums: List[Int] = List(1, 2, 3, 4)

  // 空列表
  val empty: List[Nothing] = List()

  // 二维列表
  val dim: List[List[Int]] =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1))
      
  //构造列表的两个基本单位是 Nil 和 ::
  //Nil 也可以表示为一个空列表。
  //以上实例我们可以写成如下所示：
        
  // 字符串列表
  val site2 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
  
  // 整型列表
  val nums2 = 1 :: (2 :: (3 :: (4 :: Nil)))
  
  // 空列表
  val empty2 = Nil
  
  // 二维列表
  val dim2 = (1 :: (0 :: (0 :: Nil))) ::
            (0 :: (1 :: (0 :: Nil))) ::
            (0 :: (0 :: (1 :: Nil))) :: Nil
  def main(args: Array[String]) {
	  println(site)
	  println(nums)
	  println(empty)
    println(dim)
    println(site2)
    println(nums2)
    println(empty2)
    println(dim2)
  }
}