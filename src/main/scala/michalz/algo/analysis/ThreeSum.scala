package michalz.algo.analysis

import michalz.algo.utils.{StopWatch, FileUtils}

/**
 * @author mzajac
 * @since 2014.11.27
 */
object ThreeSum {

  def calculate(input: Array[Int]): Int = {
    var cnt = 0
    for (i <- 0 until input.size) {
      for (j <- (i + 1) until input.size) {
        for (k <- (j + 1) until input.size) {
          if (input(i) + input(j) + input(k) == 0) cnt += 1
        }
      }
    }
    cnt
  }
}

object TreeSumFileRunner {

  def main(args: Array[String]) {
    val input: Array[Int] = FileUtils.readIntsFromFile(args(0))
    val stopWatch: StopWatch = StopWatch.start
    val numberOfTriples: Int = ThreeSum.calculate(input)
    println("Completed in %s, found %d triples".format(stopWatch.elapsedTime, numberOfTriples))
  }
}
