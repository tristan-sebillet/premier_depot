package programme;

import java.util.ArrayList;
public class Main {

public static void main(String[] args) {

// Attributs //
int[] liste_departements = {21,25,39,44,72,73,74,75,85,90};
double[][] liste_tarifs = {{2,0.86,1.72,21.93,1.29,2.58,21.93},{2.1,0.83,1.66,22.5,1.2,2.4,22.5},{2.1,0.83,1.66,22.5,1.23,2.46,25},{2.2,0.79,1.58,24.19,1.19,2.37,24.19},{2.15,0.79,1.58,22.86,1.19,2.38,22.86},{2.4,0.84,1.68,25.4,1.26,2.52,25.4},{3.15,0.92,1.84,17.3,1.38,2.76,17.3},{2.5,1,1.24,0,1.5,1.5,0},{2.3,0.8,1.6,22.2,1.2,2.4,22.2},{2.2,0.83,1.66,21,1.15,2.3,21}};
Saisie mesSaisies = new Saisie(new Brochure("taxi", new ArrayList<Tarif>()));

//Boucle ajoutant tous les Tarifs, à partir des deux précédents tableaux, dans la brochure de la classe Saisie
for (int i = 0 ; i < liste_departements.length ; i++)
{
mesSaisies.getBrochure().AddTarif(new Tarif(liste_departements[i],liste_tarifs[i][0],liste_tarifs[i][1],liste_tarifs[i][2],liste_tarifs[i][4],liste_tarifs[i][5],liste_tarifs[i][3],liste_tarifs[i][6]));
}
//Affichage du message final
System.out.println("Vous devez payer la somme de " + mesSaisies.calculPrixAPayer() + " euros.");
mesSaisies.closeScanner();
}
}
