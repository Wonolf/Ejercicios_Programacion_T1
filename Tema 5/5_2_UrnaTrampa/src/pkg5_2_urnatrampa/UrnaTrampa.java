/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_2_urnatrampa;

/**
 *
 * @author Bonoso
 */
public class UrnaTrampa {
    private int bolaBlanca, bolaNegra;
    
    public UrnaTrampa(int bolaBl, int bolaNg){
        this.bolaBlanca = bolaBl;
        this.bolaNegra = bolaNg;
    }
    
    public void ExtraeBolas(){
        int prob;
    
        prob = (int) (Math.random() * 4) + 1;
            switch(prob){
                    //bola negra y bola negra
                    case 1: 
                          if (bolaNegra >= 2){
                             bolaNegra --;          //-2 bolas negras + 1 bola negra == -1 bola negra
                             this.Trampa();
                             this.Trampa();
                             break;
                          }
                      //bola negra y bola blanca
                     case 2:
                          if (bolaNegra >= 1 && bolaBlanca >= 1){
                             bolaNegra--;           //-1 bola negra y blanca + 1 bola blanca == -1 bola negra
                             this.Trampa();
                             this.Trampa();
                             break;
                          }
                       //bola blanca y bola negra
                    case 3:
                        if (bolaNegra >= 1 && bolaBlanca >= 1){
                             bolaNegra--;           //-1 bola negra y blanca + 1 bola blanca == -1 bola negra
                             this.Trampa();
                             this.Trampa();
                             break;
                        }
                    //bola blanca y bola blanca
                    case 4:
                        if (bolaBlanca >=2){
                             bolaBlanca -= 2;       //-2 bolas blancas + 1 bola negra
                             bolaNegra++;
                             this.Trampa();
                             this.Trampa();
                             break;
                        }
            }
            
            if (bolaBlanca == 0 && bolaNegra == 1){
                bolaNegra--;
                System.out.println("La última bola es negra.");
            }
            else if (bolaBlanca == 1 && bolaNegra == 0){
                bolaBlanca--;
                System.out.println("La última bola es blanca.");
            }
    }
    
    public int GetBolaBlanca(){
      return bolaBlanca;  
    }
    
    public int GetBolaNegra(){
      return bolaNegra;  
    }
    
    public void Trampa(){
        int probTrampa;
        int probBlnNgr;
        
        if (bolaNegra >= 1 && bolaBlanca >= 1){
            probTrampa = (int) (Math.random() * 500) + 1;       //0'2% = 1/500

            if (probTrampa == 500){
                System.out.println("¡Se ha hecho trampa!");
                probBlnNgr = (int) (Math.random() * 2) + 1;
                switch (probBlnNgr){
                    case 1:
                        bolaNegra--;
                        bolaBlanca++;
                        break;
                    case 2:
                        bolaNegra++;
                        bolaBlanca--;
                        break;
                }
            }
        }
    }
}

