package fr.univubs.inf1603.visitcard.engine;

/**
 * AddressBookObserver - Obseveur du carnet d'adresses (AddressBook).
 *                       Interface implémentant la notion d'observeur pour les AddressBook
 *                       L'observeur sera sera informé des modifiations lié à l'objet qu'il observe
 * 
 * @author inf1603
 */
public interface AddressBookObserver{
    /**
     * nameChanged - Notifie d'un changement de nom de carnet d'adresse
     * 
     * @param ab L'AddressBook observé
     * @param oldName L'ancien nom du carnet d'adresses
     * @param newName Le nouveau nom du carnet d'adresses
     */
    public void nameChanged(AddressBook ab, String oldName, String newName);
    
    /**
     * addressBookSaved - Notifie de la sauvegarde de l'AddressBook
     */
    public void addressBookSaved();
     
    /**
     * visitCardAdded - Notifie de l'ajout d'une carte de visite 
     * 
     * @param ab L'AddressBook observé
     * @param vc La VisitCard ajouté
     */
    public void visitCardAdded(AddressBook ab, VisitCard vc);
    
    /**
     * visitCardRemoved - Notifie de la supression d'une carte de visite 
     * 
     * @param ab L'AddressBook observé
     * @param vc La VisitCard supprimé
     */
    public void visitCardRemoved(AddressBook ab, VisitCard vc);
}