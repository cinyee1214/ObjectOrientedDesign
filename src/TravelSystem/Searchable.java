package TravelSystem;

import java.util.List;

public interface Searchable<E> {
    public List<E> search(String str);
}
