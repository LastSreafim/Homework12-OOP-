public class Main {
    public static void main(String[] args) {
        Author lev = new Author("Лев", "Толстой");
        System.out.println("Имя автора: " + lev.getName());
        System.out.println("Фамилия автора: " + lev.getSurname());


        Author sergei = new Author("Сергей", "Есенин");
        System.out.println(sergei.toString());

        Book warAndPeace = new Book("Война и Мир", lev, 1873);
        System.out.println(warAndPeace.toString());
        warAndPeace.setBookYear(2024);
        System.out.println(warAndPeace.getBookYear());

        Book eseninCollection = new Book("Сборник стихов Есенина", sergei, 1924);
        System.out.println(eseninCollection.toString());
    }


}

