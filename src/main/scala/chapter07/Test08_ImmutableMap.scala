package chapter07

object Test08_ImmutableMap {

  def main(args: Array[String]): Unit = {

    //1.创建map
    val map1: Map[String, Int] = Map("a" -> 1, "b" -> 2)
    println(map1)
    println("===========")

    //2.遍历元素
    map1.foreach(println)
    println("===========")
    map1.foreach((kv: (String, Int)) => println(kv))
    println("===========")

    //3.取map中所有的key或者value
    for(key <-map1.keys){
      println(s"$key --> ${map1.get(key)}")
    }
    println("===========")

    //4.访问某一个key的value
    println("a："+map1.get("a").get)
    //指定默认返回值
    println("c："+map1.getOrElse("c",0))

    println(map1("a"))

  }
}
