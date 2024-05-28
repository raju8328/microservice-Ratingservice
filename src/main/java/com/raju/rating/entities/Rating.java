package com.raju.rating.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Table(name="ratings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    @Id
    @Column(name="ID")
    private String ratingId;
    @Column(name="feedback")
    private String feedback;
    @Column(name="hotel_id")
    private String hotelId;
    @Column(name="rating")
    private int rating;
    @Column(name="user_id")
    private String userId;
}
