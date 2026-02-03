package com.busanit501.jsp_server_project1._0203_todo.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter // getter 직접 생산 X, 어노테이션을 이용하면 메모리상에 다 만들어져 있음
@Builder // 객체 생성 시 A a = new A();, 계속 객체를 생성하며 이어서 직업함
@ToString // ToString 직접 생산 X, 어노테이션을 이용하면 메모리상에 다 만들어져 있음
public class _0203_1_TodoVO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private  boolean finished;

}
