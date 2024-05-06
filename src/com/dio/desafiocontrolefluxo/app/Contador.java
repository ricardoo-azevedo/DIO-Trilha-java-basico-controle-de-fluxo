package com.dio.desafiocontrolefluxo.app;

import com.dio.desafiocontrolefluxo.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

/*<h1>Contador</h1>
 * 
 *<p>O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações e realizar a impressão no console dos números incrementados</p>
 * 
 * 
 * @author Ricardo Azevedo
 * @version 1.0
 * @since 06/05/2024
 */

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("Exceção: "+e.getMessage());
		}
		
	}
		static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
			//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
			if(parametroUm > parametroDois){
				throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro!");
			}else{
				int contagem = parametroDois - parametroUm;
				System.out.println(parametroDois+" - "+parametroUm+" = "+contagem);
				
				//realizar o for para imprimir os números com base na variável contagem
				for(int c = 0; c <= contagem; c++){
					if(c != 0){
						System.out.print("\n* "+c);
					}
					
				}
			}		
	}
}
