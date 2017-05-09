package action;

import dao.InventoryDAO;


import util.InventoryDaoImpl;
import entity.Guitar;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SearchGuitar extends ActionSupport{
	private String serialNumber, builder, model, type, backWood, topWood;
	private double price;
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBackWood() {
		return backWood;
	}
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}
	public String getTopWood() {
		return topWood;
	}
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

public String search1(){
	
	InventoryDAO inventory = new InventoryDaoImpl();
	inventory.getAllGuitars();
	Guitar searchGuitar = new Guitar(getSerialNumber(),getPrice(),getBuilder(),getModel(),getType(),getBackWood(),getTopWood());
	Guitar guitar = inventory.searchGuitar(searchGuitar);
	
	if(guitar != null){
		ActionContext ctx = ActionContext.getContext();
		ctx.getApplication().put("guitar", guitar);
		return SUCCESS;
	}else{
		return ERROR;
	}
}
}