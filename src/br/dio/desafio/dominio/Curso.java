package br.dio.desafio.dominio;

public class Curso  extends Conteudo{
    private int cargaHoraria;

    @Override
    public double caucularXp() {
        // TODO Auto-generated method stub
        return 0;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso [titulo=" + super.getTitulo() + ", descricao=" + super.getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }
    


    
    
}
