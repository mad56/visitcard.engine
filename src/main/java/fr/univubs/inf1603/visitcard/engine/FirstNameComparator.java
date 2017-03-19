package fr.univubs.inf1603.visitcard.engine;

import fr.univubs.inf1603.visitcard.engine.AbstractComparator;
import fr.univubs.inf1603.visitcard.engine.VisitCard;

/**
 * FirstNameComparator - POJO
 *                       Comparateur selon le prénom
 *
 * @author POJO
 */
public class FirstNameComparator extends AbstractComparator <VisitCard> {
    
    @Override
    public String getString(VisitCard pvc) {
        return pvc.getFirstName() ;
    }   
}
