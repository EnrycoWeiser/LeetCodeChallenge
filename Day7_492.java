//date: 03/03/24

class Solution {
    public int[] constructRectangle(int area) {
        int W = (int)Math.sqrt(area);
        int L;
        
        while(area%W != 0)
            W--;
        
        L = area/W;

        int[] risultato = {L, W};
        return risultato;
    }
}