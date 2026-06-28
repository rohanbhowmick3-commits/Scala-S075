import breeze.linalg._
import breeze.stats.distributions.Rand

object RandomMatrixExample {
  def main(args: Array[String]): Unit = {

    // Generate a random 3x3 matrix
    val matrix = DenseMatrix.rand[Double](3, 3, Rand.uniform)

    // Transpose
    val transpose = matrix.t

    // Determinant
    val determinant = det(matrix)

    println("Random Matrix:")
    println(matrix)

    println("\nTranspose:")
    println(transpose)

    println("\nDeterminant:")
    println(determinant)
  }
}