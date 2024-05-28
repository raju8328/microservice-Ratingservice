package com.raju.rating.services;

import com.raju.rating.entities.Rating;
import com.raju.rating.exceptions.ResourceNotFound;
import com.raju.rating.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating saveRating(Rating rating) {
        String userId= UUID.randomUUID().toString();
        rating.setUserId(userId);
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public Rating getRating(String userId) {
        return ratingRepository.findById(userId).orElseThrow(()->new ResourceNotFound("Resource not found"));
    }
}
