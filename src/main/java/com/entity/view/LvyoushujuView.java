package com.entity.view;

import com.entity.LvyoushujuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 旅游数据
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-04-27 15:59:27
 */
@TableName("lvyoushuju")
public class LvyoushujuView  extends LvyoushujuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LvyoushujuView(){
	}
 
 	public LvyoushujuView(LvyoushujuEntity lvyoushujuEntity){
 	try {
			BeanUtils.copyProperties(this, lvyoushujuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
