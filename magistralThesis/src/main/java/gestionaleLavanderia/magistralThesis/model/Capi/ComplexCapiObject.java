package gestionaleLavanderia.magistralThesis.model.Capi;

import gestionaleLavanderia.magistralThesis.model.DAOUser;

public class ComplexCapiObject {
    Articolo articolo;
    DAOUser user;
    String date;

    public Articolo getArticolo() {
        return articolo;
    }
    public void setArticolo(Articolo articolo) {
        this.articolo = articolo;
    }
    public DAOUser getUser() {
        return user;
    }
    public void setUser(DAOUser user) {
        this.user = user;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
   
}