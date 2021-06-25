package dlmn.xfj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import dlmn.xfj.entity.Unversity;
import dlmn.xfj.mapper.UnversityMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class UniversityApplicationTests {

    @Autowired
    private  UnversityMapper unversityMapper;

    @Test
    void contextLoads() {

//代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        //获取当前项目的路径
        String projectPath = System.getProperty("user.dir");
        //设置输出路径
        gc.setOutputDir(projectPath+"/src/main/java");
        //设置作者
        gc.setAuthor("wkx");
        //打开资源管理器，就是文件夹
        gc.setOpen(false);
        //是否覆盖原来生成的文件包
        gc.setFileOverride(false);
        //设置service的前缀
        gc.setServiceName("%sService");
        //设置Id的类型uuid,自增，全球唯一,uuid等
        gc.setIdType(IdType.ASSIGN_UUID);
        //设置日期的类型
        gc.setDateType(DateType.ONLY_DATE);
        /*这个看下什么意思和作用*/
        gc.setSwagger2(true);
        mpg.setGlobalConfig(gc);

        //设置数据源
        //1.数据源的类
        DataSourceConfig dsc = new DataSourceConfig();
        //2.路径
        dsc.setUrl("jdbc:mysql://localhost:3306/schools?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=Asia/Shanghai");
        //3.驱动名字
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        //4.用户名
        dsc.setUsername("root");
        //5.用户密码
        dsc.setPassword("123456");

        mpg.setDataSource(dsc);

        //包的配置
        PackageConfig pc = new PackageConfig();
        //次级目录
        pc.setModuleName("wkx");
        //最大包
        pc.setParent("com.dlmn");
        pc.setController("controller");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");

        mpg.setPackageInfo(pc);

        //策略的配置
        StrategyConfig strategy = new StrategyConfig();
        //数据库中表名采用驼峰命名法
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //数据库中字段命名采用驼峰命名法
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //要映射的表名可以是多个
        strategy.setInclude("university");
        strategy.setEntityLombokModel(true);
        //设置逻辑删除字段
        /* strategy.setLogicDeleteFieldName("deleted");*/
        //设置自动填充
        /*ArrayList<TableFill> tableFills = new ArrayList<TableFill>();
        TableFill tableFill = new TableFill("", FieldFill.INSERT);
        TableFill tableFill1 = new TableFill("", FieldFill.INSERT_UPDATE);
        tableFills.add(tableFill);
        tableFills.add(tableFill1);
        strategy.setTableFillList(tableFills);*/
        //设置乐观锁
        /*strategy.setVersionFieldName("version");*/
        //开启驼峰命名
        strategy.setRestControllerStyle(true);
        //执行
        mpg.execute();
    }

    @Test
     void test(){

        List<Integer> idList = new ArrayList<>();
        idList.add(1);
        idList.add(2);
        idList.add(3);
        //List<Unversity> unversities = unversityMapper.selectBatchIds(idList);

        //查询全部的数据
        //List<Unversity> university = unversityMapper.selectList(new QueryWrapper<Unversity>());

        //按省份查找
        //List<Unversity> university = unversityMapper.selectList(new QueryWrapper<Unversity>().eq("province","安徽省"));
        //按照类型查找985,211，一流大学
        List<Unversity> university = unversityMapper.selectList(new QueryWrapper<Unversity>().like("type", "一流大学"));
        university.forEach(System.out::println);

        Page<Unversity> page = new Page<>(3, 50);
        unversityMapper.selectPage(page,null);
        page.getRecords().forEach(System.out::println);
    }

}
