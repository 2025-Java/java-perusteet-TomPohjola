package viikko1;

public class TimesTable {
    public static String table(int n) {
        int i =1;
        int summa = n * i; //n on kerroin
        
        String nStr = Integer.toString(n);
        String iStr = Integer.toString(i);
        String summaStr = Integer.toString(summa);
        String tuloste = "";

    for(i =1; i < 11; i++){
        nStr = Integer.toString(n);
        iStr = Integer.toString(i);
        summa = n*i;
        summaStr = Integer.toString(summa);

     tuloste += nStr+" "+"x"+" "+iStr+" "+"="+" "+summaStr+"\n";
     System.out.println(tuloste);
    }
    return tuloste;
    }
}
