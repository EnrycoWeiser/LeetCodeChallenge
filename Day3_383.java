//date: 28/02/24

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] magazineArray = magazine.toCharArray();
        for (int i = 0; i < ransomNote.length(); i++)
        {
            boolean isFound = false;
            for (int j = 0; j < magazine.length(); j++)
            {
                if (ransomNote.charAt(i) == magazineArray[j])
                {
                    magazineArray[j] = 'A';
                    isFound = true;
                    break;
                }
            }
            if (isFound == false)
                return false;
        }
        return true;
    }
}