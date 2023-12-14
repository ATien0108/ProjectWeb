//package com.test.models;
//
//import com.test.entities.CommentEntity;
//import com.test.entities.LikeEntity;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.sql.Timestamp;
//import java.util.List;
//
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class PostModel {
//
//    private long postID;
//    private long userId;  // Assuming userId corresponds to the userId in the user_post table
//    private long senderId;  // Assuming senderId corresponds to the senderId in the user_post table
//    private String content;
//    private Timestamp createdAt;
//    private Timestamp updatedAt;
//    private String image;
//    private long likeCount;
//    private long commentCount;
//
//    // Additional fields from user and sender entities
//    private String userAccountName;
//    private String avata;
//    private String imageURL;
//    private String userFullName;
//    private boolean liked;
//
// // Trong PostModel
//    private List<LikeEntity> listLikes;
//    private List<CommentEntity> listComments;
//    
//    
//}
//
