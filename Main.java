public class Main {
    public static void main(String[] args) {
        DAO<String> stringDAO = new TestDAO<>();
        stringDAO.save("hello");
        stringDAO.save("hello");
        stringDAO.save("hello");

        stringDAO.getAll().forEach(System.out::println);

        DAO<Integer> integerDAO = new TestDAO<>();
        integerDAO.save(1);
        integerDAO.save(1);
        integerDAO.save(1);

        integerDAO.getAll().forEach(System.out::println);

        DAO<String> stringDAO1 = new Test2DAO<>();
        stringDAO1.save("Second db");
        stringDAO1.save("Second db");
        stringDAO1.save("Second db");

        stringDAO1.getAll().forEach(System.out::println);
    }
}
