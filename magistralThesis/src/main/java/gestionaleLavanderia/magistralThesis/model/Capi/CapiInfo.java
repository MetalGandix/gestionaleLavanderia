package gestionaleLavanderia.magistralThesis.model.Capi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "dress_info")
public class CapiInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String service;
    @Column
    private double price;
    @Column
    private boolean ready;
    @Column
    private boolean delivered;
    @Column
    private String notes;
    
    @OneToOne(targetEntity = Articolo.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "article_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Articolo article;

    public Articolo getArticle() {
        return article;
    }
    public void setArticle(Articolo article) {
        this.article = article;
    }
    public long getId() {
        return id;
    }
    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isReady() {
        return ready;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }
    public boolean isDelivered() {
        return delivered;
    }
    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }
    public String isNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

}
