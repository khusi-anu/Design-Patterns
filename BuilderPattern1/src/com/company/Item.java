package com.company;

public interface Item {

    void setName(String name);
    void doPacking();
    void setPrice(float amount);
    float getPrice();
    String getName();
}

abstract class BurgerItem implements Item{

    Packing packing;


    @Override
    public void doPacking() {
        packing = new Wrapper();
    }

    abstract public Item order();
}

class VegBurger extends BurgerItem{

    public String name;
    public float price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(float amount) {
        price = amount;
    }

    @Override
    public Item order() {
        return new VegBurger();
    }

    @Override
    public float getPrice() {
        return price;
    }
}

class ChickenBurger extends BurgerItem{

    public String name;
    public float price;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPrice(float amount) {
        price = amount;
    }

    @Override
    public Item order() {
        return new ChickenBurger();
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}

abstract class ColdDrink implements Item{

    Packing packing;
    @Override
    public void doPacking() {
        packing = new Bottle();
    }

    abstract public Item order();

}

class Pepsi extends ColdDrink{

    public String name;
    public float price;

    @Override
    public void setName(String name) {
        this.name = name ;
    }

    @Override
    public void setPrice(float amount) {
        price = amount;
    }

    @Override
    public Item order() {
        return new Pepsi();
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}

