//package com.test.responsitory;
//
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.test.entities.LikeEntity;
//import com.test.entities.PostEntity;
//
//
//@Repository
//public interface LikeRepository extends JpaRepository<LikeEntity, Long>{
//	@Query(value = "SELECT COUNT(*) FROM user_like WHERE post_id = :postId", nativeQuery = true)
//    long countLikesForPost(@Param("postId") long postId);
//
//
//}
