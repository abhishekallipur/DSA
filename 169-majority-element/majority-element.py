class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        freq = {}
        high = 0
        ha =0

        for i in nums:
            if i in freq:
                freq[i]+=1
            else:
                freq[i]=1
        for i in freq:
            if high < freq[i]:
                high = freq[i]
                ha = i
        return ha

        

        