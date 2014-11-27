package michalz.algo.analysis

import com.typesafe.scalalogging.LazyLogging
import michalz.algo.utils.{FileUtils, StdRandom, StopWatch}

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

object ThreeSumFileRunner {

  def main(args: Array[String]) {
    val input: Array[Int] = FileUtils.readIntsFromFile(args(0))
    val stopWatch: StopWatch = StopWatch.start
    val numberOfTriples: Int = ThreeSum.calculate(input)
    println("Completed in %s, found %d triples".format(stopWatch.elapsedTime, numberOfTriples))
  }
}


object ThreeSumRandomRunner {
  val fromRange: Int = -10000
  val toRange: Int = 10000

  def main(args: Array[String]) {
    val numberOfInts: Int = args(0).toInt
    val stdRandom: StdRandom = new StdRandom
    val generatedArray: Array[Int] = stdRandom.intRange(numberOfInts, fromRange, toRange)
    val stopWatch: StopWatch = StopWatch.start
    val nrOfTriples: Int = ThreeSum.calculate(generatedArray)
    println("Completed in %s, found %d triples".format(stopWatch.elapsedTime, nrOfTriples))
  }
}

object ThreeSumSeriesRunner extends LazyLogging {

  val stdRandom = new StdRandom
  val fromRange = -100000
  val toRange = 100000

  private def performCalculation(size: Int) = {
    val generatedInput: Array[Int] = stdRandom.intRange(size, fromRange, toRange)
    val stopWatch = StopWatch.start
    ThreeSum.calculate(generatedInput)
    stopWatch.elapsedTime
  }

  def main(args: Array[String]) {
    val maxNumber = args(0).toInt
    val start = 1000
    performR(start)

    def performR(size: Int): Unit = {
      if(size <= maxNumber){
        logger.info("Size %d, time %s".format(size, performCalculation(size)))
        performR(size * 2)
      }
    }
  }
}
