/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saude;

import java.util.ArrayList;

/**
 *
 * @author 31686192
 */
public class ControladorSegurado {
    private Segurado segurado;
    
    public ControladorSegurado(){};
    
        public static void ImprimeSeguradosDePlano(PlanoDeSaude plano){
        for (Segurado s : plano.getSegurado()) {
            System.out.println("Nome:"+s.getNomeSegurado()+"\nCpf:"+s.getCpf()+"\n");
            
        }
    
    }
    public static void ImprimeSegurados(ArrayList<Segurado> segurados){
        for (Segurado s : segurados) {
            System.out.println("Nome:"+s.getNomeSegurado()+"\nCpf:"+s.getCpf()+"\nPlanos:");
            for (PlanoDeSaude p : s.getPlanos()) {
                System.out.println(p.getNomePlano());
            }
            
            
        }
    
    }
}
