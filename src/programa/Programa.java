package programa;
import entities.Funcionarios;
import services.Servicos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        Servicos servico = new Servicos();
        List<Funcionarios> lista = new ArrayList<>();
        String nome = null;
        double salario = 0.0;
        int idade = 0;
        String cami = "C:\\Users\\lksxi\\Documents\\ArqInformacao.txt";
        try(BufferedWriter br = new BufferedWriter(new FileWriter(cami))){

           String s = "s";
            while( s.equals("s")) {
                System.out.println("Nome do funcionário: ");
                nome = sc.next();
                br.write("Nome: " + nome + " ");

                System.out.println("Salário do funcionário: ");
                salario = sc.nextDouble();
                br.write("salário: " + salario + " ");

                System.out.println("Idade do funcionário: ");
                idade = sc.nextInt();
                br.write("Idade: " + idade + " ");
                br.newLine();

                System.out.println(" Gostaria de adiciona mais um funcionário? s ou n");
                s = sc.next();
                lista.add(new Funcionarios(nome, salario, idade));
            }
            BufferedReader brt = new BufferedReader(new FileReader(cami));
            String ler = brt.readLine();
            while( ler!= null){
                String[] fileds = ler.split(",");
                lista.add(new Funcionarios(fileds[0],Double.parseDouble(fileds[1]),Integer.parseInt(fileds[3])));
                brt.readLine();

            }

        }catch(Exception e){
            System.out.println(e.getStackTrace());
        }

        System.out.println("Maior salário é :" + servico.maxSalario(lista) );


    }
}
