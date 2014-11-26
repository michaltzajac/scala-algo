package michalz.algo.analisys

import java.time.Duration
import java.time.temporal.TemporalUnit

import michalz.algo.utils.{FileUtils, StopWatch}

/**
 * Created by michal on 26.11.14.
 */
object TreeSum {

  def count(input: Array[Int]): Int = {

    var cnt = 0
    for(i <- 0 until input.length) {
      for(j <- (i + 1) until input.length) {
        for(k <- (j + 1) until input.length) {
          if(input(i) + input(j) + input(k) == 0) {
            cnt += 1
          }
        }
      }
    }

    cnt
  }

  def main(args: Array[String]) {
    val ints: Array[Int] = FileUtils.readInts(args(0))
    println("Numbers readed")
    val stopWatch: StopWatch = StopWatch.start
    val nrOfTriples: Int = TreeSum.count(ints)
    val elapsedTime: Duration = stopWatch.elapsedTime
    println("Runned %s, found %d triples".format(elapsedTime, nrOfTriples))
  }
}
