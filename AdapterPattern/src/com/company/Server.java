package com.company;

public class Server {

    double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void moveCarWithSpeed(double speed)
    {
        System.out.println("Car is moving with " + speed + " km/hr" );
    }
}
