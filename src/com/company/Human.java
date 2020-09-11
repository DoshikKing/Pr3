package com.company;

public class Human
{
    int weight;
    int bones;

    void setBones(int bones)
    {
        this.bones = bones;
    }
    void setWeight(int weight)
    {
        this.weight = weight;
    }
    int getBones()
    {
        return bones;
    }
    int getWeight()
    {
        return weight;
    }

}
class Head extends Human{}
class Leg extends Human{}
class Body extends Human{}

class CreateHuman extends Human
{
    void goTest()
    {
        Head h = new Head(); Leg l = new Leg(); Body b = new Body();
        h.setBones(12);
        b.setBones(28);
        l.setBones(14);

        System.out.println(h.getBones());
        System.out.println(b.getBones());
        System.out.println(l.getBones());
    }

}