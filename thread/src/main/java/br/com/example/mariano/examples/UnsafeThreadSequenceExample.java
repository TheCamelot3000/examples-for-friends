package br.com.example.mariano.examples;

import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public class UnsafeThreadExample {
    private int value;

    public int getNextValue() {
        return value++;
    }
}
