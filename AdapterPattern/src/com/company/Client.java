package com.company;

public class Client{

    /*Client code produces speed in MPH*/
    private double speed;

    Client(double s)
    {
        speed = s;
    }

    double getSpeed()
    {
        return speed;
    }
    void getSpeed(target t)
    {
        t.convertSpeed(speed);
    }



}
