public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;

        Human maksim = new Human("Максим", "Минск", 35, "бренд-менеджер");
        Human anya = new Human("Аня", "Москва", 29, "методист образовательных программ");
        Human katya = new Human("Катя", "Калининград", 28, "продакт-менеджер");
        Human artyom = new Human("Артём", "Москва", 27, "директор по развитию бизнеса");

        System.out.println("Привет! Меня зовут " + maksim.name + ". Я из города " + maksim.city + ". Я родился в " + (currentYear - maksim.age) + " году. Я работаю на должности " + maksim.post + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name + ". Я из города " + anya.city + ". Я родилась в " + (currentYear - anya.age) + " году. Я работаю на должности " + anya.post + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.city + ". Я родилась в " + (currentYear - katya.age) + " году. Я работаю на должности " + katya.post + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artyom.name + ". Я из города " + artyom.city + ". Я родился в " + (currentYear - artyom.age) + " году. Я работаю на должности " + artyom.post + ". Будем знакомы!");
    }
}
