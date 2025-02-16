package tn.esprit.spring.services;

import tn.esprit.spring.entities.Menu;

import java.util.List;

public interface IMenuService {
    List<Menu> retrieveAllMenus();
    Menu addMenu(Menu e);
    Menu updateMenu(Menu e);
    Menu retrieveMenu(Long idMenu);
    void removeMenu(Long idMenu);
    List<Menu> addMenus(List<Menu> menus);
}
