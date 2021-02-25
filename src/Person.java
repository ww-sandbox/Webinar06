public class Person {
    String name;
    String surname;
    int age;
    boolean likesTraveling;

    Person(){
        this.name = "unknown";
        this.surname = "unknown";
        this.age = 0;
        this.likesTraveling = false;
    }

    public Person(String name, String surname, int age, boolean likesTraveling) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.likesTraveling = likesTraveling;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isLikesTraveling() {
        return likesTraveling;
    }

}
