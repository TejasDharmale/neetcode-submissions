class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        n= len(nums)
        
        new_n = set(nums)
        if len(new_n)<len(nums):
            return True
            
        else:
            return False