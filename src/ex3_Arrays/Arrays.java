package ex3_Arrays;

public class Arrays {
    public static void main(String[] args) {
        int[] tab = new int[5];
        System.out.println(tab.length);

        for (int x: tab
             ) {
            System.out.println(tab[x]);
        }

        int i = 5;
        while(i>0){
            System.out.println(i--);
        }
        do{
            System.out.println(i++);
        } while(i<5);
    }
}
