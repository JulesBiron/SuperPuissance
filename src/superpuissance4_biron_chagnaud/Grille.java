/*
classe grille
 */
package superpuissance4_biron_chagnaud;

/**
 *
 * @author jbiron
 */
public class Grille {
    Cellule[][] grille = new Cellule[6][7];
    
    public boolean ajouterJetonDansColonne(Jeton unJeton, int numeroColonne){
        
    }
    
    public boolean etreRempli(){
    
    }
    
    public void viderGrille(){
        
    }
    
    public void afficherGrilleSurConsole(){
        
    }
    
    public boolean celluleOccupé(){
        
    }
    
    public String lireCouleurDuJeton(){
        
    }
    
    public boolean etreGgnantePourJoueur(Joueur unJoueur){
        
    }
    
    public void tasserGrille(){
        for (int i=1;i<7;i++){
            for(int j=0;j<6;j++){
                grille[i-1][j] = grille[i][j];
            }
        }
    }
    
    public boolean colonneRemplie(){
        for (int i=0;i<7;i++){
            if(grille[6][i]!= null){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
    public boolean placerdesintegrateur (int nb,int nb1){
        
    }
    
    public boolean placerTrouNoir (int nb,int nb1){
        
    }
    
    public boolean supprimerJeton(int nb, int nb1){
        
    }
    
    public Jeton reupererJeton (int grille, int nbjet){
        
    }
            
    
}
