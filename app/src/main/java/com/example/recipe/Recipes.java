package com.example.recipe;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Recipes {

    @PrimaryKey(autoGenerate = true)
    public Long uid;
    private final String recipeName;
    private final String recipeIngredients;
    private final String recipeMethodTitle;
    private final String recipe;
    private final int thumbnail;

    public Recipes(Long uid, String recipeName, String recipeIngredients, String recipeMethodTitle, String recipe, int thumbnail) {
        this.uid = uid;
        this.recipeName = recipeName;
        this.recipeIngredients = recipeIngredients;
        this.recipeMethodTitle = recipeMethodTitle;
        this.recipe = recipe;
        this.thumbnail = thumbnail;
    }

    public Recipes(String name, String recipeIngredients, String recipeMethodTitle, String recipe, int thumbnail){
        this.recipeName = name;
        this.recipeIngredients = recipeIngredients;
        this.recipeMethodTitle = recipeMethodTitle;
        this.recipe = recipe;
        this.thumbnail = thumbnail;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public  String getRecipeName(){
        return recipeName;
    }
    public String getRecipeIngredients(){
        return recipeIngredients;
    }

    public String getRecipeMethodTitle(){
        return recipeMethodTitle;
    }

    public String getRecipe(){
        return recipe;
    }

    public int getThumbnail(){
        return thumbnail;
    }
}
