package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanlixinxiEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 专利信息 服务类
 */
public interface ZhuanlixinxiService extends IService<ZhuanlixinxiEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}