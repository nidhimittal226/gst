package net.codejava;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
	@Id
	private Long product_code;
	private String product_name;
	private float product_price;
	private float product_gst;
	public Long getProduct_code() {
		return product_code;
	}
	public void setProduct_code(Long product_code) {
		this.product_code = product_code;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public float getProduct_price() {
		return product_price;
	}
	public void setProduct_price(float product_price) {
		this.product_price = product_price;
	}
	public float getProduct_gst() {
		return product_gst;
	}
	public void setProduct_gst(float product_gst) {
		this.product_gst = product_gst;
	}
	
}
