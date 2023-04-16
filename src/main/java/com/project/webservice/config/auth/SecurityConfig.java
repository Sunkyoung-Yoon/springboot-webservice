package com.project.webservice.config.auth;

import com.project.webservice.domain.user.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RequiredArgsConstructor
//Spring Security 설정들을 활성화시킨다.
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final CustomOAuth2UserService customOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .csrf().disable()
                .headers().frameOptions().disable()
                .and()
                    .authorizeRequests()
                    //antMatchers-권한 관리 대상을 지정하는 옵션, permitAll() - 전체 열람 권한을 주는 옵션
                    .antMatchers("/","/css/**","/images/**","/js/**","/h2-console/**","/profile").permitAll()
                    //USER 권한을 가진 사람만 열람가능
                    .antMatchers("/api/v1/**").hasRole(Role.USER.name())
                    //나머지 URL 인증된 사용자들에게만 허용
                    .anyRequest().authenticated()
                .and()
                    //로그아웃 기능에 대한 여러 설정의 진입점 - 아래 코드는 성공시 /로 이동
                    .logout()
                        .logoutSuccessUrl("/")
                .and()
                    //OAuth2 로그인 기능에 대한 여러 설정의 진입점
                    .oauth2Login()
                        //OAuth2 로그인 성공 이후 사용자 정보를 가져올 때의 설정들을 담당
                        .userInfoEndpoint()
                            //소셜 로그인 성공 시 후속 조치를 진행할 UserService 인터페이스의 구현체를 등록
                            .userService(customOAuth2UserService);
    }
}
