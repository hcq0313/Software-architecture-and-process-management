package dlmn.xfj.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import dlmn.xfj.entity.Unversity;
import dlmn.xfj.service.UnversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class UnversityController {

    @Autowired
    UnversityService us;

    @RequestMapping("/hcq/unversity")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Page<Unversity> findPage(String start){
        Integer integer = Integer.valueOf(start);
        Page<Unversity> pagelist = us.findPage(integer, 50);
        return pagelist;
    }

    @RequestMapping("/hcq/findNameUnversity")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Page<Unversity>  findAllByNameVague(String start,String searcherName){
        Integer integer = Integer.valueOf(start);
        Page<Unversity> allByNameVague = us.findAllByNameVague(integer,searcherName);

        return allByNameVague;
    }

    @RequestMapping("/hcq/findAllByType")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Page<Unversity>  findAllByType(String start,String type){
        Integer integer = Integer.valueOf(start);
        Page<Unversity> allByNameVague = us.findAllByType(integer,type);

        return allByNameVague;
    }

    @RequestMapping("/hcq/findAllByProvince")
    @ResponseBody
    @CrossOrigin(origins = "*")
    public Page<Unversity>   findAllByProvinceVague(String start,String province){
        Integer integer = Integer.valueOf(start);
        Page<Unversity>  allByNameVague = us.findAllByProvinceVague(integer,province);

        return allByNameVague;
    }
}

