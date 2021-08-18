package chapter08

object Test02_MatchTypes {

  def main(args: Array[String]): Unit = {

    //1.匹配常量
    def describeConst(x: Any): String = x match {
      case 1 => "Int one"
      case "hello" => "String hello"
      case true => "Boolean true"
      case '+' => "Char +"
      case _ => ""
    }

    println(describeConst("hello"))
    println(describeConst(1))
    println(describeConst('+'))
    println(describeConst(0.7))

    println("=========================")

    //2.匹配类型
    def describeType(x: Any): String = x match {
      case i: Int => "Int " + i
      case s: String => "String " + s
      case list: List[String] => "List " + list
      case array: Array[Int] => "Array " + array.mkString(",")
      case a => "Something else " + a
    }

    println(describeType(1))
    println(describeType("hello"))
    println(describeType(List("a", "b", "c")))
    println(describeType(List(1, 2, 3))) //list有泛型擦除
    println(describeType(Array(1, 2, 3)))
    println(describeType(Array("a", "b", "c"))) //array没有泛型擦除

    println("=========================")

    //3.匹配数组
    for (arr <- List(
      Array(0),
      Array(1, 0),
      Array(0, 1, 0),
      Array(1, 1, 0),
      Array(2, 3, 7, 15),
      Array("hello", 20),
    )) {
      val result = arr match {
        case Array(0) => "0"
        case Array(1, 0) => "Array(1,0)"
        case Array(x, y) => s"Array($x,$y)" //匹配两元素数组
        case Array(0, _*) => "以0开头数组"
        case Array(x, 1, z) => "中间为1的三元素数组"
        case _ => "Something else"
      }
      println(result)
    }

    println("=========================")

    //4.匹配列表

    //方式一
    for (list <- List(
      List(0),
      List(1, 0),
      List(0, 0, 0),
      List(1, 1, 0),
      List(88),
    )) {
      val result = list match {
        case List(0) => "0"
        case List(x, y) => s"List($x,$y)"
        case List(0, _*) => "List(0,......)"
        case List(a) => s"List($a)"
        case _ => "Something else"
      }
      println(result)
    }

    println("=========================")

    //方式二
    val list = List(1, 2, 5, 7, 88)
    list match {
      case first :: second :: rest => println(s"first:$first,second:$second,rest:$rest")
      case _ => println("other")
    }

    println("=========================")

    //5.匹配元组
    for (tuple <- List(
      (0, 1),
      (0, 1),
      (0, 1, 0),
      (0, 1, 1),
      (1, 18, 28),
      ("hello", true, 8.8),
    )) {
      val result = tuple match {
        case (a, b) => s"a:$a,b:$b"
        case (0, _) => "(0,_)"
        case (a, 1, _ )=> "(a, 1, _)"
        case _ => "Something else"
      }
      println(result)
    }

  }
}
