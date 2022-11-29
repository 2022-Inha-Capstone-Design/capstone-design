package com.capstone.domain.review.dto;

import com.capstone.domain.menu.domain.Menu;
import com.capstone.domain.review.domain.Review;
import com.capstone.domain.user.domain.User;
import org.mapstruct.Mapper;
import com.capstone.domain.review.dto.ReviewDto.*;

@Mapper(componentModel = "spring")
public interface ReviewMapper {

    default Review toEntity(ReviewRequest request, User user, Menu menu) {
        return Review.builder()
                .stars(request.getStars())
                .user(user)
                .menu(menu).build();
    }

    ReviewResponse toReviewResponse(Review review);
}
