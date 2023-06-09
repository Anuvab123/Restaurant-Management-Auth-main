package com.example.Restaurantmanagementapi.repository;

import com.example.Restaurantmanagementapi.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IFoodItemRepository extends JpaRepository<FoodItem, Long> {


    FoodItem findByFoodId(Long foodId);
}
