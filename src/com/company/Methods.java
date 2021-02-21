package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods <T> {
    public void changeElement(T [] m, int i, int j) {
        T var = m[i];
        m[i] = m[j];
        m[j] = var;
    }
    public ArrayList <T> arrayToList (T[] m){
        return new ArrayList<>(Arrays.asList(m));
    }

}