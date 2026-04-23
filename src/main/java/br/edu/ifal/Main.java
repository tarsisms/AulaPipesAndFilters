package br.edu.ifal;


public class Main {
    public static void main(String[] args) {
        Pipeline<Integer> pipeline = new Pipeline<>();

        // pipeline.addFilter(new StepOne()); // 10 + 10  -> x
        pipeline.addFilter(new StepTwo()); // x + 20 -> y

        int output = pipeline.execute(10);
        System.out.println("Pipeline result: " + output);
    }
}