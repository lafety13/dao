public class Main {
    public static void main(String[] args) {
        DAO<String> stringDAO = new HotelDAO<>();
        stringDAO.save("hello");
        stringDAO.save("hello");
        stringDAO.save("hello");

        DAO<Integer> integerDAO = new HotelDAO<>();
        integerDAO.save(1);
        integerDAO.save(1);
        integerDAO.save(1);

        stringDAO.getAll().forEach(System.out::println);
        integerDAO.getAll().forEach(System.out::println);
    }
}
