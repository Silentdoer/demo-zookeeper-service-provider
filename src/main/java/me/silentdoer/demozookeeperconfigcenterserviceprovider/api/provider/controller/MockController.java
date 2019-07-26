package me.silentdoer.demozookeeperconfigcenterserviceprovider.api.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/mock")
public class MockController {

    @GetMapping("/get_some_thing")
    public String getSomeThing() {
        return "实际付款了";
    }

    @GetMapping("/lalala")
    public String lalala(@RequestParam("user_id") Integer userId) {
        return UUID.randomUUID().toString() + userId;
    }

}
