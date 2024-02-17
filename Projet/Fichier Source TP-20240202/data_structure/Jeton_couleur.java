package data_structure;
import java.awt.Color;
//PlayPegs subclass of Pegs
import java.util.*;

public class Jeton_couleur /* A COMPLETER */{

	/*** ATTRIBUTS STATIQUES ***/
    private static Color[] colors = {Color.red, Color.blue, Color.cyan, Color.yellow, Color.MAGENTA, Color.orange};
    private static ArrayList<String> USED_COLORS = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
			{add("RED"); add("BLUE"); add("CYAN"); add("YELLOW"); add("MAGENTA"); add("ORANGE");}
	};
    
    /*** METHODES ***/
    
    /* Constructeurs */
	//Ne touchez pas à ce constructeur
	public Jeton_couleur(String s) {
    }
	
	/* A COMPLETER : ajouter un constructeur vide initialisant le jeton avec une couleur aléatoire de l'attribut USED_COLORS - cf 2.2.1/e)/3. */

	/* A COMPLETER : ajouter un constructeur prenant un entier en entrée, et initialisant l'attribut _color avec la couleur de USED_COLORS correspondante - cf 2.2.1/e)/4. */
    
    
    
    /* Getters */
	/* A COMPLETER */
	/* Ajoutez deux getters : getUSED_COLORS et getColors - cf 2.2.1/e)/5. et 6. */
    
    /* Autres */
    
    //Cette méthode renvoi l'indice de colors correspondant à la couleur passée en paramètre
	//Ne touchez pas à cette fonction
    public static int colorToInt(Color c) {
    	int i = 0;
    	for(Color elem : Jeton_couleur.colors) {
    		if(elem.equals(c)) {
    			return i;
    		}
    		i++;
    	}
    	System.out.println("Erreur de saisie!");
    	return -1;
    }
    
    /* Méthode evaluation
     *  Cette méthode renvoi :
     *	- GREEN (0) si le jeton à la même valeur que le jeton de solutionGagnante à la position pos
     *  - BLACK (1) si le jeton à la même valeur que n'importe quel autre jeton de solutionGagnante
     *  - WHITE (2) sinon */
    
    public Jeton_indice evaluation(Row solutionGagnante, int pos) {
    	/* A COMPLETER - cf 2.2.2/e) */
    }
}
