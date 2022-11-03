package OperationsOnArray;

public class FillingArray {
    public static void main(String[] args){
        int[] MKlausTablica = new int[10];

        for (int i = 0; i<MKlausTablica.length; i++)
            MKlausTablica[i] = 9 - i;
        for (int x : MKlausTablica)
            System.out.println("This table cell: "+MKlausTablica[x]+" have value: "+x);
    }
}
