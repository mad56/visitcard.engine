package fr.univubs.inf1603.visitcard.engine;

/**
 * SortResultObserver - Obseveur du résultat du tri (SortResult).
 *                      Interface implémentant la notion d'observeur pour les SortResult
 *                      L'observeur sera informé des modifiations lié à l'objet qu'il observe
 * 
 * @author inf1603
 */
public interface SortResultObserver {
    
    /**
     * sizeChanged - Notifie d'un changement de taille du carnet d'adresse 
     *               (après ajout et/ou supression par exemple)
     * 
     * @param sr Le SortResult observé
     * @param oldSize L'ancienne taille du SortResult
     * @param newSize La nouvette taille du SortResult
     */
    public void sizeChanged(SortResult sr, int oldSize, int newSize);
    
    /**
     * sortChanged - Modifie le SortResult à observer
     * 
     * @param sr Le SortResult à observer
     */
    public void sortChanged(SortResult sr);
}