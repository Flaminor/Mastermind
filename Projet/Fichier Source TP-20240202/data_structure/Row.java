package data_structure;
import java.util.*;

public class Row/* A COMPLETER */{
	
	/*** ATTRIBUTS ET METHODES STATIQUES ***/
	private static ArrayList<String> colorPos = new ArrayList<String>() {
		private static final long serialVersionUID = 1L;
	{add("1"); add("2"); add("3"); add("4");}};
	
	public static ArrayList<String> getColorPositions(){
    	return Row.colorPos;
    }
	
	/* Attributs */
    private ArrayList<T> row;

    /* Constructeur */
    public Row(){
        this.row = new ArrayList<T>();
    }
    
    /* Autres méthodes */
    
    //Cette méthode renvoi vrai si la Row contient un élément ayant la même valeur que j, faux sinon
    public boolean contains(T j) {
    	for(T elem : this.row) {
    		if(j.equals(elem)) {
    			return true;
    		}
    	}
    	return false;
    }

    /* Méthode equals
     * Cette méthode renvoi vrai si la Row est équivalente à r, faux sinon */
    /* A COMPLETER - cf 2.2.2/c) */

    /* Méthode toString
     * Cette méthode convertie la Row en un string */
    /* A COMPLETER - cf 2.2.2/d) */
    
    //Cette méthode renvoie un String qui facilite la compréhension dans une partie non-graphique
    public String toStringSelect(int x) {
    	String s = "|";
    	int count = 0;
        for(Jeton p: row){
        	if(count == x) {
        		s += ("   x   |");
        	}
        	else {
        		s += (p.toStringCentered() + "|");
        	}
        	count++;
        }
        return s;
    }

    /*Getters*/
    public ArrayList<T> rowGet() {
    	return this.row;
    }
    
    public T rowGet(int index) {
    	return this.row.get(index);
    }
    
    
    /*Setters*/
    public void rowAdd(T p){
    	this.row.add(p);
    }


    public void rowSet(T p, int index) {
    	//System.out.println("Affectation "+index+" -> "+p._color);
    	this.row.set(index, p);
    }
    
    //Cette méthode renvoie vrai si la Row contient quatre éléments non vide
    public boolean complete() {
    	for(int i = 0;i < row.size();i++) {
    		if((this.row.get(i)._color.compareTo("NONE")) == 0) {
    			return false;
    		}
    	}
    	return row.size() == 4;
    }
    
    /* Méthode computeSoluce
     * Cette fonction doit être appelée depuis la ligne ligneGagnante. 
     * Elle renvoie une ligne indices contenant des Jeton_indice, cette ligne contient pour chaque jeton de la ligne proposition, un jeton de couleur : 
     * 	- GREEN : le jeton de la proposition correspond au jeton de la ligneGagnante à la même position
     *  - BLACK : le jeton de la proposition correspond à un jeton d'une autre position dans la ligneGagnante
     *  - WHITE : le jeton ne correspond à aucun jeton de la ligneGagnante */
    public Row<Jeton_indice> computeSoluce(Row<Jeton_couleur> proposition) {
    	/* A COMPLETER - cf 2.2.2/f) */
    }
    
    /* Méthode succeed
     * Cette méthode renvoie true si la Row (this) ne contient que des Jeton_indice de valeur GREEN */
    /* A COMPLETER - cf 2.2.2/g) */
    
    //Affichage
    public String[] stringTab() {
    	String[] res = new String[10];
    	int i = 0;
    	for(T j : row) {
    		res[i++] = j._color;
    	}
    	return res;
    }
}
