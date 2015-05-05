
import java.io.File;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mateus
 */
public class main {

    /**
     * @param args the command line arguments
     
   */
      public static void gerarLexer(String path){
        File file = new File(path);
        JFlex.Main.generate(file);
        
    }
      
    public static void main(String[] args) {
        String path = "C:/Users/Mateus/Documents/Facul/6º Periodo/Automatos/AnalisadorLexicoJflex/src/classFlex.flex";
        gerarLexer(path);
        
     
        
    }
    
    
}
