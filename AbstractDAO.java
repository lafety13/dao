import java.util.List;

public class AbstractDAO<T> implements DAO<T> {
    private List<T> localDb;

    protected void setDb(List<T> db) {
        localDb = db;
    }

    @Override
    public List<T> getAll() {
        return localDb;
    }

    @Override
    public void save(T obj) {
        localDb.add(obj);
        System.out.println(localDb);
    }
}
