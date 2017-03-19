package fr.univubs.inf1603.visitcard.engine;

import java.util.HashSet;

/**
 * AddressObserverSet - POJO
 *                      Collection d'AddressObserver ne content que des AddressObserver distincts
 * 
 * @author inf1603
 */
public class AddressObserverSet {
    
    /**
     * addressObserverSet
     * La collection d'AddressObserver
     */
    HashSet<AddressObserver> addressObserverSet;
    
    /**
     * Constructeur des objets de AddressObserverSet
     * 
     */
    public AddressObserverSet(){
        this.addressObserverSet = new HashSet<AddressObserver>();
    }
    
    /**
     * addAddressObserver - Ajoute un AddressObserver à la collection
     * 
     * @param ao L'AddressObserver à ajouter
     */
    public void addAddressObserver(AddressObserver ao){
        addressObserverSet.add(ao) ;    
    }
    
    /**
     * removeAddressObserver - Supprime un AddressObserver de la collection
     * 
     * @param ao L'AddressObserver à supprimer
     */
    public void removeAddressObserver(AddressObserver ao){
        addressObserverSet.remove(ao);
    }
    
    /**
     * notifyStreetChanged - Notifie d'un changement de numéro et de nom de rue
     * 
     * @param ad L'adresse associée
     * @param oldStreet L'ancienne rue et numéro de rue
     * @param newStreet La nouvelle rue et numéro de rue
     */
    public void notifyStreetChanged(Address ad,String oldStreet,String newStreet){
        for(AddressObserver ao : this.addressObserverSet){
            ao.streetChanged(ad,oldStreet,newStreet);
        }
    }
    
    /**
     * notifyCityChanged - Notifie d'un changement de ville
     * 
     * @param ad L'adresse associée
     * @param oldCity L'ancienne ville
     * @param newCity La nouvelle ville
     */ 
    public void notifyCityChanged(Address ad,String oldCity,String newCity){
        for(AddressObserver ao : this.addressObserverSet){
            ao.cityChanged(ad,oldCity,newCity);
        }
    }
       
    /**
     * zipCodeChanged - Notifie d'un changement de code postal
     * 
     * @param ad L'adresse associée
     * @param oldZip L'ancien code postal
     * @param newZip Le nouvel code postal
     */
    public void notifyZipCodeChanged(Address ad,String oldZip,String newZip){
        for(AddressObserver ao : this.addressObserverSet){
            ao.zipCodeChanged(ad,oldZip,newZip);
        }
    }
    
    /**
     * countryChanged - Notifie d'un changement de pays
     * 
     * @param ad L'adresse associée
     * @param oldCountry L'ancien pays
     * @param newCountry La nouveau pays
     */
    public void notifyCountryChanged(Address ad,String oldCountry,String newCountry){
        for(AddressObserver ao : this.addressObserverSet){
            ao.countryChanged(ad,oldCountry,newCountry);
        }
    }
}