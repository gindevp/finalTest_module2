package cotroller;

import model.DAO;
import storage.CSV;

import java.util.List;

public class DAOManager implements DAO {

    @Override
    public void add(List arr, Object element) {
        arr.add(element);
    }

    @Override
    public void edit(int index, List arr, Object element) {
        arr.set(index,element);
    }

    @Override
    public void remove(int index, List arr) {
        arr.remove(index);
    }
}
