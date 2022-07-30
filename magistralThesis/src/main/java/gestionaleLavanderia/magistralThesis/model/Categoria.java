package gestionaleLavanderia.magistralThesis.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "categoria")
public class Categoria {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

    private String nome;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<SottoCategoria> sottocategorie;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<SottoCategoria> getSottocategorie() {
        return sottocategorie;
    }

    public void setSottocategorie(List<SottoCategoria> sottocategorie) {
        this.sottocategorie = sottocategorie;
    }

}
