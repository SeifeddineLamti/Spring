package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.ChefCuisinier;
import tn.esprit.spring.entities.Client;
import tn.esprit.spring.services.IChefCuisinierService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chefcuisinier")
public class ChefCuisinierController {
    private IChefCuisinierService chefCuisinierService;

    @GetMapping("/getallchefs")
    public List<ChefCuisinier> getChefs() {
        List<ChefCuisinier> chefCuisinierList = chefCuisinierService.retrieveAllChefs();
        return chefCuisinierList;
    }
    @PostMapping("/addchef")
    public ChefCuisinier addChef(@RequestBody ChefCuisinier c) {
        ChefCuisinier chef = chefCuisinierService.addChef(c);
        return chef;
    }
    @GetMapping("/getchef/{chef-id}")
    public ChefCuisinier retrieveChefs(@PathVariable("chef-id") Long chefId) {
        return chefCuisinierService.retrieveChef(chefId);
    }
    @PutMapping("/updatechef")
    public ChefCuisinier updateChef(@RequestBody ChefCuisinier c) {
        ChefCuisinier chef= chefCuisinierService.updateChef(c);
        return chef;
    }
    @DeleteMapping("/removechef/{chef-id}")
    public void removeChef(@PathVariable("chef-id") Long chefId) {
        chefCuisinierService.removeChef(chefId);
    }

}
