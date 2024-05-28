package com.raju.rating.services;

import com.raju.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    //Create Rating
    Rating saveRating(Rating rating);

    //Get All Ratings
    List<Rating> getAllRating();

    //Get Single Rating of given ratingId
    Rating getRating(String ratingId);

    //
}
