public class QwestB {
    public static char FindingLetter(String[] args)
    {
        int flag=0;
        int Counter1=0;
        int Counter2=0;
        String str="utsssbbaddddhhhhhhhhheem";
        char[] strch = str.toCharArray();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphabetch= alphabet.toCharArray();
        char Letter = ' ' ;

        int max=0;
        ;
        for (int i = 0; i < alphabet.length(); i++)
        {int count = 0;
            for (int j =0;j < str.length();j++)
            {
                if (strch[j]==alphabetch[i])
                {
                    count++;
                }


            }
            if (max<count ) {
                max = count;
                Letter=alphabetch[i];
            }
        }
        return Letter;
    }
}
