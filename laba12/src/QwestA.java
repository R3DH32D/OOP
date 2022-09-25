public class QwestA {
    public static String NumberFound(String[] args)
    {
        String word="zawarudoOverheaven1";
        String numbers="1234567890";
        String outPut="в слове нет числа";
        for (int i=0;i< word.length(); ++i)
        {
            for (int j=0;j< numbers.length(); ++j)
            {
                if (word.charAt(i)==numbers.charAt(j))
                {
                    outPut="в слове есть число";
                }
            }
        }
        return outPut;

    }
}

