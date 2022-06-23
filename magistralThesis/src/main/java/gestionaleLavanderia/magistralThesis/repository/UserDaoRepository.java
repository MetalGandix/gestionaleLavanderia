package gestionaleLavanderia.magistralThesis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.Capi.Abiti;
import gestionaleLavanderia.magistralThesis.model.Capi.Camicie;
import gestionaleLavanderia.magistralThesis.model.Capi.Cappelli;
import gestionaleLavanderia.magistralThesis.model.Capi.GiaccheEGiacconi;
import gestionaleLavanderia.magistralThesis.model.Capi.Gonne;
import gestionaleLavanderia.magistralThesis.model.Capi.Maglie;
import gestionaleLavanderia.magistralThesis.model.Capi.Pantaloni;
import gestionaleLavanderia.magistralThesis.model.Capi.PigiamaEVestaglie;
import gestionaleLavanderia.magistralThesis.model.Capi.Scarpe;
import gestionaleLavanderia.magistralThesis.model.Capi.Tappeti;
import gestionaleLavanderia.magistralThesis.model.Capi.Tende;
import gestionaleLavanderia.magistralThesis.model.Capi.TrapunteEPiumoni;
import gestionaleLavanderia.magistralThesis.model.Capi.Varie;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface UserDaoRepository extends JpaRepository<DAOUser, Long> {
	DAOUser findByUsername(String username);

	@Query("SELECT o FROM Abiti o where o.id = :id") 
    Abiti findAbitiById(@Param("id") long id);

	@Query("SELECT o FROM Camicie o where o.id = :id") 
    Camicie findCamicieById(@Param("id") long id);

	@Query("SELECT o FROM Cappelli o where o.id = :id") 
    Cappelli findCappelliById(@Param("id") long id);

	@Query("SELECT o FROM GiaccheEGiacconi o where o.id = :id") 
    GiaccheEGiacconi findGiaccheEGiacconiById(@Param("id") long id);

	@Query("SELECT o FROM Gonne o where o.id = :id") 
    Gonne findGonneById(@Param("id") long id);

	@Query("SELECT o FROM Maglie o where o.id = :id") 
    Maglie findMaglieById(@Param("id") long id);

	@Query("SELECT o FROM Pantaloni o where o.id = :id") 
    Pantaloni findPantaloniById(@Param("id") long id);

	@Query("SELECT o FROM PigiamaEVestaglie o where o.id = :id") 
    PigiamaEVestaglie findPigiamaEVestaglieById(@Param("id") long id);

	@Query("SELECT o FROM Scarpe o where o.id = :id") 
    Scarpe findScarpeById(@Param("id") long id);

	@Query("SELECT o FROM Tappeti o where o.id = :id") 
    Tappeti findTappetiById(@Param("id") long id);

	@Query("SELECT o FROM Tende o where o.id = :id") 
    Tende findTendeById(@Param("id") long id);

	@Query("SELECT o FROM TrapunteEPiumoni o where o.id = :id") 
    TrapunteEPiumoni findTrapunteEPiumoniById(@Param("id") long id);

	@Query("SELECT o FROM Varie o where o.id = :id") 
    Varie findVarieById(@Param("id") long id);
}