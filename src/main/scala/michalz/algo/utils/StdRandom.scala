package michalz.algo.utils

import java.time.Instant

import scala.collection.immutable.Range.Inclusive
import scala.util.Random

/**
 * @author mzajac
 * @since 2014.11.27
 */
class StdRandom(seed: Long) {
  def this() = this(System.currentTimeMillis)
  
  val random = new Random(seed)
  
  def intRange(numberOfInts: Int, fromRange: Int, toRange: Int) = {
    assert(fromRange < toRange, "Invalid range")
    val range: Inclusive = fromRange to toRange
    
    val randomNumbers = for(cnt <- 0 until numberOfInts) yield range(random.nextInt(range.size))
    randomNumbers.toArray
  }
}
