package com.sparta.meme_nameking.repository;

import com.sparta.meme_nameking.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
//    Optional<Post> findByIdAndUsername(Long id, String username);
}
