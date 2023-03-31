package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    private Long id;
    // EntityManger(영속성 컨텍스트 관리)에서 persist() 문 수행 시, id 필드를 PK(기본키)로 설정하고, 자동 할당.
    // @GeneratedValue 없이 @Id 어노테이션만 사용한다면 직접 할당이 됩니다.
    // 즉, persist() 메서드를 호출하기 전에 애플리케이션에서 직접 실별자 값을 할당해야 하며, 식별자 값이 없을 경우 에러를 발생시킵니다.
    private String username;


}
