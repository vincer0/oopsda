package com.HotelService;

import java.util.List;

public interface CRUDRepository<T extends Room> {
    void add(T t);
    void delete(T t);
    List<T> getList();
}
