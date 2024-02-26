class Solution {
    public int pivotInteger(int n) {
        int somma_total = (n*(n+1))/2;
        int somma_parz = 0;

        for (int i = 1; i <= n; i++)
        {
            somma_parz += i;
                if (somma_parz == somma_total - (somma_parz - i))
                    return i;
        }
        return -1;
    }
}