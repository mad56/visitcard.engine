package fr.univubs.inf1603.visitcard.engine;

import java.util.UUID;

/**
 * AddressBook - Type abstrait de donnée 
 *               Décrit un carnet d'adresse.
 * 
 * @author inf1603
 */
public interface AddressBook {
    /**
     * getName - Renvoie le nom du carnet.
     * 
     * @return Le nom du carnet.
     */
    public abstract String getName();
     
    /**
     * setName - Modifie le nom du carnet.
     * 
     * @param name Le nouveau nom.
     */
    public abstract void setName(String name);
    
    /**
     * getSize - Retourne la taille du carnet.
     * 
     * @return la taille du carnet.
     */
    public abstract long getSize();
    
    /**
     * getVisitCard - Retourne la VisitCard correspondant à l'UUID donné en paramètre.
     * 
     * @param uuid L'identifiant de la carte de visite
     * @return La VisitCard correspondante.
     */
    public VisitCard getVisitCard(UUID uuid);
    
    /**
     * save - Sauvegarde concrètement les modifications apportées à la BDD.
     * 
     */
    public abstract void save();
    
    /**
     * addVisitCard - Ajoute une VisitCard au carnet d'adresse.
     * 
     * @param vc La VisitCard à ajouter au carnet d'adresse.
     */
    public void addVisitCard(VisitCard vc);
    
    /**
     * removeVisitCard - Supprime une VisistCard du carnet d'adresse.
     * 
     * @param uuid UUID (identifiant unique) de la VisitCard à supprimer.
     */
    public void removeVisitCard(UUID uuid);
    
    /**
     * removeVisitCard - Supprime une VisistCard du carnet d'adresse.
     * 
     * @param vc Lla VisitCard à supprimer.
     */
    public void removeVisitCard(VisitCard vc);
    
    /**
     * getSortResult - Retourne le tri du carnet ordoné selon un paramètre
     * 
     * @param st Le type de tri attendu (ORDER_BY_FIRST_NAME ...)
     * @return Le résultat du tri
     */
    public SortResult getSortResult(SortType st);
    
    /**
     * addAddressBookObserver - Ajoute un AddressBookObserver
     * 
     * @param abo Le nouvel observeur
     */
    public void addAddressBookObserver(AddressBookObserver abo);
    
    /**
     * removeAddressBookObserver - Supprime un AddressBookObserver
     * 
     * @param abo L'observeur à supprimer
     */
    public void removeAddressBookObserver(AddressBookObserver abo);
 
}

//UUID
//public UUID(long mostSigBits, long leastSigBits)
//public static UUID randomUUID()
//public static UUID fromString(String name)