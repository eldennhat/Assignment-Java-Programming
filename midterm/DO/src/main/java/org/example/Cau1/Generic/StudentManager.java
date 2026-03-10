package org.example.Cau1.Generic;

import java.util.ArrayList;
import java.util.List;

public class StudentManager<T> {
    private final List<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }
    public List<T> getAll() {
        return new ArrayList<>(data);
    }
}
