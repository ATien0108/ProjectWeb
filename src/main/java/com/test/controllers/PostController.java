//package com.test.controllers;
//
//import com.test.entities.CommentEntity;
//import com.test.entities.LikeEntity;
//import com.test.entities.PostEntity;
//import com.test.models.CommentModel;
//import com.test.models.CreatePostModel;
//import com.test.models.LikeModel;
//import com.test.models.PostModel;
//import com.test.responsitory.PostRepository;
//import com.test.IServices.Impl.PostService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/posts")
//public class PostController {
//
//    @Autowired
//    private PostService postService;
//
//    private final PostRepository postRepository;
//
//    @Autowired
//    public PostController(PostRepository postRepository) {
//        this.postRepository = postRepository;
//    }
//
//    @GetMapping("/{postId}")
//    public ResponseEntity<PostEntity> getPostById(@PathVariable Long postId) {
//        return postRepository.findPostWithDetailsById(postId)
//                .map(post -> ResponseEntity.ok().body(post))
//                .orElse(ResponseEntity.notFound().build());
//    }@GetMapping("/index.html")
//    public ResponseEntity<List<PostEntity>> getAllPostsWithDetails() {
//        List<PostEntity> posts = postRepository.findAllPostsWithDetails();
//        return ResponseEntity.ok().body(posts);
//    }
//    
//    @GetMapping
//    public List<PostModel> getAllPostsAndCountLikesAndComments(@RequestParam("userId") long userId) {
//        return postService.getAllPostsAndCountLikesAndComments(userId);
//    }
//    
//
//    @PostMapping("/create_post")
//    public ResponseEntity<PostEntity> createPost(@RequestBody CreatePostModel createPostModel) {
//        PostEntity result = postService.createPost(createPostModel);
//        return ResponseEntity.ok(result);
//    }
//
//    @PostMapping("/like_post")
//    public ResponseEntity<LikeEntity> likePost(@RequestBody LikeModel likeModel) {
//        LikeEntity result = postService.likePost(likeModel);
//        return ResponseEntity.ok(result);
//    }
//
//    @PostMapping("/comment_post")
//    public ResponseEntity<CommentEntity> addComment(@RequestBody CommentModel commentModel) {
//        CommentEntity result = postService.addComment(commentModel);
//        return ResponseEntity.ok(result);
//    }
//
//}
