/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.univubs.inf1603.visitcard.engine;

import java.util.HashSet;

/**
 * VisitCardObserverSet - POJO
 *                        Collections de VisitCardObserver tous distincts observant une même VisitCard
 * 
 * @author POJO
 */
public class VisitCardObserverSet {
    
    HashSet<VisitCardObserver> visitCardObserverSet;    //Collections des VisitCardObserver distincts
    
    /**
     * Constructeur de PojoVisitCardObserverSet
     * 
     */
    public VisitCardObserverSet(){
        this.visitCardObserverSet = new HashSet<>();
    }
    
    /**
     * addVisitCardObserver - Ajoute un VisitCardObserver passé en paramètre
     * 
     * @param vco Le VisitCardObserver à ajouter
     */
    public void addVisitCardObserver(VisitCardObserver vco) {
        this.visitCardObserverSet.add(vco);    
    }
    
    /**
     * removeVisitCardObserver - Supprime le VisitCardObserver passé en paramètre
     * 
     * @param vco Le VisitCardObserver à supprimer 
     */
    public void removeVisitCardObserver(VisitCardObserver vco){
        this.visitCardObserverSet.remove(vco);
    }

    /**
     * notifyFirstNameChanged - Notifie d'un changement de prénom auprès de tout
     *                          les VisitCardObserver
     * 
     * @param vc La carte de visite modifié
     * @param oldFirstName L'ancien prénom
     * @param newFirstName Le nouveau prénom
     */
    public void notifyFirstNameChanged(VisitCard vc, String oldFirstName, String newFirstName) {
        for(VisitCardObserver vco : this.visitCardObserverSet){
            vco.firstNameChanged(vc,oldFirstName,newFirstName);
        }
    }
    
    /**
     * notifyLastNameChanged - Notifie d'un changement de nom de famille auprès
     *                         de tout les VisitCardObserver
     * 
     * @param vc La carte de visite modifié
     * @param oldLastName L'ancien nom de famille
     * @param newLastName Le nouveau nom de famille
     */
    public void notifyLastNameChanged(VisitCard vc, String oldLastName, String newLastName) {
        for(VisitCardObserver vco : this.visitCardObserverSet){
            vco.lastNameChanged(vc,oldLastName,newLastName);
        }
    }
    
    /**
     * notifyMiddleNameChanged - Notifie d'une changement de second prénom auprès
     *                           de tout les VisitCardObserver
     * 
     * @param vc La carte de visite modifié
     * @param oldMiddleName L'ancien deuxième prénom
     * @param newMiddleName Le nouveau deuxième prénom
     */
    public void notifyMiddleNameChanged(VisitCard vc, String oldMiddleName, String newMiddleName) {
        for(VisitCardObserver vco : this.visitCardObserverSet){
            vco.middleNameChanged(vc,oldMiddleName,newMiddleName);
        }
    }
    
    /**
     * notifyFormatedNameChanged - Notifie d'un changement de nom formaté auprès
     *                             de tout les VisitCardObserver
     * 
     * @param vc La carte de visite modifié
     * @param oldFormatedName L'ancien nom formaté
     * @param newFormatedName Le nouveau nom formaté
     */
    public void notifyFormatedNameChanged(VisitCard vc, String oldFormatedName, String newFormatedName) {
        for(VisitCardObserver vco : this.visitCardObserverSet){
            vco.formatedNameChanged(vc,oldFormatedName,newFormatedName);
        }
    }
    
    /**
     * notifyAddressAdded - Notifie d'un ajoue d'adresse auprès
     *                      de tout les VisitCardObserver
     * 
     * @param vc La carte de visite modifié
     * @param aet Le type d'adresse ajouté
     * @param adr L'adresse ajouté
     */
    public void notifyAddressAdded(VisitCard vc, AddressEmailType aet, Address adr) {
        for(VisitCardObserver vco : this.visitCardObserverSet){
            vco.addressAdded(vc, aet, adr);
        }
    }
    
    /**
     * notifyAddressRemoved - Notifie d'une supression d'une adresse auprès
     *                        de tout les VisitCardObserver
     * 
     * @param vc La carte de visite modifié
     * @param aet Le type d'adresse supprimé
     * @param a L'ancienne adresse
     */
    public void notifyAddressRemoved(VisitCard vc, AddressEmailType aet, Address a) {
        for(VisitCardObserver vco : this.visitCardObserverSet){
            vco.addressRemoved(vc, aet, a);
        }
    }
    
    /**
     * notifyEmailAdded - Notifie d'un ajout de mail auprès
     *                    de tout les VisitCardObserver
     * 
     * @param vc La carte de visite modifié
     * @param aet Le type de mail ajouté
     * @param mail Le nouveau mail
     */
    public void notifyEmailAdded(VisitCard vc, AddressEmailType aet, String mail) {
        for(VisitCardObserver vco : this.visitCardObserverSet){
            vco.emailAdded(vc, aet, mail);
        }   
    }
    
    /**
     * notifyEmailRemoved - Notifie d'une supression de mail auprès
     *                      de tout les VisitCardObserver
     * 
     * @param vc La carte de visite modifié
     * @param aet Le type de mail supprimé
     * @param mail L'ancien mail
     */
    public void notifyEmailRemoved(VisitCard vc, AddressEmailType aet, String mail) {
        for(VisitCardObserver vco : this.visitCardObserverSet){
            vco.emailRemoved(vc, aet, mail);
        }
    }
    
    /**
     * notifyTitleChanged - Notifie d'un changement de titre  honorifique auprès
     *                      de tout les VisitCardObserver 
     * 
     * @param vc La carte de visite modifié
     * @param oldTitle L'ancien titre
     * @param newTitle Le nouveau titre
     */
    public void notifyTitleChanged(VisitCard vc, String oldTitle, String newTitle) {
        for(VisitCardObserver vco : this.visitCardObserverSet){
            vco.titleChanged(vc, oldTitle, newTitle);
        }
    }
    
    /**
     *  notifyPhoneAdded - Notifie d'un ajout de numéro de téléphone auprès
     *                     de tout les VisitCardObserver
     * 
     * @param vc La carte de visite modifié
     * @param pt Le type de numéro
     * @param phone Le nouveau numéro
     */
    public void notifyPhoneAdded(VisitCard vc, PhoneType pt, String phone) {
        for(VisitCardObserver vco : this.visitCardObserverSet){
            vco.phoneAdded(vc, pt, phone);
        }
    }
    
    /**
     *  notifyPhoneRemoved - Notifie d'une supression de numéro de téléphone auprès
     *                       de tout les VisitCardObserver
     * 
     * @param vc La carte de visite modifié
     * @param pt
     * @param phone 
     */
    public void notifyPhoneRemoved(VisitCard vc, PhoneType pt, String phone) {
        for(VisitCardObserver vco : this.visitCardObserverSet){
            vco.phoneRemoved(vc, pt, phone);
        }
    }
    
}
