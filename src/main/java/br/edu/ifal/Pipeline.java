package br.edu.ifal;

import java.util.ArrayList;
import java.util.List;

public class Pipeline<T> {

    private List<Filter<T>> filters;

    public Pipeline() {
        filters = new ArrayList<>();
    }

    public void addFilter(Filter<T> filter) {
        filters.add(filter);
    }

    public T execute(T input) {
        T result = input;
        for (Filter<T> filter : filters) {
            result = filter.execute(result);
        }

        return result;
    }
}
