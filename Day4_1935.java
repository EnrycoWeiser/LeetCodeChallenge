//date: 29/02/24

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] parole = text.split(" ");
        int paroleBrutte = 0;

        for(int i = 0; i < parole.length; i++)
        {
            for (int j = 0; j < parole[i].length(); j++)
            {
                if (brokenLetters.indexOf(parole[i].charAt(j)) != -1)
                {
                    paroleBrutte++;
                    break;
                }

            }
        }
        return (parole.length - paroleBrutte);
    }
}
