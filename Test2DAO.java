import java.util.ArrayList;
import java.util.List;

public class Test2DAO<T extends Integer> extends AbstractDAO<T> implements DAO<T> {
    private List<T> hotelDb = new ArrayList<>();

    {
        super.setDb(hotelDb);
    }

    @Override
    public void save(T obj) {
        super.save(obj);
    }

    @Override
    public List<T> getAll() {
        return super.getAll();
    }
}
