public class Main {
    public static void main(String[] args) {
        DAO<String> stringDAO = new TestDAO<>();
        stringDAO.save("hello");
        stringDAO.save("hello");
        stringDAO.save("hello");

        stringDAO.getAll().forEach(System.out::println);

        DAO<String> integerDAO = new TestDAO<>();
        integerDAO.save("str");
        integerDAO.save("str");
        integerDAO.save("qwe");

        integerDAO.getAll().forEach(System.out::println);

        DAO<Integer> stringDAO1 = new Test2DAO<>();
        stringDAO1.save(2);
        stringDAO1.save(2);
        stringDAO1.save(2);

        stringDAO1.getAll().forEach(System.out::println);
    }
}
