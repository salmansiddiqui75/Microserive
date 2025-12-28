package com.siddiqui.accounts.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CustomerDto {
    private String name;
    private String email;
    private String mobileNumber;
}
