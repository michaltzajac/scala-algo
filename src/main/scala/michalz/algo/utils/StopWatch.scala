package michalz.algo.utils

import java.time.{Instant, Duration}

/**
 * @author mzajac
 * @since 2014.11.27
 */
class StopWatch {
  val startTime = Instant.now
  
  def elapsedTime = Duration.between(startTime, Instant.now)
}

object StopWatch {
  def start = new StopWatch
}