package com.zyy.service.impl;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.zyy.bean.Items;
import com.zyy.dao.ItemDao;
import com.zyy.service.ItemService;
import com.zyy.utils.PicUtils;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao itemDao;
	@Override
	public List<Items> findItemsAll() {
		List<Items> list = itemDao.findItemsAll();
		return list;
	}
	@Override
	public Items findById(Integer id) {
		Items items =itemDao.findById(id);
		return items;
	}
	@Override
	public int updateitem(Items items,MultipartFile picFile) {
		items.setCreatetime(new Date());
		//将图片存入服务器
		
		//获取图片名称且改造名字
		String filename = PicUtils.getPicName(picFile.getOriginalFilename());
		//获取时间
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String time = format.format(new Date());
		File file = new File("S://updateimg/",time);
		if(!file.exists()) {
			file.mkdir();
		}
		try {
			picFile.transferTo(new File(file,filename));
			//S://updateimg/ 但是图片路径，用户不可能去我电脑的这个盘获取
			//所以修改为
			items.setPic("http://localhost/"+time+"/"+filename);
			//将路径存入数据库
			int i = itemDao.updateitem(items);
			return i;
			//正确上传就返回数字
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//错误就返回0
		return 0;
	}

}
