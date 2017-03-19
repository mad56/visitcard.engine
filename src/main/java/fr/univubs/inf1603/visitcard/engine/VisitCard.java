package fr.univubs.inf1603.visitcard.engine;

import java.util.Date;
import java.util.UUID;


/**
 * VisitCard - Interface AbstractVisitCard.
 *             Décrit l'implémentation abstraite d'une carte de visite.
 * 
 * @author inf1603
 */
public interface VisitCard {
    
    /**
     * getUUID - Accesseur de l'UUID de la VisitCard.
     * 
     * @return L'UUID (identifiant unique) de la VisitCard.
     */
    public abstract UUID getUUID();
    
    /**
     * getFirstName - Renvoie le prénom  associé à la carte de visite
     * 
     * @return Le prénom associé à la carte de visite
     */
    public String getFirstName();
    
    /**
     * setFirstName - Change le prénom associé à la carte de visite
     * 
     * @param name Le nouveau prénom
     */
    public void setFirstName(String name);
    
    /**
     * getLastName - Renvoie le nom de famille associé à la carte de visite
     * 
     * @return Le nom de l'UUID en String
     */
    public String getLastName();
    
    /**
     * setLastName - Remplace le nom de famille associé à la carte de visite
     * 
     * @param name Le nouveau nom de famille associé à la carte de visite.
     */
    public void setLastName(String name);
    
    /**
     * getMiddleName - Renvoie le deuxième prénom associé à la carte de visite
     * 
     * @return Le deuxième prénom associé à la carte de visite
     */
    public String getMiddleName();
    
    /**
     * setMiddleName - Remplace le deuxième associé à la carte de visite
     * 
     * @param middleName Le deuxième prénom à associer 
     */
    public void setMiddleName(String middleName);
    
    /**
     * getFormatedName - Retourne le nom formaté associé à la carte de visite
     * 
     * @return Le nom formaté de la carte de visite
     */
    public String getFormatedName();
    
    /**
     * setFormatedName - Remplace nom formaté associé à la carte de visite
     * 
     * @param newStructuredName Le nouveau nom formaté
     */
    public void setFormatedName(String newStructuredName);
    
    /**
     * getAddress - Retourne l'adresse et l'AJOUTE si elle n'est pas existante
     * 
     * @param at Le type d'adresse recherché
     * @param createItIfMissing true en absence d'adresse associée à la carte de visite
     * @return L'adresse associé à la carte de visite
     */
    public abstract Address getAddress(AddressEmailType at,boolean createItIfMissing);
    
    /**
     * removeAddress - Supprime une adresse associée à la carte de visite
     * 
     * @param aet Le type d'adresse à suprimer 
     */
    public abstract void removeAddress(AddressEmailType aet);
    
    /**
     * getEmail -  Retourne l'adresse mail et l'AJOUTE si elle n'est pas existante
     * 
     * @param aet Type d'adresse mail associé
     * @param createItIfMissing true en absence d'adresse mail associée à la carte de visite
     * @return L'adresse mail sous forme de String
     */
    public abstract String getEmail(AddressEmailType aet,boolean createItIfMissing);
    
    /**
     * removeEmail - Supprime une adresse mail associée à la carte de visite
     * 
     * @param aet Le type d'adresse mail associé
     */
    public abstract void removeEmail(AddressEmailType aet);
    
    /**
     * getTitle - Accesseur du metier de la VisitCard.
     * 
     * @return Le metier de la VisitCard.
     */
    public abstract String getTitle() ;
    
    /**
     * setTitle - Remplace le metier de la VisitCard.
     * 
     * @param title nouveau métier de la VisitCard.
     */
    public abstract void setTitle(String title);
    
    /**
     * removeTitle - Supprime le métier de la VisitCard.
     * 
     * @param title Le métier à supprimer
     */
    public abstract void removeTitle(String title);
    
    /**
     * getPhone - Retourne le numéro de téléphone et l'AJOUTE si elle n'est pas existante
     * 
     * @param pt Le type de numério associé
     * @param createItIfMissing true en absence de numéro de téléphone associée à la carte de visite
     * @return le nouveau numéro de téléphone 
     */
    public abstract String getPhone(PhoneType pt,boolean createItIfMissing);
    
    /**
     * removePhone - Supprime le numéro de téléphone de la VisitCard.
     * 
     * @param pt Le numéro de tel a supprimer
     */
    public abstract void removePhone(PhoneType pt);
    
    /**
     * getCreationDate - Retourne la date de creation de la carte de visite
     * 
     * @return La date de création
     */
    public abstract Date getCreationDate();
    
    /**
     * getDateOfLastModification - Retourne la date de la derniere modification
     * 
     * @return La date de la derniere modification
     */
    public abstract Date getDateOfLastModification();
    
    /**
     * addVisitCardObserver - Ajoute un observer sur la visitCard
     * 
     * @param vco Le VisitCardObserver a ajouter à la visitCard
     */
    public void addVisitCardObserver(VisitCardObserver vco);
    
    /**
     * removeVisitCardObserver - Supprime un observer sur la visitCard
     * 
     * @param vco Le VisitCardObserver a supprimer à la visitCard
     */
    public void removeVisitCardObserver(VisitCardObserver vco);
}
