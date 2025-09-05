package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
       double summa =0;
    int n = arr.length;
    if(arr.length == 0)
    {
        return 0.0;
    }
    for(int i =0; i < n; i++)
    {
        summa += arr[i];
    }

    System.out.println(summa / n);
    return summa / n;

    }
    public static int max(int[] arr) {
       int edellinensuurin =0;
    int nykyinenSuurin =0;
    int n = arr.length;
    if(arr.length == 0)
    {
        return Integer.MIN_VALUE;
    }
    for(int i =0; i < n; i++)
    {
        edellinensuurin = arr[i];
        if(edellinensuurin >= nykyinenSuurin)
            {
            nykyinenSuurin = edellinensuurin;
            } 
    }
    System.out.println(nykyinenSuurin);
    return nykyinenSuurin;
    }
}
