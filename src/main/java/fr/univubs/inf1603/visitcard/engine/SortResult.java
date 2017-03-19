package fr.univubs.inf1603.visitcard.engine;

/**
 * SortResult - Type abstrait de données pour les resultats des différents types de tri 
 *              des cartes de visites (VisitCard) au sein du carnet d'adresse (AddressBook)
 * 
 * @author inf1603
 */
public interface SortResult{
    
    /**
     * getSize - Retourne la taille du tri
     * 
     * @return La taille du tri
     */
    public int getSize();
    
    /**
     * getVisitCard - Retourne la carte de visite à un index donné
     * 
     * @param i L'index de la VisitCard
     * @return La VisitCard à l'index désiré 
     */
    public VisitCard getVisitCard(int i);
    
}