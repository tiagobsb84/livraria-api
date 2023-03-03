package br.com.tiago.livaria.resource.exceptions;

public class StandarError {

	private Long timestamp;
	private Integer status;
	private String erro;

	public StandarError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StandarError(Long timestamp, Integer status, String erro) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.erro = erro;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

}
