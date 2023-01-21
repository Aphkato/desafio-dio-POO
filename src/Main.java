import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devAbigail = new Dev();
        devAbigail.setNome("Abigail");
        devAbigail.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Abigail:" + devAbigail.getConteudosInscritos());
        devAbigail.progredir();
        devAbigail.progredir();
        devAbigail.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos a Concluir Abigail:" + devAbigail.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Abigail:" + devAbigail.getConteudosConcluidos());
        System.out.println("XP:" + devAbigail.calcularTotalXp());

        System.out.println("-------------------------------------------------");

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos José:" + devJose.getConteudosInscritos());
        devJose.progredir();
        devJose.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos a Concluir José:" + devJose.getConteudosInscritos());
        System.out.println("Conteudos Concluidos José:" + devJose.getConteudosConcluidos());
        System.out.println("XP:" + devJose.calcularTotalXp());


        }


    }


