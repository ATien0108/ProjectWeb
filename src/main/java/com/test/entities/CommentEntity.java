//package com.test.entities;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//
////import javax.persistence.*;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//
//import jakarta.persistence.*;
//
//
//import java.sql.Date;
//import java.sql.Timestamp;
//
//@Data
//@AllArgsConstructor
//@Entity
//@Table(name = "user_comment")
//public class CommentEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private long commentidID;
//
//    @Column(name = "message", columnDefinition = "TEXT")
//    private String content;
//
//    @ManyToOne
//    @JoinColumn(name = "post_id")
//    @JsonBackReference
//    private PostEntity postComment;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    @JsonBackReference
//    private User userComment;
//
//    @Column(name = "created_at")
//    private Date commentDate;
//
//    @Column(name = "update_at")
//    private Date updateAt;
//
//    @Column(name = "image", columnDefinition = "TEXT")
//    private String image;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private PostEntity post;
//    
//    // Constructors
//    public CommentEntity() {
//    }
//
//    public CommentEntity(String content, PostEntity postComment, User userComment,
//                         Date commentDate, Date updateAt, String image) {
//        this.content = content;
//        this.postComment = postComment;
//        this.userComment = userComment;
//        this.commentDate = commentDate;
//        this.updateAt = updateAt;
//        this.image = image;
//    }
//
//    // Getters and setters
//
//    public long getCommentidID() {
//        return commentidID;
//    }
//
//    public void setCommentidID(long commentidID) {
//        this.commentidID = commentidID;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public PostEntity getPostComment() {
//        return postComment;
//    }
//
//    public void setPostComment(PostEntity postComment) {
//        this.postComment = postComment;
//    }
//
//    public User getUserComment() {
//        return userComment;
//    }
//
//    public void setUserComment(User userComment) {
//        this.userComment = userComment;
//    }
//
//    public Date getCommentDate() {
//        return commentDate;
//    }
//
//    public void setCommentDate(Date commentDate) {
//        this.commentDate = commentDate;
//    }
//
//    public Date getUpdateAt() {
//        return updateAt;
//    }
//
//    public void setUpdateAt(Date updateAt) {
//        this.updateAt = updateAt;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    @Override
//    public String toString() {
//        String userName = (userComment != null) ? userComment.getFullName() : "Unknown User";
//        String userId = (userComment != null) ? String.valueOf(userComment.getUserID()) : null;
//        return "CommentEntity{" +
//                "commentidID=" + commentidID +
//                ", userId=" + userId +
//                ", userName='" + userName + '\'' +
//                ", content='" + content + '\'' +
//                ", commentDate=" + commentDate +
//                ", updateAt=" + updateAt +
//                ", image='" + image + '\'' +
//                '}';
//    }
//
//	public void setCreatedAt(Timestamp timestamp) {
//		// TODO Auto-generated method stub
//		
//	}
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
//}
