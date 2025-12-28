package com.siddiqui.accounts.controller;

import com.siddiqui.accounts.constant.AccountsConstant;
import com.siddiqui.accounts.dto.AccountsDto;
import com.siddiqui.accounts.dto.CustomerDto;
import com.siddiqui.accounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api",produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountsController
{


    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto)
    {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstant.STATUS_201,AccountsConstant.MESSAGE_201));
    }
}
