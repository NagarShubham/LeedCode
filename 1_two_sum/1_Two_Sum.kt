fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = hashMapOf<Int, Int>()
    nums.forEachIndexed { index, num ->
        val remaining = target - num
        map[remaining]?.let { return intArrayOf(map.getValue(remaining), index) }
        map[num] = index
    }
    return intArrayOf()
}