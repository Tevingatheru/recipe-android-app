package com.example.recipe;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface RecipesDao {
    @Insert
    void insertAll(List<Recipes> recipesList);

    @Query("SELECT * FROM Recipes")
    List<Recipes> getAll();
}
