package com.example.account.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Account {
    @Id
    @GeneratedValue //pk 설정
    private Long id;


    private String accountNumber;

    @Enumerated(EnumType.STRING) //enum 값의 실제 문자열을 저장
    private AccountStatus accountStatus;
}
