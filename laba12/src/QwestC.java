public class QwestC {
    public static char[] DeleteSigns(String[] args)
    {
        String word="m.kj,nfbf/v/vffv";
        String Signs=",./";

        char[] Rep=word.toCharArray();
        for (int i = 0; i < Rep.length; i++)
        {
            for (int j = 0; j < Signs.length(); j++)
            {
                if (Signs.charAt(j)==Rep[i])
                {
                    Rep[i]=' ';
                }
            }
        }
        return Rep;

    }
}
