package fr.audit.app.metier.modele;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import fr.audit.app.metier.entity.Image;
import fr.audit.app.metier.entity.Section;


/**
 *
 * @author bob
 */
public class SectionM {

    private long id;
    private String nom;
    private int type;
    private List<ChampM> champs;
    private Image image;

    public SectionM(){
        this.nom = "";
        this.image = new Image();
        List<ChampM> c;
        c = new ArrayList<>();
        this.champs = c;
    }

    public SectionM(Section s) {
        this.id = s.getId();
        this.nom = s.getNom();
        this.type = s.getType();
        this.image = s.getImage();
        List<ChampM> c;
        c = new ArrayList<>();
        this.champs = c;
    }



    public SectionM(long id, String nom, int type, List<ChampM> champs, Image image) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.champs = champs;
        this.image = image;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.nom);
        hash = 97 * hash + this.type;
        hash = 97 * hash + Objects.hashCode(this.champs);
        hash = 97 * hash + Objects.hashCode(this.image);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SectionM other = (SectionM) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.champs, other.champs)) {
            return false;
        }
        return Objects.equals(this.image, other.image);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<ChampM> getChamps() {
        return champs;
    }

    public void setChamps(List<ChampM> champs) {
        this.champs = champs;
    }

    public void addChamps(ChampM champ){
        this.champs.add(champ);
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "SectionM{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", type=" + type +
                ", champs=" + champs +
                ", image=" + image +
                '}';
    }
}
