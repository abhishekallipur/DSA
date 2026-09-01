class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:

        results = []

        if not nums:
            return results

        left = 0
        right = 0

        for i in range(len(nums) - 1):

            if nums[i] + 1 == nums[i + 1]:
                right += 1

            else:
                if left == right:
                    results.append(str(nums[left]))
                else:
                    results.append(str(nums[left]) + "->" + str(nums[right]))

                left = right + 1
                right = left

        # Add the final range
        if left == right:
            results.append(str(nums[left]))
        else:
            results.append(str(nums[left]) + "->" + str(nums[right]))

        return results