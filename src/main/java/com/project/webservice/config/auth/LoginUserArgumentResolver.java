package com.project.webservice.config.auth;

import com.project.webservice.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Component
public class LoginUserArgumentResolver implements HandlerMethodArgumentResolver {
    private final HttpSession httpSession;

    @Override
    //supportsParameter() - 컨트롤러 메서드의 특정 파라미터를 지원하는지 판단
    public boolean supportsParameter(MethodParameter parameter){
        //파라미터에 @LoginUser 어토테이션이 붙어있고 파라미터 클래스 타입이 SessionUser.class라면 true 리턴
        boolean isLoginUserAnnotation = parameter.getParameterAnnotation(LoginUser.class) != null;
        boolean isUserClass = SessionUser.class.equals(parameter.getParameterType());

        return isLoginUserAnnotation && isUserClass;
    }

    @Override
    //resolveArgument() - 파라미터에 전달될 객체 생성
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest, WebDataBinderFactory inderFactory) throws Exception{
        //세션에서 객체를 가져옴
        return httpSession.getAttribute("user");
    }
}
