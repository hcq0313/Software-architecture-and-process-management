package dlmn.xfj.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import dlmn.xfj.entity.Unversity;
import dlmn.xfj.mapper.UnversityMapper;
import dlmn.xfj.service.UnversityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UnversityServiceImpl extends ServiceImpl<UnversityMapper, Unversity> implements UnversityService {

    @Autowired
    UnversityMapper um;
    @Override
    public Page<Unversity> findAll(int start) {
        Page<Unversity> page = new Page<>(start, 50);
        um.selectPage(page,new QueryWrapper<Unversity>());
        return page;
    }

    @Override
    public Page<Unversity> findAllByType(int start,String type) {
        Page<Unversity> page = new Page<>(start, 50);
         um.selectPage(page,new QueryWrapper<Unversity>().like("type",type));
        return page;
    }

    @Override
    public Page<Unversity> findAllByProvince(int start,String province) {
        Page<Unversity> page = new Page<>(start, 50);
         um.selectPage(page,new QueryWrapper<Unversity>().eq("province",province));
        return page;
    }

    @Override
    public Page<Unversity> findAllByProvinceVague(int start,String provinceVague) {
        Page<Unversity> page = new Page<>(start, 50);
         um.selectPage(page,new QueryWrapper<Unversity>().like("province",provinceVague));
        return page;
    }

    @Override
    public Page<Unversity> findAllByNameVague(int start,String nameVague) {
        Page<Unversity> page = new Page<>(start, 50);

         um.selectPage(page, new QueryWrapper<Unversity>().like("schoolname", nameVague));
        return page;
    }

    @Override
    public Page<Unversity> findPage(int start, int pageSize) {
        Page<Unversity> page = new Page<>(start, pageSize);
        um.selectPage(page,null);
        return page;
    }
}
