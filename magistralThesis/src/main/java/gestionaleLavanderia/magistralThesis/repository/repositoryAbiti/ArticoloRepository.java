package gestionaleLavanderia.magistralThesis.repository.repositoryAbiti;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Articolo;

public interface ArticoloRepository extends JpaRepository<Articolo, Integer>{
    Articolo findByArticoliUtente(DAOUser user);

    Articolo findById(long id);

    //Qua ho fatto una query che seleziona gli articoli presi dall'oggetto USER e crea una Lista con gli oggetti presi
    @Query(value = "SELECT o FROM Articolo o where o.articoliUtente = :user")
    List<Articolo> findListArticoli(@Param("user") DAOUser username);

    @Query(value = "SELECT o.numeroLavorazione FROM Articolo o WHERE o.id = (SELECT MAX(o.id) FROM Articolo o)")
    int findNumeroLavorazione(Articolo articolo);

    @Query(value = "SELECT o FROM Articolo o WHERE o.id = (SELECT MAX(o.id) FROM Articolo o)")
    Articolo getLastArticolo();



}