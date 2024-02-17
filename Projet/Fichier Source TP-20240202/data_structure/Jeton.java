package data_structure;

public /* A COMPLETER */ class Jeton{

    /* Constructeurs */
	/* A COMPLETER */
	
    //Méthode equals : renvoi true si p a une valeur équivalente à this (utilisez la méthode equals des String) - cf 2.2.1/c)/a.
	/* A COMPLETER */
    
    
    /* Methodes d'affichage */
	//Ne toucher pas au code suivant
    
    public String toString() {
    	return _color;
    }
    
    public String toStringCentered() {
    	int nb_spaces = 7 - this._color.length();
    	int debut = nb_spaces/2;
    	String res = "";
    	for(int i = 0;i < debut;++i) {
    		res = res.concat(" ");
    	}
    	res = res.concat(this.toString());
    	for(int i = 0;i < nb_spaces-debut;++i) {
    		res = res.concat(" ");
    	}
    	return res;
    }
    
    public static String toStringCentered(String color) {
    	int nb_spaces = 7 - color.length();
    	int debut = nb_spaces/2;
    	String res = "";
    	for(int i = 0;i < debut;++i) {
    		res = res.concat(" ");
    	}
    	res = res.concat(color.toString());
    	for(int i = 0;i < nb_spaces-debut;++i) {
    		res = res.concat(" ");
    	}
    	return res;
    }

}
