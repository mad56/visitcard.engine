package fr.univubs.inf1603.visitcard.engine;

/**
 * Address - Type abstrait de donné 
 *           Décrit une adresses
 * 
 * @author inf1603
 */
public interface Address {
    
    /**
     * getStreet - Retourne le numéro et le nom de rue
     * 
     * @return Le numéro et nom de rue
     */
    public String getStreet ();
    
    /**
     * setStreet - Change le numéro et le nom de rue
     * 
     * @param newStreet Le nouveau numéro et nom de rue
     */
    public void setStreet(String newStreet);
    
    /**
     * getCity - Retourne la ville
     * 
     * @return La ville
     */
    public String getCity();
    
    /**
     * setCity - Change la ville
     * 
     * @param newLocality La nouvelle ville
     */
    public void setCity(String newLocality);
    
    /**
     * getZipCode - Retourne le code postal
     * 
     * @return Le code postal
     */
    public String getZipCode();
    
    /**
     * setZipCode - Change 
     * 
     * @param newZipCode Le nouveau code postal
     */
    public void setZipCode(String newZipCode);
    
    /**
     * getCountry - Retourne le pays
     * 
     * @return Le pays
     */
    public String getCountry();
    
    /**
     * setCountry - Change le pays
     * 
     * @param newCountry Le nouveau pays
     */
    public void setCountry(String newCountry);
    
    /**
     * addAddressObserver - Ajoute un AddressObserver
     * 
     * @param ao Le nouvel observeur
     */
    public void addAddressObserver(AddressObserver ao);
    
    /**
     * removeAddressObserver - Supprime un AddressObserver
     * 
     * @param ao L'observeur à supprimer
     */
    public void removeAddressObserver(AddressObserver ao);
}
