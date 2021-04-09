package ex3_Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] tab = new int[5];
        int[] tab2 = {3, -11, 7, 0};
        showTable(tab);
        showTable(tab2);
        tab2[3] = 1;
        showTable(tab2);
    }
//  Metoda/funkcja służąca do wyświetlania wielkości i zawartości przekazanej tablicy
//  skupcie się na razie na obsłudze samej tablicy. Temat pętli omówimy na najbliższych zajęciach
    public static void showTable(int[] tab){
        System.out.println("Wielkość tablicy " + tab.length);
        for (int x: tab
        ) {
            System.out.println(x);
        }
    }
}
