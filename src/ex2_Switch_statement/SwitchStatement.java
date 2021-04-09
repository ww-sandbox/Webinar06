package ex2_Switch_statement;

public class SwitchStatement {
    public static void main(String[] args) {
        String dayOfWeek = "Sroda";

        switch (dayOfWeek){
            case "Poniedzialek":
                System.out.println("Nie lubię poniedziałków");
                break;
            case "Wtorek":
                System.out.println("To już wtorek");
                break;
            case "Sroda":
                System.out.println("Coraz bliżej weekend");
                break;
            default:
                System.out.println("Nie znam takiego dnia tygodnia");
                break;

//        Poniższy kod ilustruje realizację tego switcha z wykorzystaniem
//        instrukcji if-else. Jak widać kod jest mniej czytelny i wymaga
//        więcen nakładów na dodawanie kolejnych przypadków
//
//        if(dayOfWeek.equals("Poniedzialek")){
//            System.out.println(...);
//        }else if(dayOfWeek.equals("Wtorek")){
//            System.out.println(...);
//        }else if(dayOfWeek.equals("Sroda")){
//            System.out.println(...);
//        }
//        ...
        }
    }
}
