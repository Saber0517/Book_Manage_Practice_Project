package com.springapp.mvc.controller.abandon;

import com.springapp.mvc.entity.Food;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by ZHANGJA4 on 8/18/2015.
 */
@Controller
@RequestMapping(value = {"/food"})
@SessionAttributes("shoppingList")
public class ShoppingCarController {

    @RequestMapping(value = {"/add/foodId/{foodId}/foodPrice/{foodPrice}"})
    public List<Food> addFoodIntoShoppingCar(@ModelAttribute("shoppingList") List<Food> shoppingList, @PathVariable String foodId, @PathVariable String foodPrice, Model model) {
        Food food = new Food();
        food.setFoodId(foodId);
        System.out.println(foodId);
        System.out.println(foodPrice);
        food.setFoodPrice(foodPrice);
        shoppingList.add(food);
        return shoppingList;
    }

    @RequestMapping(value = "/show")
    public String showTheList() {
        return "redirect:bookingList";
    }

   /* @RequestMapping(value = {"/panel","../panel"})
    public String showPanel() {
        return "panel";
    }*/


}
