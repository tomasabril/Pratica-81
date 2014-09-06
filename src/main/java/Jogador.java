/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomas
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
// TODO: retona um String com as coordenadas do ponto no formato (x, y),
// por exemplo, (1,11, 2,22) para um ponto com coordenadas x = 1.11 e
// y = 2.22
		return "(" + numero + ", " + nome + ", " + posicao + ")";
	}
}
