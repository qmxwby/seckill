package org.wby.seckill.Generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import com.baomidou.mybatisplus.generator.query.SQLQuery;

import java.util.Collections;

/**
 * 代码生成器-新
 */
public class CodeGeneratorNew {
    public static void main(String[] args) {
        // 数据库连接相关信息
        String url = "jdbc:mysql://localhost:3306/seckill?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai";
        String username = "root";
        String password = "root123456";
        String outputDir = System.getProperty("user.dir") + "src/main/java";
        String outputMapper = System.getProperty("user.dir") + "src/main/resources/mapper";

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {  //全局配置
                    builder.author("wby") // 设置作者
                            .enableSwagger() //开启swagger
                            .outputDir(outputDir)
                            .dateType(DateType.ONLY_DATE);
                })
                .dataSourceConfig(builder -> {  //数据源配置
                    builder.dbQuery(new MySqlQuery())
                            .schema("mybatis-plus")
                            .typeConvert(new MySqlTypeConvert())
                            .keyWordsHandler(new MySqlKeyWordsHandler())
                            .databaseQueryClass(SQLQuery.class);
                })
                .packageConfig(builder -> {     // 包配置
                    builder.parent("org.wby")
                            .moduleName("seckill")
                            .entity("pojo")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, outputMapper));
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_user")    // 生成几个表
                            .addTablePrefix("t_")
                            .serviceBuilder()   // service策略配置
                            .enableFileOverride()// 允许覆盖
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .entityBuilder()    // entity策略配置
                            .enableFileOverride()
                            .enableLombok()
                            .enableTableFieldAnnotation() //允许加上注解
                            .controllerBuilder()    // controller策略
                            .enableFileOverride()
                            .enableRestStyle()  //开启RestController
                            .mapperBuilder() //Mapper策略
                            .enableMapperAnnotation()
                            .enableFileOverride()
                            .formatXmlFileName("%sMapper");
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
