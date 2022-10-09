package br.dio.desafio.dominio;
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

        System.out.println(curso1);
        System.out.println(curso2);
    }
}
