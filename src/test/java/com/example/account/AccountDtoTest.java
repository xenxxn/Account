package com.example.account;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountDtoTest {

    @Test
    void accountDto(){
        //given
        //when
        //then

        AccountDto accountDto = new AccountDto();
        accountDto.setAccountNumber("aaa");
        System.out.println(accountDto.getAccountNumber());

    }
}