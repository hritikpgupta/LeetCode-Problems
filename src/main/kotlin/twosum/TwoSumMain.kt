package twosum

fun main() {
    /***
    Given An Array [ 2,5,7,-4,7,12,5,-1,0,-4,8,31]
    Target is 10
    Print the indices of two value whose sum is equal to the target
     ***/
    // current value + x = target => x = target - current value
    val numList = arrayOf(2, 5, 7, -4, 7, 12, 5, -1, 0, -4, 8, 31)
    val target = 1
    print(compute(numList,target))
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val numMap = HashMap<Int, Int>()
    nums.forEachIndexed { index, value ->
        if (numMap.containsKey(target-value)) {
            return intArrayOf(numMap[target-value]!!,index)
        } else {
            numMap[value] = index
        }
    }
    return intArrayOf(0,0)
}


fun compute(numList : Array<Int>, target : Int) : String{
    val numMap = HashMap<Int, Int>()
    numList.forEachIndexed { index, value ->
        if (numMap.containsKey(target - value)) {
            return "Target $target can be achived by adding values at : ${numMap[target - value]} and $index "
        } else {
            numMap[value] = index
        }
    }
    return "Can not find any combination."
}

