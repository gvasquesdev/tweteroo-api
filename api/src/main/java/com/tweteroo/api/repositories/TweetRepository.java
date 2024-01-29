package com.tweteroo.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tweteroo.api.models.TweetModel;

@Repository
public interface TweetRepository extends JpaRepository<TweetModel, Long> {

    @Query(value = "SELECT * FROM tweets WHERE user_id = :userId", nativeQuery = true)
    List<TweetModel> findTweetsByUserId(@Param("userId") Long userId);
}
