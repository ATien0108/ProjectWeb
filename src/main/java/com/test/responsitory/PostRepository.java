//package com.test.responsitory;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.test.entities.PostEntity;
//
//@Repository
//public interface PostRepository extends JpaRepository<PostEntity, Long> {
//	// Truy vấn lấy thông tin của một post bằng ID, truy vấn like comment
//    
//    @Query("SELECT p FROM PostEntity p LEFT JOIN FETCH p.likes LEFT JOIN FETCH p.comments WHERE p.id = :postId")
//    Optional<PostEntity> findPostWithDetailsById(@Param("postId") Long postId);
//
//    @Query("SELECT DISTINCT p FROM PostEntity p LEFT JOIN FETCH p.likes LEFT JOIN FETCH p.comments")
//    List<PostEntity> findAllPostsWithDetails();
//}
