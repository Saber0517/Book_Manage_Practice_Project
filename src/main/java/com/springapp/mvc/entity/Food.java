package com.springapp.mvc.entity;

import java.io.Serializable;

/**
 * Created by ZHANGJA4 on 8/18/2015.
 */
public class Food implements Serializable{
    String foodId;
    String foodPrice;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        if (foodId != null ? !foodId.equals(food.foodId) : food.foodId != null) return false;
        return !(foodPrice != null ? !foodPrice.equals(food.foodPrice) : food.foodPrice != null);

    }

    @Override
    public int hashCode() {
        int result = foodId != null ? foodId.hashCode() : 0;
        result = 31 * result + (foodPrice != null ? foodPrice.hashCode() : 0);
        return result;
    }
}
