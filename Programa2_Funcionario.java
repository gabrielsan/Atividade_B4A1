package atividades;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Programa2_Funcionario{
    public static void main(String args[]) throws IOException {
    FileInputStream pastadoarquivo = new FileInputStream("C:\\Users\\Mariza\\Desktop\\Testes\\Inputs.txt");
    InputStreamReader input = new InputStreamReader(pastadoarquivo);
    private String nome, data;
    private double salario;

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario(double salario)
    {
        this.salario = salario;
    }
}


public class Departamento{
    private String nome;
    private Funcionario[] funcionarios = new Funcionario[100];

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Funcionario[] getFuncionarios()
    {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios)
    {
        this.funcionarios = funcionarios;
    }
}

public class Empresa
{
    private String nome, cnpj;
    private Departamento departamentos[] = new Departamento[10];

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }

    public Departamento[] getDepartamentos()
    {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos)
    {
        this.departamentos = departamentos;
    }
}