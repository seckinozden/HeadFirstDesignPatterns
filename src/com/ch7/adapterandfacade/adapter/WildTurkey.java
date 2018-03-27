package com.ch7.adapterandfacade.adapter;

public class WildTurkey implements Turkey {


    @Override
    public void gobble() {
        System.out.println("Wild Turkey gobbling");
    }

    @Override
    public void fly() {
        System.out.println("Wild turkey flying");
    }
}
