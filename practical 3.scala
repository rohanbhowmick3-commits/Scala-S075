import scala.util.Random
import scala.math.sqrt

object VarianceSD {
  def main(args: Array[String]): Unit = {

    // Generate 10 random numbers
    val data = List.fill(10)(Random.nextInt(100))

    // Mean
    val mean = data.sum.toDouble / data.length

    // Variance
    val variance = data.map(x => math.pow(x - mean, 2)).sum / data.length

    // Standard Deviation
    val stdDev = sqrt(variance)

    println("Random Data: " + data)
    println("Mean = " + mean)
    println("Variance = " + variance)
    println("Standard Deviation = " + stdDev)
  }
}