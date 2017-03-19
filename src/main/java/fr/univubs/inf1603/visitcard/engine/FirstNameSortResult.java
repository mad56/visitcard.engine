package fr.univubs.inf1603.visitcard.engine;

import fr.univubs.inf1603.visitcard.engine.VisitCard;
import java.util.Collection;
import java.util.Map;
import java.util.HashSet;
import java.util.UUID;
import static jdk.nashorn.internal.objects.NativeArray.sort;

/**
 * FirstNameSortResult - POJO
 *                       Résultat après tri selon le prénom
 *
 * @author POJO
 */
public class FirstNameSortResult extends AbstractSortResult {
    
    public FirstNameSortResult(Collection<VisitCard> visitCardCollection){
        super(visitCardCollection, new FirstNameComparator());
        
    }
    
}
