package com.wlwpfh.practice.controller;

import com.wlwpfh.practice.common.ApiResponse;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/health")
    public ResponseEntity<ApiResponse> getHealthCheck(){
        return ResponseEntity.ok(ApiResponse.success("서버 연결 성공"));
    }

}
