//package com.test.entities;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//
//
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import jakarta.persistence.*;
//
//import java.util.Date;  // Change to java.util.Date
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@SpringBootApplication
//@Table(name = "user_like")
//public class LikeEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private long id;
//
//    @ManyToOne
//    @JoinColumn(name = "post_Id", nullable = false)
//    private PostEntity post;
//
//    @ManyToOne
//    @JoinColumn(name = "user_Id", nullable = false)
//    private User userLike;
//
//    @Column(name = "status", columnDefinition = "BIT")  // Change to BIT
//    private boolean status;
//
//    @Column(name = "created_at", nullable = false, columnDefinition = "DATETIME")
//    private Date createdAt;
//
//    @Column(name = "updated_at", nullable = false, columnDefinition = "DATETIME")
//    private Date updatedAt;
//
//	public void setUserId(Object userId) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setPostId(Object postId) {
//		// TODO Auto-generated method stub
//		
//	}
//
//    // Constructors, getters, and setters
//}
