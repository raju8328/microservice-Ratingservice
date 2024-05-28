package com.raju.rating.controller;

import com.raju.rating.entities.Rating;
import com.raju.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    RatingService ratingService;

    //Create Rating
    @PostMapping("/createRating")
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
      Rating user1=ratingService.saveRating(rating);
      return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //Get All Ratings
    @GetMapping("/getAllRating")
    public ResponseEntity<List<Rating>> getAllRating(){
        List<Rating> user1=ratingService.getAllRating();
        return ResponseEntity.status(HttpStatus.OK).body(user1);
    }

    //Get Single Rating
    @GetMapping("/getSingleRating/{id}")
    public ResponseEntity<Rating> getSingleRating(@PathVariable(name = "id") String id ){
        Rating user1=ratingService.getRating(id);
        return ResponseEntity.status(HttpStatus.OK).body(user1);
    }
}
