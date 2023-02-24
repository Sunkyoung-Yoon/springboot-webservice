package com.project.webservice.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
//JPA Entity 클래스들이 BaseTimeEntity 클래스를 상속할 경우 이 클래스의 필드들도 칼럼으로 인식하도록 한다.
@MappedSuperclass
//BaseTimeEntity 클래스에 Auditing 기능을 포함시킨다.
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {

    //Entity 생성되어 저장된 시간 자동 저장
    @CreatedDate
    private LocalDateTime createdDate;

    //조회한 Entity 값 변경시 시간 자동 저장
    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
