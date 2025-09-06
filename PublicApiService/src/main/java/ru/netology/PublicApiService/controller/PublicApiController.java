package ru.netology.PublicApiService.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.PublicApiService.model.Profile;
import ru.netology.PublicApiService.service.PublicApiService;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/site-bff/user")
public class PublicApiController {

    private final PublicApiService service;

    @RequestMapping("/{userId}")
    public Profile getProfileByUserId(@PathVariable String userId) {
        return service.getProfileByUserId(userId);
    }

}
