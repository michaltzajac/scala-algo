package michalz.algo.utils

import java.time
import java.time.{Duration, Instant}

/**
 * Created by michal on 27.11.14.
 */
class StopWatch {
  val startTime = Instant.now()

  def elapsedTime = {
    Duration.between(startTime, Instant.now)
  }
}

object StopWatch {
  def start = new StopWatch
}
