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
public class AddressBookObserverSet {

    /**
     * Collections des VisitCardObserverDistincts
     */
    HashSet<AddressBookObserver> addressBookObserverSet;

    /**
     * notifyNameChanged - Notifie d'un changement de nom de carnet auprËs de
     * tout les AddressBookObserver
     *
     * @param ab Le carnet d'adresse
     * @param oldName L'ancien nom
     * @param newName Le nouveau nom
     */
    public void notifyNameChanged(AddressBook ab, String oldName, String newName) {
        for (AddressBookObserver abo : this.addressBookObserverSet) {
            abo.nameChanged(ab, oldName, newName);
        }
    }

    /**
     * notifyAddressBookSaved - Notifie de la sauvegarde du carnet d'adresse
     * auprËs de tout les AddressBookObserver
     *
     */
    public void notifyAddressBookSaved() {
        for (AddressBookObserver abo : this.addressBookObserverSet) {
            abo.addressBookSaved();
        }
    }

    /**
     * notifyAddressBookRollback - Notifie du rollback du carnet d'adresse
     * auprËs de tout les AddressBookObserver
     *
     */
    /*public void notifyAddressBookRollback() {
        for(AddressBookObserver abo : this.addressBookObserverSet){
            abo.addressBookRollback();
        }
    }*/
    /**
     * notifyVisitCardAdded - Notifie d'un ajout de VisitCard auprËs de tout les
     * AddressBookObserver
     *
     * @param ab Le carnet d'adresse concernÈ
     * @param vc La nouvelle carte de visite
     */
    public void notifyVisitCardAdded(AddressBook ab, VisitCard vc) {
        for (AddressBookObserver abo : this.addressBookObserverSet) {
            abo.visitCardAdded(ab, vc);
        }
    }

    /**
     * notifyVisitCardRemoved - Notifie de la supression d'une VisitCard auprËs
     * de tout les AddressBookObserver
     *
     * @param ab Le carnet d'adresse concernÈ
     * @param vc L'ancienne carte de visite
     */
    public void notifyVisitCardRemoved(AddressBook ab, VisitCard vc) {
        for (AddressBookObserver abo : this.addressBookObserverSet) {
            abo.visitCardRemoved(ab, vc);
        }
    }

    /**
     * addAddressBookObserver - Ajoute un nouvel AddressBookObserver ‡ la
     * collection
     *
     * @param abo Le nouvel AddressBookObserver
     */
    public void addAddressBookObserver(AddressBookObserver abo) {
        this.addressBookObserverSet.add(abo);
    }

    /**
     * removeAddressBookObserver - Supprime un AddressBookObserver de la
     * collection
     *
     * @param abo L'ancien AddressBookObserver
     */
    public void removeAddressBookObserver(AddressBookObserver abo) {
        this.addressBookObserverSet.remove(abo);
    }
}
