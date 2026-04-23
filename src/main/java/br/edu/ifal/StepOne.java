package br.edu.ifal;

public class StepOne implements Filter<Integer>{
    @Override
    public Integer execute(Integer input) {
        return input + 10;
    }
}
