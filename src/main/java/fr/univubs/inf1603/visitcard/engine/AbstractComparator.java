package fr.univubs.inf1603.visitcard.engine;

import java.util.Comparator;

/**
 * AbstractComparator - Comparateur lexicographique pour les différent tris
                        Le comparateur est abstrait pour réunir les méthodes 
                        communes au différents comparateurs
                        LeComparateur est générique our pouvoir s'adapter selon les situation
 *
 * @author POJO
 * @param <E>
 */
public abstract class AbstractComparator <E> implements Comparator <E>{
    
    @Override
    public int compare(E e1, E e2) {
        if(e1==null){
            if(e2==null){
                return 0;
            }else{
                return -1;
            }
        }else if(e2==null){
            return 1;
        }else{
            String s1 = getString(e1);
            String s2 = getString(e2);
            return s1.compareTo(s2);
        }
    }
    
    /**
     * getString - Retourne la chaine de caractères sur laquelle se baser pour 
     *             la comparaison
     *             La méthode est abstraite car dépendra de l'objet
     * 
     * @param e Un objet à comparer
     * @return La chaine de caractère sur laquelle baser la comparaison
     */
    public abstract String getString(E e) ;
}
