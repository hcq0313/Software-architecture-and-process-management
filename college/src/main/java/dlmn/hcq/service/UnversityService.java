package dlmn.hcq.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import dlmn.hcq.entity.Unversity;
import com.baomidou.mybatisplus.extension.service.IService;


public interface UnversityService extends IService<Unversity> {

    //查询全部
    public Page findAll(int start);
    //根据类型查询
    public Page findAllByType(int start,String type);
    //根据省份查询
    public Page findAllByProvince(int start,String province);
    //根据省份模糊查询
    public Page findAllByProvinceVague(int start,String provinceVague);
    //根据名字模糊查询
    public Page findAllByNameVague(int start,String NameVague);

    //分页查找
    public Page findPage(int start,int pageSize);
}
