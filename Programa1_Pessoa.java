package atividades;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class Programa1_Pessoa{
    public static void main(String args[]) throws IOException {
    FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
    InputStreamReader input = new InputStreamReader(pastadoarquivo);
    private String nome;
    private int dataNascimento;
    private float altura;
    public void armazenaPessoa;
    public int CalcularIdade;

    public String getNome() {
        return (nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNascimento() {
        return (dataNascimento);
    }

    public void setNascimento(int nasc) {
        this.dataNascimento = dataNascimento;
    }


    public Float getAltura() {
        return (altura);
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public int CalcularIdade(){
        return (2022 - this.dataNascimento);
    }
}


class Agenda{
    private String nome;
    public int buscaPessoa;
    private float altura;
    private int index;
    public void armazenaPessoa;
    public void removePessoa;
    public void imprimeAgenda;
    public void imprimePessoa;


    public void armazenaPessoa(){
        System.out.println(this.nome);
        System.out.println(Float.toString(this.altura));
        System.out.println(String.valueOf(this.dataNascimento));
    }
    
    public void removePessoa(){
        removePessoa.remove(this.nome);
        return System.out.println("usuario removido")
    }
    
    public int buscaPessoa(){
        buscaPessoa.busca(this.nome);
        buscaPessoa.busca(this.altura);
        buscaPessoa.busca(this.dataNascimento);
    }

    public void imprimeAgenda(){
        System.out.println(this.nome);
        System.out.println(Float.toString(this.altura));
        System.out.println(String.valueOf(this.dataNascimento));
    }
    
    public void imprimePessoa(){
        System.out.println(this.nome + index);
    }



}







