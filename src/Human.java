public class Human {
    public String name;
    public String city;
    public int age;
    public String post;

    public Human(String name, String city, int age, String post) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (city == null) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
        if (post == null) {
            this.post = "Информация не указана";
        } else {
            this.post = post;
        }
    }
}