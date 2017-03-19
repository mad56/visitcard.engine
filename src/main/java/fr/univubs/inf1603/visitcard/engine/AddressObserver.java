package fr.univubs.inf1603.visitcard.engine;

/**
 * AddressObserver - Obseveur de l'adresse (Address).
 *                   Interface implémentant la notion d'observeur pour les Address
 *                   L'observeur sera sera informé des modifiations lié à l'objet qu'il observe
 * 
 * @author inf1603
 */
public interface AddressObserver{
    
    /**
     * streetChanged - Notifie d'un changement de rue et ou numéro de rue
     * 
     * @param ad L'adresse observé
     * @param oldStreet L'ancienne rue et numéro de rue
     * @param newStreet La nouvelle adresse rue et numéro de rue
     */
    public void streetChanged(Address ad,String oldStreet,String newStreet);
    
    /**
     * cityChanged - Notifie d'un changement de ville
     * 
     * @param ad L'adresse observé
     * @param oldCity L'ancienne ville
     * @param newCity La nouvelle ville
     */
    public void cityChanged(Address ad,String oldCity,String newCity);
    
    /**
     * zipCodeChanged - Notifie d'un nouveau changement de code postal
     * 
     * @param ad L'adresse observé
     * @param oldZip L'ancien code postal
     * @param newZip Le nouveau code postal
     */
    public void zipCodeChanged(Address ad,String oldZip,String newZip);
    
    /**
     * countryChanged - Notifie d'un changement de pays
     * 
     * @param ad L'adresse observé
     * @param oldCountry L'ancien pays
     * @param newCountry Le nouveau pays
     */
    public void countryChanged(Address ad,String oldCountry,String newCountry);
}