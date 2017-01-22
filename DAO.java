import java.util.List;

public interface DAO<T> {
    void save(T obj);
    List<T> getAll();
}
