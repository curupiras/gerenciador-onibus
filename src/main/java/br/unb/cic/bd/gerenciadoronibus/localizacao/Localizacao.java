package br.unb.cic.bd.gerenciadoronibus.localizacao;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Localizacao {

	//Data e horário do registro da localização do veículo.
	@JsonProperty("DATAHORA")
	private String dataHora;
	
	//Número do veículo na Empresa Operadora.
	@JsonProperty("ORDEM")
	private int ordem;
	
	//Linha operada.
	@JsonProperty("LINHA")
	private int linha;
	
	//Posição latitudinal de acordo com o Sistema de coordenadas WGS 84.
	@JsonProperty("LATITUDE")
	private double latitude;
	
	//Posição longitudinal de acordo com o Sistema de coordenadas WGS 84.
	@JsonProperty("LONGITUDE")
	private double longitude;
	
	//Velocidade do veículo em quilômetros por hora.
	@JsonProperty("VELOCIDADE")
	private float velocidade;

	public String getDataHora() {
		return dataHora;
	}

	public void setDataHora(String dataHora) {
		this.dataHora = dataHora;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

}
