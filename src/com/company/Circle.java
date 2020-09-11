package com.company;

public class Circle implements Base
{
    int rad;
    int S;
    int P;
    @Override
    public void setItem1(int rad)
    {
        this.rad = rad;
    }
    public void setItem2(int S)
    {
        this.S = S;
    }
    public void setItem3(int P)
    {
        this.P = P;
    }

    @Override
    public int getItem1() {
        return rad;
    }

    @Override
    public int getItem2() {
        return S;
    }

    @Override
    public int getItem3() {
        return P;
    }
}
