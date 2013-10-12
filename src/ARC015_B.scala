object ARC015_B extends App {
  override def main(args: Array[String]): Unit = {
    var N = readLine.toInt;
    var res = new Array[Int](6);
    for (i <- 1 to N) {
      var MT = readDouble;
      var mT = readDouble;

      if (MT >= 35) {
        res(0) += 1;
      } else if (MT >= 30) {
        res(1) += 1;
      } else if (MT >= 25) {
        res(2) += 1;
      }
      if (mT >= 25) {
        res(3) += 1;
      }
      if (MT >= 0 && mT < 0) {
        res(4) += 1
      } else if (MT < 0) {
        res(5) += 1
      }
    }
    println(res.mkString(" "));
  }
}