package com.HotelService;

import java.util.ArrayList;
import java.util.List;

public abstract class DefaultRepository<T extends Room> implements CRUDRepository<T> {

    private List<T> list = new ArrayList<>();

    @Override
    public void add(T t) {
        System.out.println(String.format("Dodaję %s do: %s", t, getRepositoryName()));
        list.add(t);
    }

    @Override
    public void delete(T t) {
        System.out.println(String.format("Usuwam %s do: %s", t, getRepositoryName()));
        list.remove(t);
    }

    @Override
    public List<T> getList() {
        System.out.println(String.format("Pobieram listę z: %s", getRepositoryName()));
        return list;
    }

    public abstract String getRepositoryName();
}
