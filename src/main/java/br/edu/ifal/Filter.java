package br.edu.ifal;

public interface Filter<T> {
    T execute(T input);
}
