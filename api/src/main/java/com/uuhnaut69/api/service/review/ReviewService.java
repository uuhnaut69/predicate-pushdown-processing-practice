package com.uuhnaut69.api.service.review;

import com.uuhnaut69.api.document.Review;
import com.uuhnaut69.api.payload.request.ReviewRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Set;


/**
 * @author uuhnaut
 * @project demo
 */
public interface ReviewService {

    Page<Review> findCommentsOfProduct(Pageable pageable, Long productId);

    Review findById(String id);

    Review create(Long productId, ReviewRequest reviewRequest);

    Review update(String reviewId, ReviewRequest reviewRequest);

    void delete(String reviewId);

    Set<Review> findAllByRatingGte(int rating);

}
