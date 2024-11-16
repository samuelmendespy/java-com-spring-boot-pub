package me.dio.santander_dev_week_2023.service;

import java.util.List;

public interface CrudService<ID, T> {
    List<T> findAll();
    T findById(ID id);
    T create(T entity);
    T update(ID id, T entity);
    void delete(ID id);
}
