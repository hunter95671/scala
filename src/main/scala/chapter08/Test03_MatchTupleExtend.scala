package chapter08

object Test03_MatchTupleExtend {

  def main(args: Array[String]): Unit = {

    //1.在变量声明时匹配
    val (x, y) = (10, "hello")
    println(s"x:$x,y:$y")

    val List(first, second, _*) = List(23, 56, 88, 5)
    //val List(first,second,rest)=List(23,56,88,5)  报错

    val fir :: sec :: rest = List(23, 56, 88, 5)
    println(s"fir:$fir sec:$sec rest:$rest") //fir:23 sec:56 rest:List(88, 5)

    println("================================")

    //2.for推导式中进行模式匹配
    val list: List[(String, Int)] = List(("a", 1), ("b", 2), ("c", 3),("a", 11))

    //2.1 原本的遍历方式
    for (elem <- list) {
      println(elem._1 + " " + elem._2)
    }

    println("================================")

    //2.2 将List的元素直接定义为元组，对变量赋值
    for ((word, count) <- list) {
      println(word + " " + count)
    }

    println("================================")

    //2.3 不考虑某个位置的变量，只遍历key或者value
    for ((word, _) <- list) {
      println(word)
    }

    println("================================")

    //2.4 可以指定某个位置的值必须是多少
    for (("a", count) <- list) {
      println("a"+" "+count)
    }

  }
}
