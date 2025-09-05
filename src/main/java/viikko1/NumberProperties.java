package viikko1;

public class NumberProperties {
    public static String describe(int n) {
         if(n > 0 && n%2 == 0)
    {
    String positiivinenParillinen = "positiivinen parillinen";
    return positiivinenParillinen;
    }
        else if(n > 0 && n%2 != 0)
    {
    String positiivinenEiParillinen = "positiivinen pariton";
    return positiivinenEiParillinen;
    }
    else if(n == 0)
     {
    String nolla = "nolla";
    System.out.println("nolla");
        return nolla;
     }
    else if(n < 0 && n%2 == 0)
     {
    String negatiivinenParillinen = "negatiivinen parillinen";
    return negatiivinenParillinen;
     }
    else{
    String negatiivinenPariton = "negatiivinen pariton";
    return negatiivinenPariton;
     }
    }
}
