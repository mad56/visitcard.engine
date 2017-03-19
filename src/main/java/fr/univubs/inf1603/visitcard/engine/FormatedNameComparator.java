package fr.univubs.inf1603.visitcard.engine;

import fr.univubs.inf1603.visitcard.engine.AbstractComparator;
import fr.univubs.inf1603.visitcard.engine.VisitCard;

/**
 * FormatedNameComparator - POJO
 *                          Comparateur selon le nom formaté
 *
 * @author POJO
 */
public class FormatedNameComparator extends AbstractComparator <VisitCard> {
    
    @Override
    public String getString(VisitCard pvc) {
        return pvc.getFormatedName() ;
    }
    
}
