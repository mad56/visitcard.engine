package fr.univubs.inf1603.visitcard.engine;

import fr.univubs.inf1603.visitcard.engine.VisitCard;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import static jdk.nashorn.internal.objects.NativeArray.sort;

/**
 * LastNameSortResult - POJO
 *                      Résultat après tri selon le nom de famille
 *
 * @author POJO
 */
public class LastNameSortResult extends AbstractSortResult {
    
    public LastNameSortResult(Collection<VisitCard> visitCardCollection){
        super(visitCardCollection, new LastNameComparator());
    }
    
}
