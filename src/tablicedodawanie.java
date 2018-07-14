public class tablicedodawanie {
    public static void main (String[] args)
    {
        int j=11;
    int[] tab = new int[10];
    for(int i=0;i<tab.length;i++)
    {
        tab[i]=j;
        j=j+11;
    }
       for(int i=0;i<tab.length;i++)
       {
           System.out.println(tab[i]);
       }
    }
}
