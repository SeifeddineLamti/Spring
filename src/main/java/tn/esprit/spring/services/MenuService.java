package tn.esprit.spring.services;

import tn.esprit.spring.entities.Menu;
import tn.esprit.spring.repositories.MenuRepository;

import java.util.List;
import java.util.Optional;

public class MenuService implements IMenuService{
    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public List<Menu> retrieveAllMenus() {
        return menuRepository.findAll();
    }

    @Override
    public Menu addMenu(Menu e) {
        return menuRepository.save(e);
    }

    @Override
    public Menu updateMenu(Menu e) {
        return menuRepository.save(e);
    }

    @Override
    public Menu retrieveMenu(Long idMenu) {
        Optional<Menu> menu = menuRepository.findById(idMenu);
        return menu.orElse(null);
    }

    @Override
    public void removeMenu(Long idMenu) {
        menuRepository.deleteById(idMenu);
    }

    @Override
    public List<Menu> addMenus(List<Menu> menus) {
        return menuRepository.saveAll(menus);
    }
}
