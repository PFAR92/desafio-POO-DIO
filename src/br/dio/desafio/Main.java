package br.dio.desafio;

import java.time.LocalDate;

import br.dio.desafio.dominio.Bootcamp;
import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Dev;
import br.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JS");
        curso2.setDescricao("descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devPaulo = new Dev();
        devPaulo.setNome("Paulo");
        System.out.println("Paulo");
        devPaulo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devPaulo.getConteudosInscritos());
        System.out.println("");
        devPaulo.progredir();
        devPaulo.progredir();
        System.out.println("Conteudos Inscritos " + devPaulo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devPaulo.getConteudosConcluidos());
        System.out.println("XP: " + devPaulo.calcularTotalXp());
        
        
        System.out.println("-------------------------------------------------------------------------------");
        
        Dev devDani = new Dev();
        devDani.setNome("Dani");
        System.out.println("Dani");
        devDani.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos " + devDani.getConteudosInscritos());
        System.out.println("");
        devDani.progredir();
        devDani.progredir();
        devDani.progredir();
        System.out.println("Conteudos Inscritos " + devDani.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + devDani.getConteudosConcluidos());
        System.out.println("XP: " + devDani.calcularTotalXp());
    }
}
