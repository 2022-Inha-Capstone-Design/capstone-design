package com.capstone.domain.review.application;

import com.capstone.domain.menu.dao.MenuRepository;
import com.capstone.domain.menu.domain.Menu;
import com.capstone.domain.menu.exception.NotFoundMenuException;
import com.capstone.domain.review.dao.ReviewRepository;
import com.capstone.domain.review.domain.Review;
import com.capstone.domain.review.dto.ReviewDto.*;
import com.capstone.domain.review.dto.ReviewMapper;
import com.capstone.domain.user.dao.UserRepository;
import com.capstone.domain.user.domain.User;
import com.capstone.domain.user.exception.NotFoundUserException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final UserRepository userRepository;
    private final MenuRepository menuRepository;
    private final ReviewMapper reviewMapper;

    @Override
    public ReviewResponse save(ReviewRequest request) {
        User user = userRepository.findByKakaoId(request.getUserId()).orElseThrow(NotFoundUserException::new);
        Menu menu = menuRepository.findById(request.getMenuId()).orElseThrow(NotFoundMenuException::new);
        Review review = reviewMapper.toEntity(request, user, menu);
        return reviewMapper.toReviewResponse(reviewRepository.save(reviewRepository.save(review)));
    }
}
