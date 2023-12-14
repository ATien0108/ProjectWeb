//package com.test.entities;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import jakarta.persistence.*;
//
//import java.sql.Timestamp;
//import java.util.List;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//@Table(name = "user_post")  // Make sure to use the correct table name
//public class PostEntity {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private long postID;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
//
//    @ManyToOne
//    @JoinColumn(name = "sender_id")
//    private User sender;
//
//    @Column(name = "content", columnDefinition = "TEXT")
//    private String content;
//
//    @Column(name = "created_at")
//    private Timestamp createdAt;
//
//    @Column(name = "updated_at")
//    private Timestamp updatedAt;
//
//    @Column(name = "image", columnDefinition = "TEXT")
//    private String image;
//
//    // Additional fields from user and sender entities
//    @Transient  // Ignoring this field during database mapping
//    private String userAccountName;
//
//    @Transient
//    private String avata;
//
//    @Transient
//    private String imageURL;
//
//    @Transient
//    private String userFullName;
//
//    @Transient
//    private boolean liked;
//
//    // Trong PostEntity
//    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
//    private List<LikeEntity> listLikes;
//
//    @OneToMany(mappedBy = "postComment", fetch = FetchType.LAZY)
//    private List<CommentEntity> listComments;
//
//    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<LikeEntity> likes;
//
//    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private List<CommentEntity> comments;
//    
//	public long getUserId() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	public long getSenderId() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	public void setSenderId(Object senderId) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void setUserId(Object userId) {
//		// TODO Auto-generated method stub
//		
//	}
//}
