package fr.univubs.inf1603.visitcard.engine;


/**
 * Interface AbstractVisitCard.
 * Décrit l'implémentation abstraite d'une carte de visite.
 * 
 * @author inf1603
 */
public interface VisitCardObserver {
   
    /**
     * firstNameChanged - Change le prénom d'une carte de visite  (mutateur)
     * 
     * @param vc La carte de visite à modifier
     * @param oldFirstName L'ancien prénom associé à la carte
     * @param newFirstName Le nouveau prénom assocé à la carte
     */
    public void firstNameChanged(VisitCard vc,String oldFirstName,String newFirstName);
    
    /**
     * lastNameChanged - Change le nom de famille associé à une carte de visite  (mutateur)
     * 
     * @param vc La carte de visite à modifier
     * @param oldLastName L'ancien nom associé à la carte
     * @param newLastName L'ancien nom associé à la carte
     */
    public void lastNameChanged(VisitCard vc,String oldLastName,String newLastName);
    
    /**
     * middleNameChanged - Change le deuxième prénom associé à une carte de visite  (mutateur)
     * 
     * @param vc La carte de visite à modifier
     * @param oldMiddleName L'ancien deuxième prénom associé à la carte
     * @param newMiddleName L'ancien deuxième prénom associé à la carte
     */
    public void middleNameChanged(VisitCard vc,String oldMiddleName,String newMiddleName);
    
    /**
     * formatedNameChanged - Change le nom formaté associé à une carte de visite  (mutateur)
     * 
     * @param vc La carte de visite à modifier
     * @param oldFormatedName L'ancien nom formaté associé à la carte
     * @param newFormatedName L'ancien nom formaté associé à la carte
     */
    public void formatedNameChanged(VisitCard vc,String oldFormatedName,String newFormatedName);
    
    /**
     * addressAdded - Ajoute une adresse à une carte de visite
     * 
     * @param vc La carte de visite associé
     * @param aet Le type d'adresse associé 
     * @param a L'adresse à ajouter
     */
    public void addressAdded(VisitCard vc,AddressEmailType aet,Address a);
    
    /**
     * addressRemoved - Supprime une adresse associée à une carte de visite
     * 
     * @param vc La carte de visite associé
     * @param aet Le type d'adresse associé 
     * @param a L'adresse à supprimer
     */
     public void addressRemoved(VisitCard vc,AddressEmailType aet,Address a);
    
    /**
     * emailAdded - Ajoute une adresse mail à une carte de visite 
     * 
     * @param vc La carte de visite associé
     * @param aet Le type d'adresse mail associé 
     * @param mail Le mail à ajouter
     */
    public void emailAdded(VisitCard vc,AddressEmailType aet,String mail);
    
    /**
     * emailRemoved - Supprime une adresse mail associée à une carte de visite
     * 
     * @param vc La carte de visite associé
     * @param aet Le type d'adresse mail associé 
     * @param mail Le mail à supprimer 
     */
    public void emailRemoved(VisitCard vc,AddressEmailType aet,String mail);
    
    /**
     * titleChanged - Mutateur du metier de la VisitCard.
     * 
     * @param vc La carte de visite associé
     * @param oldTitle L'ancier métier (titre)
     * @param newTitle Le nouveau métier (titre)
     */
    public void titleChanged(VisitCard vc,String oldTitle,String newTitle);
    
    /**
     * phoneAdded - Ajoute une visite carte à une carte de visite
     * 
     * @param vc La carte de visite associé
     * @param pt Le type de numéro associé
     * @param phone Le numéro à ajouter
     */
    public void phoneAdded(VisitCard vc,PhoneType pt,String phone);
    
    /**
     * phoneRemoved -  Supprime un noméro de téléphone associée à une carte de visite
     * 
     * @param vc La carte de visite associé
     * @param pt Le type de numéro associé
     * @param phone Le numéro à supprimer
     */
    public void phoneRemoved(VisitCard vc,PhoneType pt,String phone);
}
