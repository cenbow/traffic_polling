/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.jeeplus.modules.tp.maintenance.entity;

import com.jeeplus.modules.tp.roadcross.entity.TpRoadCrossing;
import javax.validation.constraints.NotNull;
import com.jeeplus.modules.sys.entity.User;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.jeeplus.modules.sys.entity.Office;
import java.util.List;
import com.google.common.collect.Lists;

import com.jeeplus.core.persistence.DataEntity;
import com.jeeplus.common.utils.excel.annotation.ExcelField;

/**
 * 施工Entity
 * @author 尹彬
 * @version 2018-12-21
 */
public class TpMaintenance extends DataEntity<TpMaintenance> {
	
	private static final long serialVersionUID = 1L;
	private String num;		// 任务编号
	private String jobType;		// 任务类型
	private String source;		// 任务来源
	private TpRoadCrossing roadCrossing;		// 任务地点
	private String postion;		// 具体位置
	private User sendBy;		// 派单人
	private Date sendDate;		// 派单时间
	private Office office;		// 施工单位
	private Date jobBeginDate;		// 施工开始时间
	private Date jobEndDate;		// 施工结束时间
	private Double money;		// 总费用
	private String process;		// 施工过程
	private String prePic;		// 施工前照片
	private String middlePic;		// 施工中照片
	private String afterPic;		// 施工后照片
	private String approve;		// 审批意见
	private String status;		// 任务状态
	private Date beginSendDate;		// 开始 派单时间
	private Date endSendDate;		// 结束 派单时间
	private Date beginJobBeginDate;		// 开始 施工开始时间
	private Date endJobBeginDate;		// 结束 施工开始时间
	private Date beginJobEndDate;		// 开始 施工结束时间
	private Date endJobEndDate;		// 结束 施工结束时间
	private List<TpMaintenanceItem> tpMaintenanceItemList = Lists.newArrayList();		// 子表列表
	
	public TpMaintenance() {
		super();
	}

	public TpMaintenance(String id){
		super(id);
	}

	@ExcelField(title="任务编号", align=2, sort=7)
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	@ExcelField(title="任务类型", dictType="job_type", align=2, sort=8)
	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	
	@ExcelField(title="任务来源", dictType="job_source", align=2, sort=9)
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
	@NotNull(message="任务地点不能为空")
	@ExcelField(title="任务地点", fieldType=TpRoadCrossing.class, value="roadCrossing.name", align=2, sort=10)
	public TpRoadCrossing getRoadCrossing() {
		return roadCrossing;
	}

	public void setRoadCrossing(TpRoadCrossing roadCrossing) {
		this.roadCrossing = roadCrossing;
	}
	
	@ExcelField(title="具体位置", align=2, sort=11)
	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}
	
	@ExcelField(title="派单人", fieldType=User.class, value="sendBy.name", align=2, sort=12)
	public User getSendBy() {
		return sendBy;
	}

	public void setSendBy(User sendBy) {
		this.sendBy = sendBy;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ExcelField(title="派单时间", align=2, sort=13)
	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}
	
	@NotNull(message="施工单位不能为空")
	@ExcelField(title="施工单位", fieldType=Office.class, value="office.name", align=2, sort=14)
	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="施工开始时间不能为空")
	@ExcelField(title="施工开始时间", align=2, sort=15)
	public Date getJobBeginDate() {
		return jobBeginDate;
	}

	public void setJobBeginDate(Date jobBeginDate) {
		this.jobBeginDate = jobBeginDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="施工结束时间不能为空")
	@ExcelField(title="施工结束时间", align=2, sort=16)
	public Date getJobEndDate() {
		return jobEndDate;
	}

	public void setJobEndDate(Date jobEndDate) {
		this.jobEndDate = jobEndDate;
	}
	
	@ExcelField(title="总费用", align=2, sort=17)
	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
	
	@ExcelField(title="施工过程", align=2, sort=18)
	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}
	
	@ExcelField(title="施工前照片", align=2, sort=19)
	public String getPrePic() {
		return prePic;
	}

	public void setPrePic(String prePic) {
		this.prePic = prePic;
	}
	
	@ExcelField(title="施工中照片", align=2, sort=20)
	public String getMiddlePic() {
		return middlePic;
	}

	public void setMiddlePic(String middlePic) {
		this.middlePic = middlePic;
	}
	
	@ExcelField(title="施工后照片", align=2, sort=21)
	public String getAfterPic() {
		return afterPic;
	}

	public void setAfterPic(String afterPic) {
		this.afterPic = afterPic;
	}
	
	@ExcelField(title="审批意见", align=2, sort=22)
	public String getApprove() {
		return approve;
	}

	public void setApprove(String approve) {
		this.approve = approve;
	}
	
	@ExcelField(title="任务状态", dictType="job_status", align=2, sort=23)
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public Date getBeginSendDate() {
		return beginSendDate;
	}

	public void setBeginSendDate(Date beginSendDate) {
		this.beginSendDate = beginSendDate;
	}
	
	public Date getEndSendDate() {
		return endSendDate;
	}

	public void setEndSendDate(Date endSendDate) {
		this.endSendDate = endSendDate;
	}
		
	public Date getBeginJobBeginDate() {
		return beginJobBeginDate;
	}

	public void setBeginJobBeginDate(Date beginJobBeginDate) {
		this.beginJobBeginDate = beginJobBeginDate;
	}
	
	public Date getEndJobBeginDate() {
		return endJobBeginDate;
	}

	public void setEndJobBeginDate(Date endJobBeginDate) {
		this.endJobBeginDate = endJobBeginDate;
	}
		
	public Date getBeginJobEndDate() {
		return beginJobEndDate;
	}

	public void setBeginJobEndDate(Date beginJobEndDate) {
		this.beginJobEndDate = beginJobEndDate;
	}
	
	public Date getEndJobEndDate() {
		return endJobEndDate;
	}

	public void setEndJobEndDate(Date endJobEndDate) {
		this.endJobEndDate = endJobEndDate;
	}
		
	public List<TpMaintenanceItem> getTpMaintenanceItemList() {
		return tpMaintenanceItemList;
	}

	public void setTpMaintenanceItemList(List<TpMaintenanceItem> tpMaintenanceItemList) {
		this.tpMaintenanceItemList = tpMaintenanceItemList;
	}
}