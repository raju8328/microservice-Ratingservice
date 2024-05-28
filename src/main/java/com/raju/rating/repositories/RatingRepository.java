package com.raju.rating.repositories;

import com.raju.rating.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating,String> {
}
