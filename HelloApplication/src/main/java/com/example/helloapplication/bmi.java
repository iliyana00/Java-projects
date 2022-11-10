package com.example.helloapplication;

public class bmi
{
    private String name;
    private int age;
    private double weight;
    private double height;
    private double bmi=0;

    public bmi(String name, int age, double weight, double height )
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
    }

    public double getBMI()
    {
        bmi=weight/(height*height) * 10000;
        return bmi;
    }
    public String getStatus()
    {
        if(bmi>=30)
        {
            return "Obesity";
        }
        else if(bmi>=25)
        {
            return "Overweight";
        }
        else if(bmi>=18.5)
        {
            return "Normal";
        }
        else
        {
            return "underweight";
        }

    }

}