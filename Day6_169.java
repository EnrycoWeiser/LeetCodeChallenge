class Solution {
    public int majorityElement(int[] nums) {
        int conta = 0;
        int numero = nums[0];

        for (int i = 0; i < nums.length; i++)
        {
            if (conta == 0)
                numero = nums[i];
            
            if (nums[i] == numero)
                conta++;
            else
                conta--;
        }
        
        return numero;
    }
}
