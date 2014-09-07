/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tomás Abril
 */
public class Jogador {

	int numero;
	String nome;
	String posicao;

	Jogador(int numero, String nome, String posicao) {
		this.numero = numero;
		this.nome = nome;
		this.posicao = posicao;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public String getPosicao() {
		return posicao;
	}

	@Override
	public String toString() {
		return "(" + numero + ", " + nome + ", " + posicao + ")";
	}
}
