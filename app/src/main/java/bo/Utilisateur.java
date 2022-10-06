package bo;

import android.os.Parcel;
import android.os.Parcelable;

public class Utilisateur implements Parcelable
{
    private String pseudo;
    private String email;
    private String niveau;
    private String mot_de_passe;

    public Utilisateur() {

    }
    public Utilisateur(String pseudo, String email, String niveau, String mot_de_passe) {
        this.pseudo = pseudo;
        this.email = email;
        this.niveau = niveau;
        this.mot_de_passe = mot_de_passe;
    }

    protected Utilisateur(Parcel in) {
        pseudo = in.readString();
        email = in.readString();
        niveau = in.readString();
        mot_de_passe = in.readString();
    }

    public static final Creator<Utilisateur> CREATOR = new Creator<Utilisateur>() {
        @Override
        public Utilisateur createFromParcel(Parcel in) {
            return new Utilisateur(in);
        }

        @Override
        public Utilisateur[] newArray(int size) {
            return new Utilisateur[size];
        }
    };

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }
    @Override
    public String toString() {
        return "Utilisateur{" +
                "pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", niveau='" + niveau + '\'' +
                ", mot_de_passe='" + mot_de_passe + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(pseudo);
        parcel.writeString(email);
        parcel.writeString(niveau);
        parcel.writeString(mot_de_passe);
    }
}
