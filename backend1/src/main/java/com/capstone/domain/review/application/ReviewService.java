package com.capstone.domain.review.application;

import com.capstone.domain.review.dto.ReviewDto.*;

public interface ReviewService {

    ReviewResponse save(ReviewRequest request);
}
