package fr.univubs.inf1603.visitcard.engine;

import fr.univubs.inf1603.visitcard.engine.AbstractComparator;
import fr.univubs.inf1603.visitcard.engine.VisitCard;

/**
 * LastNameComparator - POJO
 *                      Comparateur selon le nom de famille
 *
 * @author POJO
 */
public class LastNameComparator extends AbstractComparator <VisitCard> {
    
    @Override
    public String getString(VisitCard pvc) {
        return pvc.getLastName() ;
    }
    
}
