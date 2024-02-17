package main;
import java.io.*;

import data_structure.Jeton;
import data_structure.Jeton_couleur;
import data_structure.Jeton_indice;
import data_structure.Row;
import graphics.TableModel;

public class Game{
	
	
	/*** Attributs ***/
	
    private Row<Jeton_couleur> ligneGagnante,proposition;
    private int counter;
    
    //Attributs pour l'interface graphique
    public TableModel indicators_data = new TableModel();
    public TableModel reponses_data = new TableModel();
    private InputStreamReader isr;
    private BufferedReader in;

    /*** Methodes ***/
    
    /* Constructeur */
    
    public Game(){
        this.initLigneGagnante();
        this.initProposition();
        counter = 0;
        isr = new InputStreamReader(System.in);
        in = new BufferedReader( isr );
    }
    
    /* Accesseur */
    public int getCounter() {
    	return this.counter;
    }
    
    public Row<Jeton_couleur> getProposition(){
    	return this.proposition;
    }
    
    /* Init methode */
    
    //M�thode qui instancie l'attribut ligneGagnante avec une Row contenant 4 Jeton_couleur ayant une valeur al�atoire(appeler le constructeur de Jeton_couleur sans argument)
    public void initLigneGagnante() {
    	this.ligneGagnante = new Row<Jeton_couleur>();
    	for(int i = 0;i < 4;++i) {
    		Jeton_couleur j = new Jeton_couleur();
    		this.ligneGagnante.rowAdd(j);
    	}
    }
    
    //M�thode qui instancie l'attribut proposition avec une Row contenant 4 Jeton_couleur vides (appeler le constructeur de Jeton_couleur avec un argument String "NONE")
    public void initProposition() {
    	this.proposition = new Row<Jeton_couleur>();
    	for(int i = 0;i < 4;++i) {
    		Jeton_couleur j = new Jeton_couleur("NONE");
    		this.proposition.rowAdd(j);
    	}
    }
    
    /* Autres m�thodes */
    
    //M�thode qui affiche le menu des couleurs
    public void afficherMenu() {
        String s = "Couleurs : | ";
        int count = 0;
        for(String temp : Jeton_couleur.getUSED_COLORS()) {
        	s += count+" -"+Jeton.toStringCentered(temp)+" |";
        	count++;
        }
        System.out.println(s);
    }

    //M�thode qui permet la saisie par l'utilisateur d'une propostion stock�e dans l'attribut proposition
    public void saisieProposition() {
    	for (int x = 0; x < 4; x++){
            System.out.println("Choisissez la couleur du jeton " + x+" ("+proposition.toStringSelect(x)+")");
            try{
                int tInt = Integer.parseInt( in.readLine());
                if (tInt < 6 && tInt > -1)
                    this.proposition.rowSet(new Jeton_couleur(tInt),x);
                else{
                    System.out.println("Number out of range. Please make a selection from the key.");
                    x--;
                }
            }
            catch ( IOException e ){
                System.out.println("Input not an integer. Please make a selection from the key.");
                x--;
            }
            catch ( NumberFormatException e ){
                System.out.println("Input not an integer. Please make a selection from the key.");
                x--;
            }
        }
    }
    
    /* M�thode evalProposition
     * Cette m�thode est appel�e dans l'interface graphique GUI, elle permet d'�valuer la proposition du joueur (attribut de la classe Game), met � jour l'interface graphique et renvoi true si le joueur a trouv� le code, false sinon
     */
    /* A COMPLETER : Vous devez compl�ter cette fonction en suivant l'algorithme d�crit en commentaire  */
    public boolean evalProposition() {
    	/* R�cuperez dans une variable l'�valuation de l'attribut proposition par la ligne ligneGagnante
    	 * Stockez dans le tableau responses_data.donnees � la ligne num�ro counter, la proposition convertie en tableau (utilisez une m�thode de la classe Row).
    	 * Stockez dans le tableau indicators_data.donnees � la ligne num�ro counter, l'�valuation de la proposition convertie en tableau (utilisez une m�thode de la classe Row).
    	 * Mettez � jour l'interface graphique en appelant depuis responses_data et indicators_data la m�thode fireTableDataChanged().
    	 * N'oubliez pas d'incr�menter le compteur de tour (attribut de la classe Game
    	 * Renvoyez true si la proposition est correcte (�gale au code), false sinon. Pour cela, utilisez simplement la m�thode succeed.*/
    }
    
    /* M�thode nonGraphicsGame
     * Cette m�thode permet de jouer en mode non graphique */
    /* A COMPLETER : Vous devez compl�ter cette fonction en suivant l'algorithme d�crit en commentaire */
    public void nonGraphicsGame(){
    	//Notez ici les variables qui peuvent vous �tre utiles
        
        //Afficher un message de d�but de partie
        
        /* BOUCLE tant qu'on a pas fait 10 tours (utilisez l'attribut counter) et que l'on a pas gagn� (utilisez un boolean)
	         *	R�initialiser la proposition (utilisez les m�thodes d�finies dans la classe Game)
	          
	         *   Afficher le num�ro du tour en cours
	         *   Afficher le menu (utilisez les m�thodes d�finies dans la classe Game)
	         *	 R�aliser la saisie de la proposition (utilisez les m�thodes d�finies dans la classe Game)
	         *   R�cuperer dans une variable le retour de l'�valuation de la proposition (utilisez les attributs de la classe Game, et les m�thodes que vous avez codez pr�c�demment)
	         *   
	         *   SI l'�valuation est un succ�s (utilisez les m�thodes que vous avez cod� pr�c�demment)
	         		*  Afficher que vous avez gagnez, avec la proposition
                	*  N'oubliez pas de modifier les variables permettant de terminer votre boucle
             *   
             *   SINON
					*  Afficher que la proposition n'est pas correcte, avec la proposition
					*  Augmenter le compteur de tour (attribut)
                
        	*	Fin SI
         * Fin BOUCLE
        * Afficher un message de d�faite si vous avez d�pass� les 10 tours
        */
    }

    public static void main(String[] args){
        Game gTerm = new Game();
        gTerm.nonGraphicsGame();
    }
}
