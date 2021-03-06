package com.uuhnaut69.api.repository;

import com.uuhnaut69.api.document.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @author uuhnaut
 * @project demo
 */
@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {

    Page<Review> findAllByProductId(Pageable pageable, Long productId);

    void deleteAllByProductId(Integer productId);

    Set<Review> findAllByRatingGreaterThanEqual(int rating);

}
