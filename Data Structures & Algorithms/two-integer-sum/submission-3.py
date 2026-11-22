class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        n = len(nums)
        for i in range(0,n):
            comp = target - nums[i]
            
            if comp in seen:
                return [seen[comp], i]  
            else:
                seen[nums[i]] = i