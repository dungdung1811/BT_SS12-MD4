package com.ra.service;

import java.util.List;

public interface IGeneric<T,ID> {
    List<T> findAll();
    Boolean save (T t);
    T findId (ID id);
    Boolean update(T t ,ID id);
    void delete(ID id);


}
