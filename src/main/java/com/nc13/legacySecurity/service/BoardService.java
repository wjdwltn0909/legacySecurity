package com.nc13.legacySecurity.service;

import com.nc13.legacySecurity.model.BoardDTO;
import lombok.AllArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardService {
    private final SqlSession SESSION;
    private final String NAMESPACE = "mappers.BoardMapper"; //BoardMapper.xml에서 NAMESPACE 정보 확인!!
    public List<BoardDTO> selectAll() {
        return SESSION.selectList(NAMESPACE + ".selectAll");
    }
}