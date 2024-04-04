//package org.wby.seckill.Generator;
//
//import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
//import com.baomidou.mybatisplus.core.toolkit.StringPool;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.InjectionConfig;
//import com.baomidou.mybatisplus.generator.config.*;
//import com.baomidou.mybatisplus.generator.config.po.TableInfo;
//import com.baomidou.mybatisplus.generator.config.rules.DateType;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
//import org.apache.commons.lang3.StringUtils;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class CodeGenerator {
//
//
//    public static void main(String[] args) {
//        // 代码生成器
//        AutoGenerator mpg = new AutoGenerator();
//
//        // 全局配置
//        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir");
//        gc.setOutputDir(projectPath + "/src/main/java");
//        gc.setAuthor("wby");
//        gc.setBaseResultMap(true);  // 开启baseResultMap
//        gc.setBaseColumnList(true); // 开启baseColumnList
//        gc.setOpen(false);
//        // gc.setSwagger2(true); 实体属性 Swagger2 注解
//        gc.setDateType(DateType.ONLY_DATE); // 设置日期格式
//        gc.setFileOverride(false);   // 设置文件是否覆盖
//        mpg.setGlobalConfig(gc);
//
//        // 数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setUrl("jdbc:mysql://localhost:3306/seckill?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai");
//        // dsc.setSchemaName("public");
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("root123456");
//        mpg.setDataSource(dsc);
//
//        // 包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setParent("org.wby.seckill");
//        pc.setController("controller");
//        pc.setEntity("pojo");
//        pc.setMapper("mapper");
//        pc.setService("service");
//        pc.setServiceImpl("service.impl");
//        mpg.setPackageInfo(pc);
//
//        // 自定义配置
//
//        InjectionConfig cfg = new InjectionConfig() {
//            @Override
//            public void initMap() {
//                // to do nothing
//            }
//        };
//        // 如果模板引擎是 freemarker
//        String templatePath = "/templates/mapper.xml.ftl";
//        // 自定义输出配置
//        List<FileOutConfig> focList = new ArrayList<>();
//        // 自定义配置会被优先输出
//        focList.add(new FileOutConfig(templatePath) {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
//                return projectPath + "/src/main/resources/mapper/" + pc.getModuleName()
//                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
//            }
//        });
//        cfg.setFileOutConfigList(focList);
//        mpg.setCfg(cfg);
//
//        // 模版配置
//        TemplateConfig templateConfig = new TemplateConfig();
//        templateConfig.setXml(null);
//        mpg.setTemplate(templateConfig);
//
//        // 策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setNaming(NamingStrategy.underline_to_camel);  // 数据库映射到实体的命名策略
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel); // 字段映射到属性的命名策略
//        strategy.setEntityLombokModel(true);
//        strategy.setControllerMappingHyphenStyle(true);
//        // 表前缀
//        strategy.setTablePrefix("t_");
//        mpg.setStrategy(strategy);
//        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
//        mpg.execute();
//
//    }
//}
