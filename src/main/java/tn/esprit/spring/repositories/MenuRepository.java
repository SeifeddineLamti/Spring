package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.spring.entities.Menu;
import tn.esprit.spring.entities.enums.TypeComposant;
import tn.esprit.spring.entities.enums.TypeMenu;

import java.util.List;

public interface MenuRepository  extends JpaRepository<Menu,Long> {
    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(TypeMenu t,Float prix);

    @Query("select m.libelleMenu from Menu m where m.typeMenu=: typeMenu order by m.prixTotal asc")
    List<Menu> NomMenuParTypeMenuEtPrixTotalCroissant(TypeMenu typeMenu);

    @Query("select m from Menu m join m.composants x where x.detailComposant=: typeComposant")
    List<Menu> MenuParTypeComposant(TypeComposant typeComposant);
}
