package com.busanit501.jsp_server_project1._0209_todo.controller;

import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@Log4j2
@WebServlet(name="_0209_16_LogoutController", urlPatterns = "/logout_0209")
public class _0209_16_LogoutController extends HttpServlet {
    // 로그 아웃 처리.
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        log.info("로그아웃 처리를 담당하느 doPost 입니다. ");

        // 임시 로그아웃 효과,
        HttpSession session = req.getSession();
        // 세션의 loginInfo 라는 키를 삭제하면 됩니다.
        session.removeAttribute("loginInfo");
        // 적용하기.
        session.invalidate();

        // remember-me 쿠키 삭제
        // 1. 같은 이름의 빈 쿠키를 새로 생성
        Cookie killCookie = new Cookie("remember-me", "");

        // 2. 경로를 기존과 동일하게 설정
        killCookie.setPath("/");

        // 3. 수명을 0으로 설정하여 즉시 삭제 명령
        killCookie.setMaxAge(0);

        // 4. 응답에 실어서 브라우저에 전송(삭제 완료)
        resp.addCookie(killCookie);

        // 5. 경로 앞에 프로젝트 이름을 자동으로 붙여주는 코드
        resp.sendRedirect(req.getContextPath() + "/login_0209");

    }

    private Cookie findCookie(Cookie[] cookies, String cookieName) {
        Cookie targetCookie = null;

        if(cookies != null && cookies.length > 0) {
            for(Cookie ck: cookies) {
                if(ck.getName().equals(cookieName)) {
                    targetCookie = ck;
                    break;
                }
            }
        }

        // 찾고자 하는 쿠키가 없는 경우에도 삭제 처리를 위해 빈 값을 가진 쿠키 생성
        if(targetCookie == null) {
            targetCookie = new Cookie(cookieName, "");
            targetCookie.setPath("/");
        }
        return targetCookie;
    }
}
