package com.seaflow.seaflow_server.logflow.controller;

import com.seaflow.seaflow_server.logflow.service.LogFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogFlowController {

    @Autowired
    private LogFlowService logFlowService;

}
