package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.spring.services.MenuService;

@RestController
@AllArgsConstructor
public class MenuController {
    private MenuService menuService;
}
