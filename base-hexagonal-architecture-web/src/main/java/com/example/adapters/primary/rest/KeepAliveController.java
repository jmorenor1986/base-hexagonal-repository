package com.example.adapters.primary.rest;

import com.example.ports.primary.KeepAliveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("keepalive/v1")
public class KeepAliveController {
    private final KeepAliveService keepAliveService;

    @Autowired
    public KeepAliveController(KeepAliveService keepAliveService) {
        this.keepAliveService = keepAliveService;
    }

    @GetMapping("/")
    public String getAlive() {
        return keepAliveService.getAlive();
    }
}