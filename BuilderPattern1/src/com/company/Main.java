package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Meal meal = new Meal();
        MealBuilder build = new MealBuilder();

        /*MealBuilder is director (Don't confuse)*/
        build.prepareVegPepsiMeal(meal);
        meal.showMeal();;


    }
}
