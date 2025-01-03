package com.entity.view;

import com.entity.DiscusslvyoushujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 旅游数据评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-27 15:59:27
 */
@TableName("discusslvyoushuju")
public class DiscusslvyoushujuView  extends DiscusslvyoushujuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusslvyoushujuView(){
	}
 
 	public DiscusslvyoushujuView(DiscusslvyoushujuEntity discusslvyoushujuEntity){
 	try {
			BeanUtils.copyProperties(this, discusslvyoushujuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
