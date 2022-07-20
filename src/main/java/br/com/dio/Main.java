package br.com.dio;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(9);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descriação mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);


        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);


        Dev devPoliana = new Dev();
        devPoliana.setNome("Poliana Lima");
        devPoliana.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos Poliana" + devPoliana.getConteudosInscritos());
        devPoliana.progredir();
        devPoliana.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos Poliana" + devPoliana.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Poliana" + devPoliana.getConteudosConcluidos());
        System.out.println("XP:" + devPoliana.calcularTotalXP());

        System.out.println("**********************************************************");

        Dev devAndre = new Dev();
        devAndre.setNome("Andre Luiz da Silva Barboza");
        devAndre.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos Andre" + devAndre.getConteudosInscritos());
        devAndre.progredir();
        devAndre.progredir();
        devAndre.progredir();

        System.out.println("-");
        System.out.println("Conteudos Inscritos Andre" + devAndre.getConteudosInscritos());
        System.out.println("Conteudos concluidos Andre" + devAndre.getConteudosConcluidos());
        System.out.println("XP:" + devAndre.calcularTotalXP());


    }
}