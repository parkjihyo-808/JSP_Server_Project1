package com.busanit501.jsp_server_project1.springex_new_0219_keep.mapper;

import com.busanit501.jsp_server_project1.springex_new_0219_keep.domain.TodoVO;

public interface TodoMapper {
    String getTime();

    // 추가
    // 화면에서 입력된 정보 받기 -> DTO 담기 ->
    void insert(TodoVO todoVO);
}
