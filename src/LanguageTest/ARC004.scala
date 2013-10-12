package LanguageTest

object AMain extends App {
  override def main(args: Array[String]) = {
    val N = readInt;
    var day = new Array[Int](367);
    //祝日の処理
    for (i <- 1 to N) {
      var tmp = readLine.split("/");
      var d = getCountDay(tmp(0).toInt, tmp(1).toInt);
      day(d) += 1;
    }
    for (i <- 0 to 366) {
      if (i % 7 == 0 || i % 7 == 6) {
        day(i) += 1;
      }
    }
    var max = 0;
    var c = 0;
    for (i <- 0 to 366) {
      if (day(i) > 0) {
        c += day(i);
      } else {
        max = Math.max(c, max);
        c = 0
      }
    }
    println(max)
  }
  /**
   * 1月1日からの経過日を返す。
   */
  def getCountDay(m: Int, d: Int): Int = {
    val endDay = Array(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
    var sum = 0;
    for (i <- 0 to m - 2) {
      sum += endDay(i);
    }
    sum += d - 1;
    return sum;
  }
}