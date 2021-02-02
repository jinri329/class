package com.zyy.service;

import java.util.List;
import com.zyy.bean.TbItemParamGroup;
import com.zyy.bean.TbItemParamKey;

public interface ItemService {
	TbItemParamKey findParamKeyById(Integer groupId);
}
