package codes.HashMap

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hash = emptyMap<Int, Int>().toMutableMap()
        for (i in nums.indices) {
            val tmp = target - nums[i]
            if (tmp in hash.keys) {
                return intArrayOf(hash[tmp]!!, i)
            }
            hash[nums[i]] = i
        }
        return intArrayOf()
    }
}
