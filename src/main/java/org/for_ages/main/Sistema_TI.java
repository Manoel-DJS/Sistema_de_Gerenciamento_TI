package org.for_ages.main;

import org.for_ages.models.Chamado;

import java.util.*;

public class Sistema_TI {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Chamado> chamados;
    private static Map <Chamado, Integer> carrinhos;

    public static void main(String[] args) {
        chamados = new ArrayList<>();
        carrinhos = new HashMap<>();

        menuServico();

    }

    private static void menuServico(){
        System.out.println("----------------------------------------------------------");
        System.out.println("------------BEM VINDO AO SISTEMA DE CHAMADA TI------------");
        System.out.println("----------------------------------------------------------");
        System.out.println("----- ** Selecione o Serviço que Deseja Realizar *** -----");
        System.out.println("----------------------------------------------------------");
        System.out.println("|   Opção 1 - Cadastrar Chamada de Serviço   |");
        System.out.println("|   Opção 2 - Listar Chamadas de Serviço     |");
        System.out.println("|   Opção 3 - Atualizar Chamadas de Serviço  |");
        System.out.println("|   Opção 4 - Remover Ordem de Serviço       |");
        System.out.println("|   Opção 5 -               (())             |");
        System.out.println("|   Opção 10 - Em Obras                      |");

        int option = input.nextInt();

        switch (option){
            case 1:
                cadastrarChamada();
                break;
            case 2:
                listarChamada();
                break;
            case 3:
                updateChamada();
                break;
            case 4:
                removeChamada();
            case 5:
                System.out.println("Obrigado pela requisição do serviço, " +
                        "agora nossos funcionários irão realizar o trabalho.");
            default:
                System.out.println("Tem não no cardápio!");
                menuServico();
                break;
        }
    }
    // oto metodo
    private static void cadastrarChamada(){
        System.out.println("Digite o serviço que deseja: ");
        String nomeChamada = input.next();

        System.out.println("Digite o nível de Urgencia da chamada/ordem de serviço: ");
        String nivelUrgencia = input.next();

        Chamado novoChamado = new Chamado(nomeChamada, nivelUrgencia);
        chamados.add(novoChamado);

        System.out.println(novoChamado.getChamadaProblema() + " Chamada Cadastrada!");
        menuServico();
    }

    private static void listarChamada(){
        if (chamados.size() > 0) {
            System.out.println("Lista de Chamadas! \n");

            for (Chamado n: chamados ){
                System.out.println(n);
            }
            System.out.println("\n");
        } else {
          System.out.println("Sem chamadas Listadas! \n");
        }
        menuServico();
    }

    private static void updateChamada(){
        if(chamados.size() > 0){
            int tamanhoArray = chamados.size();

            System.out.println("Quantidade de objetos no array: " + tamanhoArray);
            System.out.println("");

            System.out.println("Digite o que ID que deseja alterar do array...(começa de zero tonto)");
            int update = input.nextInt();

            System.out.println("Digite a alteração do serviço: ");
            String trocarChamado = input.next();

            System.out.println("Digite o nivel de urgencia desse novo serviço: ");
            String trocarNivelChamado = input.next();

            chamados.set(update, new Chamado(trocarChamado, trocarNivelChamado));
            System.out.println("Alteração Efetuada com Sucesso");
            System.out.println("ID Atualizado \n");

        } else{
            System.out.println("Não é possível alterar pois não existem chamadas! \n");
        }
        menuServico();
    }

    private static void removeChamada(){
        if(chamados.size() > 0){
            int tamanhoArray = chamados.size();
            System.out.println("Quantidade de objetos no array: " + tamanhoArray + "\n");

            System.out.println("Digite a posição da chamada que deseja excluir do array...(começa de zero tonto)!: ");
            int remover = input.nextInt();
            chamados.remove(remover);
        } else{
            System.out.println("Não é possível remover pois não existem chamadas! \n");
        }
        menuServico();
    }


    // https://www.youtube.com/watch?v=zVIowfVcT3M minuto 24
}