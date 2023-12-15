//package com.test.IServices.Impl;
//
//import com.test.entities.LikeEntity;
//import com.test.entities.PostEntity;
//import com.test.models.CommentModel;
//import com.test.models.CreatePostModel;
//import com.test.models.LikeModel;
//import com.test.models.PostModel;
//import com.test.responsitory.CommentRepository;
//import com.test.responsitory.LikeRepository;
//import com.test.responsitory.PostRepository;
//import com.test.entities.User;
//import com.test.IServices.ILikeService;
//import com.test.IServices.IUserService;
//import com.test.entities.CommentEntity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//
//import java.sql.Timestamp;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class PostService {
//
//    @Autowired
//    private LikeRepository likeRepo;
//    
//    @Autowired
//    private CommentRepository commentRepo;
//
//    @Autowired
//    private PostRepository postRepo;
//
//    @Autowired
//    private IUserService userInfoService;
//
//    @Autowired
//    private ILikeService likeService;
//
//    public PostModel convertEntityToModel(PostEntity post, long userId) {
//    	PostModel postModel = new PostModel();
//    	User userInfo = userInfoService.findById(post.getUserId()).orElse(null);
//        postModel.setPostID(post.getPostID());
//        postModel.setUserId(post.getUserId());
//        postModel.setSenderId(post.getSenderId());
//        postModel.setContent(post.getContent());
//        postModel.setCreatedAt(post.getCreatedAt());
//        postModel.setUpdatedAt(post.getUpdatedAt());
//        postModel.setImage(post.getImage());
//
//        // Additional fields from user and sender entities
//        postModel.setUserAccountName(post.getUserAccountName());
//        postModel.setAvata(post.getAvata());
//        postModel.setImageURL(post.getImageURL());
//        postModel.setUserFullName(post.getUserFullName());
//        postModel.setLiked(post.isLiked());
//
//        // Count likes and comments
//        postModel.setLikeCount(countLikes(post.getListLikes()));
//        postModel.setCommentCount(countComments(post.getListComments()));
//
//        return postModel;
//    }
//
//    public List<PostModel> getAllPostsAndCountLikesAndComments(long userId) {
//        List<PostEntity> allPosts = postRepo.findAll();
//        List<PostModel> postModels = new ArrayList<>();
//
//        for (PostEntity post : allPosts) {
//            PostModel postModel = convertEntityToModel(post, userId);
//            long likeCount = countLikes(post.getListLikes());
//            long commentCount = countComments(post.getListComments());
//
//            postModel.setLikeCount(likeCount);
//            postModel.setCommentCount(commentCount);
//
//            postModels.add(postModel);
//        }
//
//        return postModels;
//    }
//
//
//    private long countLikes(List<LikeEntity> likes) {
//        // Count the number of likes with 'status' set to true in the list of likes
//        return likes.stream().filter(LikeEntity::isStatus).count();
//    }
//
//    private long countComments(List<CommentEntity> comments) {
//        // Count the number of comments in the list of comments
//        return comments.size();
//    }
//
//
//    public PostEntity createPost(CreatePostModel createPostModel) {
//        // Tạo một đối tượng PostEntity từ CreatePostModel
//        PostEntity newPost = new PostEntity();
//        newPost.setUserId(createPostModel.getUserId());
//        newPost.setSenderId(createPostModel.getSenderId());
//        newPost.setContent(createPostModel.getContent());
//        newPost.setImage(createPostModel.getImage());
//        newPost.setCreatedAt(new Timestamp(System.currentTimeMillis())); // Set the current timestamp
//        newPost.setUpdatedAt(newPost.getCreatedAt());
//
//        // Lưu bài viết mới vào cơ sở dữ liệu
//        return postRepo.save(newPost);
//    }
//
//    public LikeEntity likePost(LikeModel likeModel) {
//        // Tạo một đối tượng LikeEntity từ LikeModel
//        LikeEntity like = new LikeEntity();
//        like.setUserId(likeModel.getUserId());
//        like.setPostId(likeModel.getPostId());
//        like.setStatus(true); // Đặt trạng thái là true, đánh dấu là đã thích
//
//        // Lưu like vào cơ sở dữ liệu
//        return likeRepo.save(like);
//    }
//
//    public CommentEntity addComment(CommentModel commentModel) {
//        // Tạo một đối tượng CommentEntity từ CommentModel
//        CommentEntity comment = new CommentEntity();
//        comment.setUserId(commentModel.getUserId());
//        comment.setPostId(commentModel.getPostId());
//        comment.setContent(commentModel.getContent());
//        comment.setCreatedAt(new Timestamp(System.currentTimeMillis())); // Set the current timestamp
//
//        // Lưu comment vào cơ sở dữ liệu
//        return commentRepo.save(comment);
//    }
//    
//    public long getCommentCountForPost(Long postId) {
//        return commentRepo.countCommentsByPostId(postId);
//    }
//
//}
//
