package fr.univubs.inf1603.visitcard.engine;

import fr.univubs.inf1603.visitcard.engine.SortResultObserver;
import fr.univubs.inf1603.visitcard.engine.SortResultObserverSet;
import fr.univubs.inf1603.visitcard.engine.VisitCard;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * AbstractSortResult - Implémentation de l'interface SortResult de l'engine
 *                      Classe abstraite pour réunir toutes les méthodes 
 *                      communes au différentes classes filles
 *
 * @author POJO
 */
public abstract class AbstractSortResult implements SortResult {
    
    /**
     * La liste des contact trié.
     */
    List<VisitCard> visitCardList;
    
    /**
     * Collection de SortResultObserver Liés à l'objet.
     */
    SortResultObserverSet sros ;
    
    /**
     * Constructeur de AbstractSortResult
     * 
     * @param visitCardCollection La collection de carte de visite à trier
     * @param comparator Le comparateur nécessaire au tri.
     */
    protected AbstractSortResult(Collection<VisitCard> visitCardCollection, Comparator<VisitCard> comparator) {
        this.visitCardList = new ArrayList(visitCardCollection);
        Collections.sort(visitCardList, comparator) ;
        this.sros = new SortResultObserverSet();
    }
    
    @Override
    public int getSize() {
        return this.visitCardList.size();
    }

    @Override
    public VisitCard getVisitCard(int i) {
        if(i<0){
            throw new ArrayIndexOutOfBoundsException("L'index est négatif");
        }
        return visitCardList.get(i);
    }
    
    /**
     * addSortResultObserver - Ajoute un observer passé en paramètre
     * 
     * @param observer L'observer à ajouter
     */
    public void addSortResultObserver(SortResultObserver observer){
        this.sros.addSortResultObserver(observer);
    }
    
    /**
     * removeSortResultObserver - Supprime un observer passé en paramètre
     * 
     * @param observer L'observer à supprimer
     */
    public void removeSortResultObserver(SortResultObserver observer){
        this.sros.removeSortResultObserver(observer);
    }
}
