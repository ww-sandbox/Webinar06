package ex1_If_statement;

public class IfStatement {

    public static void main(String[] args) {
        int nubmer = 5;
        System.out.println("Is number " + nubmer + " odd? - " + isOddNumber(nubmer));
    }

    public static boolean isOddNumber(int num){
        if(num % 2 != 0) {
            return true;
        }

        return false;
    }

    public void printIsEvenNumber(int num){
        //Stworz implementację sprawdzającą czy liczba jest parzysta
        //i wyświetlającą odpowiedni komunikat w przypadku parzystości/nieparzystości
        if(num%2==0){

        }
    }
}
