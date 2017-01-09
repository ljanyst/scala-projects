
object SquareRoot extends App {
  def sqrt(x: Double) = {
    def iter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else iter(improve(guess))

    def abs(x: Double) = if (x >= 0) x else -x
    def improve(guess: Double) = (guess + x/guess)/2
    def isGoodEnough(guess: Double) = abs(x - guess*guess) < 0.00001 * x
    iter(1)
  }
  val s3 = sqrt(3)
  println(s"Suqare root of 3 is ${s3}")
}
