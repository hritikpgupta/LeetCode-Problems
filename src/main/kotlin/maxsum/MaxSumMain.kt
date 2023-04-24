package maxsum

fun main() {
    /**
     * Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.
     * Input  : arr[] = {100, 200, 300, 400}, k = 2
     * Output : 700
     *
     * Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4
     * Output : 39
     * We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.
     */
    val numList = arrayOf(1, 4, 2, 10, 23, 3, 1, 0, 20)
    println(maxSum(numList.size, 4, numList))
}

fun maxSum(size: Int, maxElement: Int, numList: Array<Int>): Int {
    var maxSum = Int.MIN_VALUE
    for (i in 0 until size - maxElement + 1) {
        var currentSum = 0
        for (j in 0 until maxElement){
            currentSum += numList[i + j]
        }
        maxSum = currentSum.coerceAtLeast(maxSum)
    }
    return maxSum
}
