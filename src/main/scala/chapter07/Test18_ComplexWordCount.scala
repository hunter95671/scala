package chapter07

object Test18_ComplexWordCount {

  def main(args: Array[String]): Unit = {
    val tupleList: List[(String, Int)] = List(
      ("hello world", 1),
      ("hello scala", 2),
      ("hunter", 5),
    )


    //思路一：直接展开为普通版本
    val newStringList = tupleList.map(
      kv => {
        (kv._1.trim + " ") * kv._2
      }
    )
    println(newStringList)

    //接下来操作与普通操作一致
    val wordCountList = newStringList
      .flatMap(_.split(" ")) //空格分词
      .groupBy(word => word) //按照单词分组
      .map(kv => (kv._1, kv._2.length)) //统计每个单词出现次数
      .toList //转为List
      .sortBy(_._2)(Ordering[Int].reverse) //排序
      .take(3) //取前三
    println(wordCountList)

    println("============================================")

    //思路二：直接基于预统计得到结果进行转换

    //1.将字符串打散成单词，并结合对应次数的个数包装成二元组
    val preCountList: List[(String, Int)] = tupleList.flatMap(
      tuple => {
        val strings: Array[String] = tuple._1.split(" ")
        strings.map(word => (word, tuple._2))
      }
    )

    println(preCountList)

    //2.对二元组按照单词进行分组
    val preCountMap: Map[String, List[(String, Int)]] = preCountList.groupBy(_._1)
    println(preCountMap)

    //3.叠加每个单词预统计的个数值
    val countMap: Map[String, Int] = preCountMap.mapValues(
      tupleList => {
        tupleList.map(_._2).sum
      }
    )
    println(countMap)

    //4.转换成list，排序取前三
    val countList = countMap.toList.sortWith(_._2 > _._2).take(3)
    println(countList)

  }
}
