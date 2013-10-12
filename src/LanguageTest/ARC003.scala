package LanguageTest

object ARC003 extends App {
  var map = new Array[Int](10)
  var tmp = readLine.split(" ")
  for (i <- 1 to 10) {
    map(tmp(i - 1).toInt) = i - 1
  }
  var N = readInt
  var a = new Array[String](N)
  for (i <- 1 to N) {
    a(i - 1) = readLine
  }
  a = a.sortWith { (x, y) =>
    var ret = true
    if (x.length() != y.length()) {
      ret = x.length() < y.length();
    } else {
      var hit = false
      for (i <- 0 to x.length() - 1) {
        if (!hit && x(i) != y(i)) {
          ret = map(x(i) - '0') < map(y(i) - '0')

          hit = true;
        }
      }
    }
    ret
  }

  a.foreach(println)

}