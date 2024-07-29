/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.testApi.apigw.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ahmet
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
class RegisterRequest {
    
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
