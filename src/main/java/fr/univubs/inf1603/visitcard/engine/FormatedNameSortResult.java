package fr.univubs.inf1603.visitcard.engine;

import fr.univubs.inf1603.visitcard.engine.VisitCard;
import java.util.Collection;
import java.util.Map;
import java.util.HashSet;
import java.util.UUID;
import static jdk.nashorn.internal.objects.NativeArray.sort;

/**
 * FormatedNameSortResult - POJO
 *                          Résultat après tri selon le nom formaté
 *
 * @author POJO
 */
public class FormatedNameSortResult extends AbstractSortResult {
    
     public FormatedNameSortResult(Collection<VisitCard> visitCardHashCollection){
         super(visitCardHashCollection, new FormatedNameComparator());
    }
    
}
