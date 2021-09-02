package main.scala.fp

object Introduction extends App {

  // Hello World N Times
  def f(n: Int): Unit = println("Hello World\n" * n)

  // List Replication
  def listReplication(num: Int, arr: List[Int]): List[Int] = {
    /*
    val tempList = scala.collection.mutable.ListBuffer.empty[Int]
    arr.foreach{ t =>
      (1 to num).foreach(_ => tempList += t)
    }
   tempList
   */

    arr.flatMap(List.fill(num)(_))
  }

  // Filter Array
  def filterArray(delim: Int, arr: List[Int]): List[Int] = {
    val tempList = scala.collection.mutable.ListBuffer.empty[Int]
    arr.foreach { t =>
      if (t < delim) tempList += t
    }
    tempList.toList
    //arr.filter(_<delim)
  }

}
