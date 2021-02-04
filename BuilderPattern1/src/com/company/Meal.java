package com.company;

import java.util.ArrayList;

class Meal {

    ArrayList<Item> items;
    Meal()
    {
        items = new ArrayList<>();
    }
    void addItems(Item item)
    {
        items.add(item);
    }
    float getCost()
    {
        float total = 0;
        int size = items.size();
        for(int i = 0; i < size; i++)
            total += items.get(i).getPrice();
        return total;
    }
    void showMeal(){
        items.forEach(item -> {
            System.out.println( item.getName() + " " + item.getPrice());
        });
    }
}
class MealBuilder {

    void prepareVegPepsiMeal(Meal meal){

        Item item1, item2;
        item1 = new VegBurger();
        item1.setName("Veg");
        item1.setPrice(75);
        item1.doPacking();
        item2 = new Pepsi();
        item2.setName("Pepsi");
        item2.setPrice(150);
        item2.doPacking();
        meal.addItems(item1);
        meal.addItems(item2);
    }


}

