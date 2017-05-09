package dao;

import java.util.List;



import entity.Guitar;

public interface InventoryDAO {

	//插入guitar数据
	public abstract boolean addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood);
	
	//更新guitar数据
	public abstract boolean updateGuitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood);
	
	//删除guitar数据
	public abstract boolean deleteGuitar(String serialNumber, double price, String builder, String model, String type, String backWood, String topWood);
	
	//取得guitar数据
	public abstract List<Guitar> getAllGuitars();
	
	//根据条件搜索guitar
	public abstract Guitar searchGuitar(Guitar searchGuitar);
}
