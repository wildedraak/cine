package sv.edu.ufg.CINEMA.service.impl;

import java.util.List;

public interface ICRUD<T, ID> {
        T save(T t);
        T update(T t);
        T findById(ID id);
        List<T> findAll();
        void delete(ID id);
}
