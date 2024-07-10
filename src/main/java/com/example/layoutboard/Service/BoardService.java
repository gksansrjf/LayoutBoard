package com.example.layoutboard.Service;

import com.example.layoutboard.DTO.BoardDTO;
import com.example.layoutboard.Entity.BoardEntity;
import com.example.layoutboard.Repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;
    private final ModelMapper modelMapper;

    //삽입
    public void insert(BoardDTO boardDTO){
        BoardEntity boardEntity = modelMapper.map(boardDTO,BoardEntity.class);
        boardRepository.save(boardEntity);
    }
    //수정
    //삭제
    //개별조회
    //조회
}
