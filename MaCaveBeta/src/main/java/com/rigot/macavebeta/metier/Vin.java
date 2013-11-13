package com.rigot.macavebeta.metier;

import com.rigot.macavebeta.ref.RefAppellation;
import com.rigot.macavebeta.ref.RefCategorie;
import com.rigot.macavebeta.ref.RefCouleur;

import java.util.ArrayList;

/**
 * Created by Seb on 08/11/13.
 */
public class Vin {
    private ArrayList<Bouteille> listeBouteilles = new ArrayList<Bouteille>() ;

    private String nom ;
    private Integer annee ;
    private Float estimation ;
    private Integer note ;
    private String cepage ;
    private Float taille ;
    private Integer debutBoire ;
    private Integer finBoire ;
    private String commentaires ;
    private Float degre ;
    private RefCouleur couleur ;
    private Integer debutTemp ;
    private Integer finTemp ;

    public Integer getNombreBouteilles() {
        return listeBouteilles.size();
    }
    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public Float getEstimation() {
        return estimation;
    }

    public void setEstimation(Float estimation) {
        this.estimation = estimation;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public String getCepage() {
        return cepage;
    }

    public void setCepage(String cepage) {
        this.cepage = cepage;
    }

    public Float getTaille() {
        return taille;
    }

    public void setTaille(Float taille) {
        this.taille = taille;
    }

    public Integer getDebutBoire() {
        return debutBoire;
    }

    public void setDebutBoire(Integer debutBoire) {
        this.debutBoire = debutBoire;
    }

    public Integer getFinBoire() {
        return finBoire;
    }

    public void setFinBoire(Integer finBoire) {
        this.finBoire = finBoire;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public Float getDegre() {
        return degre;
    }

    public void setDegre(Float degre) {
        this.degre = degre;
    }

    public RefCouleur getCouleur() {
        return couleur;
    }

    public void setCouleur(RefCouleur couleur) {
        this.couleur = couleur;
    }

    public Integer getDebutTemp() {
        return debutTemp;
    }

    public void setDebutTemp(Integer debutTemp) {
        this.debutTemp = debutTemp;
    }

    public Integer getFinTemp() {
        return finTemp;
    }

    public void setFinTemp(Integer finTemp) {
        this.finTemp = finTemp;
    }

    public RefCategorie getCategorie() {
        return categorie;
    }

    public void setCategorie(RefCategorie categorie) {
        this.categorie = categorie;
    }

    private RefCategorie categorie ;

    private RefAppellation appellation ;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public RefAppellation getAppellation() {
        return appellation;
    }

    public void setAppellation(RefAppellation appellation) {
        this.appellation = appellation;
    }

    public Vin(String nom, RefAppellation appellation) {
        this.nom = nom ;
        this.appellation = appellation ;

    }

    public Vin() {

    }
}
