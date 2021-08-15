package chapter07

object Test04_List {

  def main(args: Array[String]): Unit = {

    //1.创建一个List
    val list1 = List(15, 16, 17)
    println(list1)

    //2.访问和遍历元素
    println(list1(1))
    //list1(1)=18   不能更改
    list1.foreach(println)

    //3.添加元素
    //最前添加
    val list2 = list1.+:(10)
    val list3 = 10 +: list1
    //最后添加
    val list4 = list1.:+(10)
    val list5 = list1 :+ 10

    println("===============")

    val list6 = list1.::(58)
    println(list6)

    val list7 = Nil.::(18)
    println(list7)

    val list8 = 32 :: Nil
    val list9 = 32 :: 18 :: 33 :: 34 :: 35 :: Nil

    //4.合并列表
    val list10=list8 ::: list9
    val list11=list8 ++ list9
    println(list10)

  }
}
