package com.loiane.cursojava.aula24.orientacaoobjetosexercicios;

import java.util.Date;

public class TesteLivroDeBiblioteca {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();

		livro.nome = "Um Curso Em Milagres";
		livro.autor = "Helen Schucman ";
		livro.anoLancamento = 2018;
		livro.qtdpaginas = 1454;
		livro.isbn = 1883360749;
		livro.pesoKg = 1.2;
		livro.preco = 160.00;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Josias";
		
		System.out.println("Nome do livro = " + livro.nome);
		System.out.println("Autor do livro = " + livro.autor);
		System.out.println("Lançamento do livro = " + livro.anoLancamento);
		System.out.println("Quantidade de paginas = " + livro.qtdpaginas);
		System.out.println("ISBN = " + livro.isbn);
		System.out.println("Peso do livro = " + livro.pesoKg);
		System.out.println("Preço do livro = " + livro.preco);
		System.out.println("Emprestado = " + livro.emprestado);
		System.out.println("Data de entrega do livro = " + livro.dataEntrega);
		System.out.println("Emprestado para = " + livro.emprestadoA);
	}

}
