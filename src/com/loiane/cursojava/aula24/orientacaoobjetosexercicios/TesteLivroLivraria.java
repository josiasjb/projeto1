package com.loiane.cursojava.aula24.orientacaoobjetosexercicios;

public class TesteLivroLivraria {

	public static void main(String[] args) {
		
		LivroLivraria livro = new LivroLivraria();

		livro.nome = "Um Curso Em Milagres";
		livro.autor = "Helen Schucman ";
		livro.anoLancamento = 2018;
		livro.qtdpaginas = 1454;
		livro.isbn = 1883360749;
		livro.pesoKg = 1.2;
		livro.preco = 160.00;
		
		System.out.println("Nome do livro = " + livro.nome);
		System.out.println("Autor do livro = " + livro.autor);
		System.out.println("Lançamento do livro = " + livro.anoLancamento);
		System.out.println("Quantidade de paginas = " + livro.qtdpaginas);
		System.out.println("ISBN = " + livro.isbn);
		System.out.println("Peso do livro = " + livro.pesoKg);
		System.out.println("Preço do livro = " + livro.preco);
		
	}

}

