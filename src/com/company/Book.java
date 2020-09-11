package com.company;

public class Book implements Base
{
    int year;
    String name;
    String author;
    Book(int year, String name, String author)
    {
        this.year = year;
        this.author = author;
        this.name = name;
    }

    @Override
    public void setItem1(int item) {
        this.year = item;
    }

    @Override
    public void setItem2(int item) {

    }

    @Override
    public void setItem3(int item) {

    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

    @Override
    public int getItem1() {
        return year;
    }

    @Override
    public int getItem2() {
        return 0;
    }

    @Override
    public int getItem3() {
        return 0;
    }

    public String getName()
    {
        return this.name;
    }
    public String getAuthor()
    {
        return this.author;
    }

}
