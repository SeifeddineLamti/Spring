package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.services.IMenuService;

@RestController
@AllArgsConstructor
public class MenuController {
    private IMenuService menuService;
}
