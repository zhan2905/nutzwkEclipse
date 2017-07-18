package cn.wizzer.modules.models.customer;

import cn.wizzer.common.base.Model;
import org.nutz.dao.entity.annotation.*;

import java.io.Serializable;
/**
* @author memory
* @time   2017-04-11 22:32:41
*/
@Table("customer_filter_segment")
public class CustomerFilterSegment extends Model implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column
	@Name
	@Prev(els = {@EL("uuid()")})
	private String id;
	@Column
	private String numberSegment;
	@Column
	private String src;
	@Column
	private String remark;
		public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public String getNumberSegment()
	{
		return numberSegment;
	}
	public void setNumberSegment(String numberSegment)
	{
		this.numberSegment=numberSegment;
	}
	public String getSrc()
	{
		return src;
	}
	public void setSrc(String src)
	{
		this.src=src;
	}
	public String getRemark()
	{
		return remark;
	}
	public void setRemark(String remark)
	{
		this.remark=remark;
	}

}