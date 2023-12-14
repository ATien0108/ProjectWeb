//package com.test.responsitory;
//
//import java.sql.Date;
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import jakarta.transaction.Transactional;
//import com.test.entities.CommentEntity;
//import com.test.entities.PostEntity;
//
//@Repository
//public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
//	// Truy vấn lấy số lượng comment theo post_id
//    @Query("SELECT COUNT(c) FROM CommentEntity c WHERE c.post.id = :postId")
//    long countCommentsByPostId(@Param("postId") Long postId);
//}