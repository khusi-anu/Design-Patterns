package com.company;

interface target
{
    void convertSpeed(double speed);
}
public class adapter implements target{

    Server speedApp;
    void connect(Server app)
    {
        this.speedApp = app;
    }

    /*Convert speed to KmPH*/
    @Override
    public void convertSpeed(double speed) {
        double newSpeed = speed*1.60934;
        speedApp.moveCarWithSpeed(newSpeed);
    }


}
