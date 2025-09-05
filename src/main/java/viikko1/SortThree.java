package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
    int min1 = Math.min(a,b);
    int max1 = Math.max(a,b);

    int minFinal = Math.min(min1,c);
    int maxFinal = Math.max(max1,c);

    int mid = (a+b+c)-minFinal-maxFinal;

    String minStr = Integer.toString(minFinal);
    String maxStr = Integer.toString(maxFinal);
    String midStr = Integer.toString(mid);

    System.out.println(minStr+" "+midStr+" "+maxStr);
    return minStr + "," + midStr + "," +  maxStr;
    }
}
