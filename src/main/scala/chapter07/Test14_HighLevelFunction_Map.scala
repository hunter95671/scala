package chapter07

object Test14_HighLevelFunction_Map {

  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    //1.过滤
    //选取偶数
    //val evenList = list.filter((elem: Int) => {elem % 2 == 0})
    val evenList1 = list.filter(_ % 2 == 0)
    println(evenList1)
    //选取奇数
    val evenList2 = list.filter(_ % 2 == 1)
    println(evenList2)

    println("==================")

    //2.map
    //把集合中每个数乘2
    println(list.map(_ * 2))
    println(list.map(x => x * x))

    println("==================")

    //3.扁平化
    val nestedList: List[List[Int]] = List(List(1, 2, 3), List(4, 5), List(6, 7, 8, 9))

    val flatList1 = nestedList(0) ::: nestedList(1) ::: nestedList(2)
    println(flatList1)

    val flatList2 = nestedList.flatten
    println(flatList2)

    println("==================")

    //4.扁平映射
    //将一组字符串进行分词，并保存成单词的列表

    val strings: List[String] = List("hello word", "hello scala", "hello java")
    //分词
    // val splitList: List[Array[String]] = strings.map(string => string.split(" "))
    val splitList: List[Array[String]] = strings.map(_.split(" "))
    //打散扁平化
    val flattenList = splitList.flatten
    println(flattenList)

    //或者直接使用flatmap一步到位
    val flatmapList = strings.flatMap(_.split(" "))
    println(flatmapList)

    println("==================")

    //5.分组group by
    //分成奇数偶数两组
    val groupMap1: Map[Int, List[Int]] = list.groupBy(_ % 2)
    val groupMap2: Map[String, List[Int]] = list.groupBy(data => {if (data % 2 == 0) "偶数" else "奇数"})
    println(groupMap1)
    println(groupMap2)

    println("==================")

    //给定一组词汇，按照单词首字母分组
    val wordList=List("China","tom","java","CBA")
    println(wordList.groupBy(_.charAt(0)))


  }
}
