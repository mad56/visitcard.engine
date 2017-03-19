package fr.univubs.inf1603.visitcard.engine;

/**
 * AddressBookFactory - Type abstrait de données
 *                      Fabrique de carnet d'adresses
 * 
 * @author inf1603
 */
public interface AddressBookFactory {
    /**
     * AddressBook - Créé un AddressBook.
     * 
     */
    public AddressBook createAddressBook() ;
    
    /**
     * createVisitCard - Créé une VisitCard.
     * 
     */
    public VisitCard createVisitCard() ;
}
