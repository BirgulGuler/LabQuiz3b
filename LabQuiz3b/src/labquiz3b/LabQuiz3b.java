/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz3b;

/**
 *
 * @author Mehmet Sait
 */
public class LabQuiz3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dizi={1,7,6,9,5};
        int evirmeSayac=0;
        for (int a=0;a<dizi.length;a++)
        {
            for(int b=a+1;b<dizi.length;b++)
            {
                if (dizi[a]>dizi[b]) evirmeSayac++;// a<b iken dizi[a]>dizi[b] olduğu durum sayısı bulunur
            }
        }
        System.out.println("Evirme değeri="+evirmeSayac);
    }
    
}
