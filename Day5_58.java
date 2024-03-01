//date: 01/03/24

class Solution {
    public int lengthOfLastWord(String s) {
        String parole[] = s.split(" ");
        return parole[parole.length-1].length();
    }
}