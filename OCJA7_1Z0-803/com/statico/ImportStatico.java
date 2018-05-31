package com.statico;


/**
 * Escreva a descrição da classe TestaImporte aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class ImportStatico{
    
    public static int x = 1_0_1;//tem que levar em consideração casas decimais w os valores;
    public static String NOME = "Importando valore statico ";
  
    public ImportStatico(){
       
        x = 10;
    }

    public static int soma(int y){
         return x + y;
    }
}
