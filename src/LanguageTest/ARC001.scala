

package LanguageTest

object ARC001 extends App {
  var N = readInt;
  var map = new Array[Int](4);
  var sp = readLine
  for (i <- 1 to N) {
    var c = sp(i - 1).toInt - '0'
    map(c - 1) += 1
  }
  var max = 0;
  var min = N;
  map.foreach { i =>
    if (i > max) max = i
    if (i < min) min = i
  }
  println(max + " " + min)
}