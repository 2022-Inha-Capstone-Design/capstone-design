package com.capstone.domain.review.api;

import com.capstone.domain.review.application.ReviewService;
import com.capstone.domain.review.dto.ReviewDto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
@RequestMapping("/reviews")
@RestController
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    public ResponseEntity<ReviewResponse> save(@Valid @RequestBody ReviewRequest request) {
        return ResponseEntity.status(CREATED).body(reviewService.save(request));
    }
}
