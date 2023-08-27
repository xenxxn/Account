package com.example.account.repository;

import com.example.account.domain.Account;
import com.example.account.domain.AccountUser;
import com.example.account.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    //인터페이스 필수
    // 두가지 타입을 받는데 첫번째는 entity 두번째는 entity 의 pk
    //bean 으로 등록하기 위해서 @Repository 를 붙여줘야함.

    Optional<Transaction> findByTransactionId(String transactionId);
}
