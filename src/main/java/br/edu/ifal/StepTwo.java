package br.edu.ifal;

public class StepTwo implements Filter<Integer> {
    @Override
    public Integer execute(Integer input) {
        return input + 20;
    }
}
