package com.iftm.moviedataservice.resource;

import com.iftm.moviedataservice.model.Rating;
import com.iftm.moviedataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 9);
    }

    @RequestMapping("users/{userId}")
    public List<Rating> getUserRating(@PathVariable("userID") String userId){
        List<Rating> ratings = Arrays.asList(
                new Rating("1234",18),
                new Rating("1541",28)
        );
        UserRating userRating =  new UserRating();
        userRating.setUserRating(ratings);

        return ratings;
    }


}