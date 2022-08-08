package cotroller;

import model.DAO;
import storage.CSV;

import java.util.List;

public class DAOManager implements DAO {

    @Override
    public void add(List arr, Object element, String pathFile) {
        arr.add(element);
        new CSV().writeFile(arr,pathFile);
    }

    @Override
    public void edit(int index, List arr, Object element, String pathFile) {
        arr.set(index,element);
        new CSV().writeFile(arr,pathFile);
    }

    @Override
    public void remove(int index, List arr, String pathFile) {
        arr.remove(index);
        new CSV().writeFile(arr,pathFile);
    }
}
