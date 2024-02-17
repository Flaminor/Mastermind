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
    
    /* Autres m�thodes */
    
    //Cette m�thode renvoi vrai si la Row contient un �l�ment ayant la m�me valeur que j, faux sinon
    public boolean contains(T j) {
    	for(T elem : this.row) {
    		if(j.equals(elem)) {
    			return true;
    		}
    	}
    	return false;
    }

    /* M�thode equals
     * Cette m�thode renvoi vrai si la Row est �quivalente � r, faux sinon */
    /* A COMPLETER - cf 2.2.2/c) */

    /* M�thode toString
     * Cette m�thode convertie la Row en un string */
    /* A COMPLETER - cf 2.2.2/d) */
    
    //Cette m�thode renvoie un String qui facilite la compr�hension dans une partie non-graphique
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
    
    //Cette m�thode renvoie vrai si la Row contient quatre �l�ments non vide
    public boolean complete() {
    	for(int i = 0;i < row.size();i++) {
    		if((this.row.get(i)._color.compareTo("NONE")) == 0) {
    			return false;
    		}
    	}
    	return row.size() == 4;
    }
    
    /* M�thode computeSoluce
     * Cette fonction doit �tre appel�e depuis la ligne ligneGagnante. 
     * Elle renvoie une ligne indices contenant des Jeton_indice, cette ligne contient pour chaque jeton de la ligne proposition, un jeton de couleur : 
     * 	- GREEN : le jeton de la proposition correspond au jeton de la ligneGagnante � la m�me position
     *  - BLACK : le jeton de la proposition correspond � un jeton d'une autre position dans la ligneGagnante
     *  - WHITE : le jeton ne correspond � aucun jeton de la ligneGagnante */
    public Row<Jeton_indice> computeSoluce(Row<Jeton_couleur> proposition) {
    	/* A COMPLETER - cf 2.2.2/f) */
    }
    
    /* M�thode succeed
     * Cette m�thode renvoie true si la Row (this) ne contient que des Jeton_indice de valeur GREEN */
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
