package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import controllers.Conecta;

public class Pedido {

	private static Conecta con;

	private int numero_pedido;
	private int cod_produto;
	private int cod_cliente;
	private int qt_produto;
	private String valor_total;
	private String forma_pagamento;
	private String valor_pago;
	private String valor_troco;
	private String previsao_entrega;
	private int cod_funcionario;
	private String nome_funcionario;
	private String nome_cliente;
	private String nome_produto;

	public Pedido(int numero_pedido, int cod_produto, int cod_cliente, int qt_produto, String valor_total,
			String forma_pagamento, String valor_pago, String valor_troco, String previsao_entrega, int cod_funcionario,
			String nome_funcionario, String nome_cliente, String nome_produto) {
		super();
		this.numero_pedido = numero_pedido;
		this.cod_produto = cod_produto;
		this.cod_cliente = cod_cliente;
		this.qt_produto = qt_produto;
		this.valor_total = valor_total;
		this.forma_pagamento = forma_pagamento;
		this.valor_pago = valor_pago;
		this.valor_troco = valor_troco;
		this.previsao_entrega = previsao_entrega;
		this.cod_funcionario = cod_funcionario;
		this.nome_funcionario = nome_funcionario;
		this.nome_cliente = nome_cliente;
		this.nome_produto = nome_produto;
	}

	public Pedido() {
	}

	public int getNumero_pedido() {
		return numero_pedido;
	}

	public void setNumero_pedido(int numero_pedido) {
		this.numero_pedido = numero_pedido;
	}

	public int getCod_produto() {
		return cod_produto;
	}

	public void setCod_produto(int cod_produto) {
		this.cod_produto = cod_produto;
	}

	public int getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(int cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public int getQt_produto() {
		return qt_produto;
	}

	public void setQt_produto(int qt_produto) {
		this.qt_produto = qt_produto;
	}

	public String getValor_total() {
		return valor_total;
	}

	public void setValor_total(String valor_total) {
		this.valor_total = valor_total;
	}

	public String getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}

	public String getValor_pago() {
		return valor_pago;
	}

	public void setValor_pago(String valor_pago) {
		this.valor_pago = valor_pago;
	}

	public String getValor_troco() {
		return valor_troco;
	}

	public void setValor_troco(String valor_troco) {
		this.valor_troco = valor_troco;
	}

	public String getPrevisao_entrega() {
		return previsao_entrega;
	}

	public void setPrevisao_entrega(String previsao_entrega) {
		this.previsao_entrega = previsao_entrega;
	}

	public int getCod_funcionario() {
		return cod_funcionario;
	}

	public void setCod_funcionario(int cod_funcionario) {
		this.cod_funcionario = cod_funcionario;
	}

	public String getNome_funcionario() {
		return nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public void inserepedido(String id, String tipo, int ano, int horas, String fabricante, String modelo, String data)
			throws Exception {

		con = new Conecta();
		Connection teste = con.getConecta();

		if (teste != null) {
			System.out.println("Conexão bem sucedida");
		} else {
			System.out.println("Não foi possível se conectar ao banco de dados");
		}

		PreparedStatement st = null;
		st = teste.prepareStatement("INSERT INTO TB_Pedido"
				+ "(numero_pedido, cod_produto, cod_cliente, qt_produto, valor_total, forma_pagamento, valor_pago, valor_troco, previsao_entrega, cod_funcionario, nome_funcionario, nome_cliente, nome_produto)" + "VALUES "
				+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);

		st.setInt(1, numero_pedido);
		st.setInt(2, cod_produto);
		st.setInt(3, cod_cliente);
		st.setInt(4, qt_produto);
		st.setString(5, valor_total);
		st.setString(6, forma_pagamento);
		st.setString(7, valor_pago);
		st.setString(8, valor_troco);
		st.setString(9, previsao_entrega);
		st.setInt(10, cod_funcionario);
		st.setString(11, nome_funcionario);
		st.setString(12, nome_cliente);
		st.setString(13, nome_produto);

		int linhas = st.executeUpdate();
		System.out.println(linhas);
		st.close();
		teste.close();

	}
}
