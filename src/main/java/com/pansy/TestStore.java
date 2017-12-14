package com.pansy;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestStore {

    @Autowired
    private Store<String> s1;

    @Autowired
    private Store<Integer> s2;

    @Autowired
    private List<Store<Integer>> storeList;
}
