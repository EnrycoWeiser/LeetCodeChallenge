//date: 04/03/2024

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int fine = nums.length - 1;
        int lower = -1;
        int upper = -1;

        while(start <= fine)
        {
            int index = (fine+start)/2;
            if (nums[index] == target)
            {
                boolean leftFound = false;
                boolean rightFound = false;
                lower = index;
                upper = index;
                while(true)
                {
                    if (lower > 0 && nums[lower-1] == target)
                        lower = lower-1;
                    else
                        leftFound = true;
                    if (upper < nums.length-1 && nums[upper+1] == target)
                        upper = upper+1;
                    else
                        rightFound = true;

                    if (leftFound && rightFound)
                        break;
                }

                int[] returna = {lower, upper};
                return returna;
            }
            else if (nums[index] > target)
                fine = index-1;
            else if (nums[index] < target)
                start = index+1;
        }  
        int[] notfound = {-1,-1};
        return notfound;  
    }
}