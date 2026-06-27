import scala.util.Random
import scala.math.sqrt

object VarianceSD {
  def main(args: Array[String]): Unit = {

    val numbers = List.fill(10)(Random.nextInt(100))

    val mean = numbers.sum.toDouble / numbers.length

    val variance =
      numbers.map(x => math.pow(x - mean, 2)).sum / numbers.length

    val stdDev = sqrt(variance)

    println("Dataset: " + numbers)
    println("Mean = " + mean)
    println("Variance = " + variance)
    println("Standard Deviation = " + stdDev)
  }
}

