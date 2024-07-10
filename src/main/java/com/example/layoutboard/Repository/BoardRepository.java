package com.example.layoutboard.Repository;


import com.example.layoutboard.Entity.BoardEntity;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity,Integer> {
    //Page<BoardEntity> finb
}
