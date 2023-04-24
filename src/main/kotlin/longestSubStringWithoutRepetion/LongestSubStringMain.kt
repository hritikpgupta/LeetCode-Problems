package longestSubStringWithoutRepetion

fun main() {

    val str = "GEEKSFORGEEKS"
    println(longestUniqueSubString(str))

}
fun longestUniqueSubString(str: String): Int {
    var test = ""
    var maxLength = -1
    if (str.isEmpty()) {
        return 0
    } else if (str.length == 1) {
        return 1
    }
    for (c in str.toCharArray()) {
        val current = c.toString()
        if (test.contains(current)) {
            test = test.substring(
                test.indexOf(current)
                        + 1
            )
        }
        test += c.toString()
        maxLength = test.length.coerceAtLeast(maxLength)
    }
    return maxLength
}