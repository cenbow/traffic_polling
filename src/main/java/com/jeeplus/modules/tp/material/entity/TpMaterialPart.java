/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.jeeplus.modules.tp.material.entity;

import javax.validation.constraints.NotNull;

import com.jeeplus.core.persistence.DataEntity;
import com.jeeplus.common.utils.excel.annotation.ExcelField;

/**
 * 物料零件Entity
 * @author 尹彬
 * @version 2018-12-21
 */
public class TpMaterialPart extends DataEntity<TpMaterialPart> {
	
	private static final long serialVersionUID = 1L;
	private TpMaterial material;		// 物料表外建 父类
	private String name;		// 零件名称
	private String unit;		// 零件单位
	private Double price;		// 零件单价
	private String pic;		// 零件图片
	private String standards;		// 零件规格
	private Double beginPrice;		// 开始 零件单价
	private Double endPrice;		// 结束 零件单价
	
	public TpMaterialPart() {
		super();
	}

	public TpMaterialPart(String id){
		super(id);
	}

	public TpMaterialPart(TpMaterial material){
		this.material = material;
	}

	public TpMaterial getMaterial() {
		return material;
	}

	public void setMaterial(TpMaterial material) {
		this.material = material;
	}
	
	@ExcelField(title="零件名称", align=2, sort=7)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@ExcelField(title="零件单位", dictType="material_unit", align=2, sort=8)
	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@NotNull(message="零件单价不能为空")
	@ExcelField(title="零件单价", align=2, sort=9)
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@ExcelField(title="零件图片", align=2, sort=10)
	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
	
	@ExcelField(title="零件规格", align=2, sort=11)
	public String getStandards() {
		return standards;
	}

	public void setStandards(String standards) {
		this.standards = standards;
	}
	
	public Double getBeginPrice() {
		return beginPrice;
	}

	public void setBeginPrice(Double beginPrice) {
		this.beginPrice = beginPrice;
	}
	
	public Double getEndPrice() {
		return endPrice;
	}

	public void setEndPrice(Double endPrice) {
		this.endPrice = endPrice;
	}
		
}