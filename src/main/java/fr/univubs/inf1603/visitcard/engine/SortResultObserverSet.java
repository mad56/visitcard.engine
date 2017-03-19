/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.univubs.inf1603.visitcard.engine;

import java.util.HashSet;

/**
 *
 * @author inf1603
 */
public class SortResultObserverSet {
    
    HashSet<SortResultObserver> sortResultObserverSet; //La collection de SortResultObserver
    
    public SortResultObserverSet(){
        this.sortResultObserverSet = new HashSet();
    }
    
    /**
     * notifySizeChanged - Notifie d'un changement de taille du résultat de tri
     * 
     * @param sr Le résultat de tri en question
     * @param oldSize L'ancienne taille
     * @param newSize La nouvelle taille
     */
    public void notifySizeChanged(SortResult sr, int oldSize, int newSize) {
        for(SortResultObserver sro : this.sortResultObserverSet){
            sro.sizeChanged(sr,oldSize,newSize);
        }
    }

    /**
     * notifySortChanged - Notifie d'un changement de SortRsult
     * 
     * @param sr Le nouveau SortResult
     */
    public void notifySortChanged(SortResult sr) {
        for(SortResultObserver sro : this.sortResultObserverSet){
            sro.sortChanged(sr);
        }
    }
    
    /**
     * addSortResultObserver - Ajoute un observer à la collection
     * 
     * @param observer 
     */
    public void addSortResultObserver(SortResultObserver observer){
        this.sortResultObserverSet.add(observer);
    }
    
    /**
     * removeSortResultObserver - Supprime un observer à la collection
     * 
     * @param observer 
     */
    public void removeSortResultObserver(SortResultObserver observer){
        this.sortResultObserverSet.remove(observer);
    }
    
}
