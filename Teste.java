/*
Nomes: Pedro C. Daspett (41506375)
Vinicius Henrique Reinaldo Sátiro(31686192)
*/
package saude;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Teste {
        
    public static String RecebeNome(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Entre com o nome do segurado");
        String nome = sc1.nextLine();
        return nome;
    }
    public static long RecebeCpf(){
        Scanner n = new Scanner(System.in);
        System.out.println("Entre com o Cpf do segurado");
        long cpf = n.nextLong();
        return cpf;
    }
    public static void ImprimeOperadora(ArrayList<Operadora> ops){
        System.out.println("Escolha um plano");
        int i = 1;
        int j = 1;
        for (Operadora op : ops) {
            
            for (PlanoDeSaude p : op.getPlanos()) {
                System.out.println(i+""+j+" "+op.getNomeOp()+" - "+p.getNomePlano());
                j++;
            }
            i++;
            j=1;
        }
    }
    public static int PegaOpcao2(){
        int opcao;
        Scanner sc2 = new Scanner(System.in);
        do{            
            System.out.println("Escolha sua opção");
            opcao = sc2.nextInt();
        }while((opcao<11||opcao>14)&&(opcao<21||opcao>24)&&(opcao<31||opcao>34));
        return opcao;
    }
    public static int NumeroSegurados(){
        Scanner scint = new Scanner(System.in);
        System.out.println("Entre com o número de segurados");
        return scint.nextInt();    
    }
    public static void Adiciona(String nome,long cpf,PlanoDeSaude plano,ArrayList<Segurado> segurados){
        Segurado s = new Segurado();
        boolean flag = false;
        for (Segurado segurado : segurados) {
            if(cpf==segurado.getCpf()){
                segurado.addPlano(plano);
                flag = true;                
            }
        }if(!flag){
        s.setNomeSegurado(nome);
        s.setCpf(cpf);
        s.setPlano(plano);
        segurados.add(s);        
        }           
    }
    public static PlanoDeSaude SelecionaPlano(int opcao, ArrayList<PlanoDeSaude> plans){       
        switch(opcao){
            case 11:
                System.out.println("Unimed Platina");
                for (PlanoDeSaude plan : plans) {
                    if (plan.getNumeroDeAutorizacao()==11){
                        return plan;                     
                    }
                }
                break;
            case 12:
                System.out.println("Unimed Ouro");
                for (PlanoDeSaude plan : plans) {
                    if (plan.getNumeroDeAutorizacao()==12){
                        return plan;                       
                    }
                }
                break;
            case 13:
                System.out.println("Unimed Prata");
                for (PlanoDeSaude plan : plans) {
                    if (plan.getNumeroDeAutorizacao()==13){
                        return plan;     
                    }
                }
                break;
            case 14:
                System.out.println("Unimed Bronze");
                for (PlanoDeSaude plan : plans) {
                    if (plan.getNumeroDeAutorizacao()==14){
                        return plan;     
                    }
                }
                break;
            case 21:
                System.out.println("SulAmérica Prestige");
                for (PlanoDeSaude plan : plans) {
                    if (plan.getNumeroDeAutorizacao()==21){
                        return plan;     
                    }
                }
                break;
            case 22:
                System.out.println("SulAmérica Executivo");
                for (PlanoDeSaude plan : plans) {
                    if (plan.getNumeroDeAutorizacao()==22){
                        return plan;     
                    }
                }
                break;
            case 23:
                System.out.println("SulAmérica Clássico");
                for (PlanoDeSaude plan : plans) {
                    if (plan.getNumeroDeAutorizacao()==23){
                        return plan;     
                    }
                }
                break;
            case 24:
                System.out.println("SulAmérica Exato");
                for (PlanoDeSaude plan : plans) {
                    if (plan.getNumeroDeAutorizacao()==24){
                        return plan;     
                    }
                }
                break;
            case 31:
                System.out.println("Amil Ameno");
                for (PlanoDeSaude plan : plans) {
                    if (plan.getNumeroDeAutorizacao()==31){
                        return plan;     
                    }
                }
                break;
            case 32:
                System.out.println("Amil Ameplan");
                for (PlanoDeSaude plan : plans) {
                    if (plan.getNumeroDeAutorizacao()==32){
                        return plan;     
                    }
                }
                break;
            case 33:
                System.out.println("Amil Dix");
                for (PlanoDeSaude plan : plans) {
                    if (plan.getNumeroDeAutorizacao()==33){
                        return plan;     
                    }
                }
                break;
            case 34:
                System.out.println("Amil Medial");
                for (PlanoDeSaude plan : plans) {
                    if (plan.getNumeroDeAutorizacao()==34){
                        return plan;     
                    }
                }
                break;
        }
        return null;
    }
    public static void ImprimeMenuPrincipal(){
        System.out.println("1 - Adicionar segurado");
        System.out.println("2 - Imprime segurados de um plano");
        System.out.println("3 - Imprime segurados do sistema");
        System.out.println("4 - Imprime procedimentos de um plano");
        System.out.println("5 - Alterar estado de uma autorização");
        System.out.println("0 - Sair");    
    }
    public static int PegaOpcao1(){
        int opcao;
        Scanner sc2 = new Scanner(System.in);
        do{
            System.out.println("Escolha sua opção");
            opcao = sc2.nextInt();
        }while(opcao>5 || opcao<0);
        return opcao;    
    }
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
    public static void ImprimeProcedimentos(PlanoDeSaude plano){
        System.out.println("Procedimentos:");
        for (Procedimento p : plano.getProcedimento()) {
            System.out.println(p.getNomeProc());            
        }    
    }
    public static void AlteraEstado(ArrayList<Autorizacao> autorizacoes){
            for (int i = 0; i < autorizacoes.size(); i++) {
                Autorizacao aut = autorizacoes.get(i);
                System.out.println(aut);            
        }     
    
    }
    public static int PegaOpcao3(){
        int opcao;
        Scanner sc2 = new Scanner(System.in);
            System.out.println("Escolha sua opção");
            opcao = sc2.nextInt();        
        return opcao;    
    }
    
    
    
    public static void main(String[] args) {
        
        ArrayList<Operadora> ops = new ArrayList<>();
        ArrayList<PlanoDeSaude> plans = new ArrayList<>();
        ArrayList<Autorizacao> autorizacoes = new ArrayList();
        
        Operadora Unimed = new Operadora("Unimed");
        ops.add(Unimed);
        PlanoDeSaude Platina = new PlanoDeSaude("Platina",11,Unimed);
        plans.add(Platina);
        PlanoDeSaude Ouro = new PlanoDeSaude("Ouro",12,Unimed);
        plans.add(Ouro);
        PlanoDeSaude Prata = new PlanoDeSaude("Prata",13,Unimed);
        plans.add(Prata);
        PlanoDeSaude Bronze = new PlanoDeSaude("Bronze",14,Unimed);
        plans.add(Bronze);
        
        Operadora Sulamerica = new Operadora("SulAmérica");
        ops.add(Sulamerica);
        PlanoDeSaude Prestige = new PlanoDeSaude("Prestige",21,Sulamerica);
        plans.add(Prestige);
        PlanoDeSaude Executivo = new PlanoDeSaude("Executivo",22,Sulamerica);
        plans.add(Executivo);
        PlanoDeSaude Classico = new PlanoDeSaude("Clássico",23,Sulamerica);
        plans.add(Classico);
        PlanoDeSaude Exato = new PlanoDeSaude("Exato",24,Sulamerica);
        plans.add(Exato);
        
        Operadora Amil = new Operadora("Amil");      
        ops.add(Amil);
        PlanoDeSaude Ameno = new PlanoDeSaude("Ameno",31,Amil);
        plans.add(Ameno);
        PlanoDeSaude Ameplan = new PlanoDeSaude("Ameplan",32,Amil);
        plans.add(Ameplan);
        PlanoDeSaude Dix = new PlanoDeSaude("Dix",33,Amil);
        plans.add(Dix);
        PlanoDeSaude Medial = new PlanoDeSaude("Medial",34,Amil);
        plans.add(Medial);
        
        ArrayList<Segurado> segurados = new ArrayList();
        int op1;
        
        
       
        Date data = new Date();
 
        ItemProcedimento itemInjecao = new ItemProcedimento(2);
        Ambulatorial p1 = new Ambulatorial(3,"Injeção",itemInjecao);        
        Platina.addProcedimento(p1);
        Ouro.addProcedimento(p1);
        Prata.addProcedimento(p1);
        Bronze.addProcedimento(p1);
        Prestige.addProcedimento(p1);
        Executivo.addProcedimento(p1);
        Ameplan.addProcedimento(p1);
        
        Clinica c1 = new Clinica("Doctor who",4234234L);
        Autorizacao a1 = new Autorizacao(data,c1);
        autorizacoes.add(a1);
        
        ItemProcedimento itemPonte = new ItemProcedimento(3);
        Cirurgico p2 = new Cirurgico(4,"Ponte de safena",itemPonte);
        Classico.addProcedimento(p2);
        Exato.addProcedimento(p2);
        Ameno.addProcedimento(p2);
        Ameplan.addProcedimento(p2);
        Dix.addProcedimento(p2);
        Medial.addProcedimento(p2);
        
        Hospital h1 = new Hospital(5,453534L);
        Autorizacao a2 = new Autorizacao(data,h1);
        autorizacoes.add(a2);
        
        do{
            ImprimeMenuPrincipal();
            op1 = PegaOpcao1();
            switch (op1){
                case 1:        
                    String nome = RecebeNome();
                    long cpf = RecebeCpf();
                    ImprimeOperadora(ops);
                    int op2 = PegaOpcao2();
                    PlanoDeSaude plano = SelecionaPlano(op2,plans);
                    Adiciona(nome,cpf,plano,segurados);
                    break;
                case 2:
                    ImprimeOperadora(ops);
                    op2 = PegaOpcao2();
                    plano = SelecionaPlano(op2,plans);
                    ImprimeSeguradosDePlano(plano);
                    break;
                case 3:
                    ImprimeSegurados(segurados);
                break;
                case 4:
                    ImprimeOperadora(ops);
                    op2 = PegaOpcao2();
                    plano = SelecionaPlano(op2,plans);
                    ImprimeProcedimentos(plano);
                break;
                case 5:
                    AlteraEstado(autorizacoes);
                    
                break;
        }
        }while(op1!=0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        for (Segurado s : Dix.getSegurado()) {
//                   
//        }
//            
//    }             
//        
//        for (PlanoDeSaude x : s.getPlanos()) {
//            System.out.println("Nome:"+x.getNomePlano());
//            
//        }
//        
//        switch(imprimeMenu1()){
//            case 1:
//                for (PlanoDeSaude p : Unimed.getPlanos()) {
//                    System.out.println(p.getNomePlano());                    
//                }
//            case 2:
//                for (PlanoDeSaude p : Sulamerica.getPlanos()) {
//                    System.out.println(p.getNomePlano());                    
//                }
//            case 3:
//                for (PlanoDeSaude p : Amil.getPlanos()) {
//                    System.out.println(p.getNomePlano());                    
//                }
//        
//        
//        }
//        
//        ListaProcedimento lInjecao = new ListaProcedimento(2);
//        Procedimento Injecao = new Procedimento("Injeção",lInjecao);
//        
//        Dix.setProcedimento(Injecao);
//        Injecao.getLista().getAutorizacao().autorizar();
////        
//        for (Procedimento p : Ameno.getProcedimento()) {
//            if(p==Injecao){
//                System.out.println("Procedimento disponível");
//                System.out.println(p.getLista().getAutorizacao().getStatus());
//            }else{
//                System.out.println("Procedimento indisponível");
//            }
//            
//        }
//        
        
//        Dix.addSegurado(s2);
//        Dix.addSegurado(s1);
//        System.out.println(Dix.getOperadora().getNomeOp());
//        System.out.println(Amil.getOperadora().getNomeOp());
//        
//        
//        for (Procedimento p : Dix.getProcedimento()) {
//            if(p.getLista().getDescricao()!=null){
//            System.out.println("Procedimento:"+p.getNomeProc()+"\nQuantidade:"+p.getLista().getQtd()+"\nDescrição:"+p.getLista().getDescricao());
//            }else{
//                System.out.println("Procedimento:"+p.getNomeProc()+"\nQuantidade:"+p.getLista().getQtd());
//            }
//            
//        }
//        
        
//        
//        for(Segurado s: Amil.getSegurado()){
//            System.out.println(s.getNomeSegurado()+"\n"+s.getCpf());
//
//        }
//        
//        for(PlanoDeSaude p: Allianz.getPlanos()){
//            System.out.println(p.getNomePlano());
//            for(Segurado s: p.getSegurado()){
//                System.out.println(s.getNomeSegurado    ());
//                System.out.println(s.getCpf());
//        }
//        }
        
        
        
       
//        System.out.println(Unimed);
        
        /*       
        Amil.addSegurado(s2);//Método que adiciona o segurado no array do plano de saúde
        Amil.addSegurado(s1);
        
        s1.addPlano(Unimed);//Método que adiciona o plano no array do segurado
        s2.addPlano(Amil);
        
        Unimed.addSegurado(s1);
        */
//        
//        System.out.println(Unimed);
//        System.out.println(s1);
//        
//        Autorizacao a1 = new Autorizacao();
//        System.out.println(a1.getStatus());
//        a1.autorizar();
//        System.out.println(a1.getStatus());
//        
    }
    
}
