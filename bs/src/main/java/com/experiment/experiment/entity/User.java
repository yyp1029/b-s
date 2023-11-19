package com.experiment.experiment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class User {
    private String userName;
    private String phoneNumber;
    private String address;
    private int id;
}
