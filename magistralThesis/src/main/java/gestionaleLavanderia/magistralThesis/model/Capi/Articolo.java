package gestionaleLavanderia.magistralThesis.model.Capi;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import gestionaleLavanderia.magistralThesis.model.DAOUser;
import gestionaleLavanderia.magistralThesis.model.SottoCategoria;

@Entity
@Table(name = "articolo")
public class Articolo {
    @Id
    @SequenceGenerator(name="mysequence", initialValue=1000)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="mysequence")
    public long id;

    @Column
    public String servizio;

    @Column
    public double prezzo;

    @Column
    public boolean pronto = false;

    @Column
    public boolean consegnato = false;

    @Column
    public String note;

	@Column 
    public LocalDate date;
    
    @SequenceGenerator(name="sequenceLavorazioneArticolo", initialValue=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sequenceLavorazioneArticolo")
    @Column 
    public int numeroLavorazione;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_USERNAME", referencedColumnName="username")
    @OnDelete(action = OnDeleteAction.CASCADE)
    public DAOUser articoliUtente;

    @OneToOne(targetEntity = SottoCategoria.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "sotto_categoria_id")
    private SottoCategoria sottocategoria;

    public int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public String getServizio() {
        return servizio;
    }

    public void setServizio(String servizio) {
        this.servizio = servizio;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public boolean isPronto() {
        return pronto;
    }

    public void setPronto(boolean pronto) {
        this.pronto = pronto;
    }

    public boolean isConsegnato() {
        return consegnato;
    }

    public void setConsegnato(boolean consegnato) {
        this.consegnato = consegnato;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNumeroLavorazione() {
        return numeroLavorazione;
    }

    public void setNumeroLavorazione(int numeroLavorazione) {
        this.numeroLavorazione = numeroLavorazione;
    }

    public DAOUser getArticoliUtente() {
        return articoliUtente;
    }

    public void setArticoliUtente(DAOUser articoliUtente) {
        this.articoliUtente = articoliUtente;
    }

    public SottoCategoria getSottocategoria() {
        return sottocategoria;
    }

    public void setSottocategoria(SottoCategoria sottocategoria) {
        this.sottocategoria = sottocategoria;
    }



}
