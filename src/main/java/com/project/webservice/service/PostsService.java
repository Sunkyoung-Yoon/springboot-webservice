package com.project.webservice.service;

import com.project.webservice.domain.posts.Posts;
import com.project.webservice.domain.posts.PostsRepository;
import com.project.webservice.web.dto.PostsResponseDto;
import com.project.webservice.web.dto.PostsSaveRequestDto;
import com.project.webservice.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//생성자로 스프링 빈을 주입
//@RequiredArgsConstructor - final이 선언된 모든 필드를 인자값으로 하는 생성자를 생성해준다.
@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    //게시글 등록
    @Transactional
    public Long save(PostsSaveRequestDto requestDto){
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    //게시글 수정
    /*
    JPA 엔티티 매니저가 활성화된 상태로(Spring Data JPA를 쓰는 경우 기본옵션)
    트랜잭션 안에서 데이터베이스에서 데이터를 가져오면 이 데이터는 영속성 컨텍스트가 유지된 상태이다.
    이 상태에서 값을 변경하면 트랜잭션이 끝날 때, 테이블에 변경된 부분 반영
    -> Entity 객체의 값만 변경하면 데이터베이스에 쿼리를 날릴 필요가 없다. (=dirty checking)
    -> update에서 데이터베이스에 쿼리를 날리는 부분이 존재하는 않는다.
     */
    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    //id를 가진 게시글 조회
    public PostsResponseDto findById (Long id) {
        Posts entity = postsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));

        return new PostsResponseDto(entity);
    }
}
