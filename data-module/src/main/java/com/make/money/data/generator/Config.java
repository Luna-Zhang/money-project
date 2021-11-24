package com.make.money.data.generator;

import com.baomidou.mybatisplus.annotation.IdType;

/**
 * @Describe：
 * @Author：luna
 * @Date：2021/11/19:20:02
 */
public class Config {
    /**
     * 作者
     */
    public static final String AUTHOR = "luna";

    /////////////////////////////////////////////路径相关///////////////////////////////////////////////////////////
    /**
     * controller,service,mapper,serviceImpl输出路径
     */
    public static final String OUT_OUT_DIR = "E:/workspace/qianduoduo_workspace/money-project/data-module/src/main/java";

    /**
     * xml文件输出路径
     */
    public static final String XML_PATH = "/com/make/money/data/xml";

    /**
     * dto输出路径
     */
    public static final String DTO_PATH = "/com/make/money/data/dto";

    /**
     * qo输出路径
     */
    public static final String QO_PATH = "/com/make/money/data/qo";

    /**
     * vo输出路径
     */
    public static final String VO_PATH = "/com/make/money/data/vo";

    /////////////////////////////////////////////包名相关///////////////////////////////////////////////////////////
    /**
     * controller包名
     */
    public static final String BASE_PACK = "com.make.money.data";

    /**
     * controller包名
     */
    public static final String PACKAGE_NAME_CONTROLLER = "com.make.money.data.controller";

    /**
     * 包名：entity
     */
    public static final String PACKAGE_NAME_ENTITY = "com.make.money.data.entity";


    /**
     * 包名：mapper
     */
    public static final String PACKAGE_NAME_MAPPER = "com.make.money.data.mapper";

    /**
     * 包名：service
     */
    public static final String PACKAGE_NAME_SERVICE = "com.make.money.data.service";

    /**
     * 包名：service.impl
     */
    public static final String PACKAGE_NAME_SERVICE_IMPL = "com.make.money.data.service.impl";

    /**
     * 包名：mapper.xml
     */
    public static final String PACKAGE_NAME_MAPPER_XML = "com.make.money.data.xml";

    /**
     * 包名：dto
     */
    public static final String PACKAGE_NAME_DTO = "com.make.money.data.dto";


    /**
     * 包名：qo
     */
    public static final String PACKAGE_NAME_QO = "com.make.money.data.qo";

    /**
     * 包名：vo
     */
    public static final String PACKAGE_NAME_VO = "com.make.money.data.vo";

    /////////////////////////////////////////////类名相关///////////////////////////////////////////////////////////
    /**
     * Entity文件名称
     */
    public static final String FILE_NAME_ENTITY = "%s";

    /**
     * mapper文件名称
     */
    public static final String FILE_NAME_MAPPER = "%sMapper";

    /**
     * 数据库xml文件名称
     */
    public static final String FILE_NAME_XML = "%sMapper";

    /**
     * Service文件名称
     */
    public static final String FILE_NAME_SERVICE = "%sService";

    /**
     * Service实现类文件名称
     */
    public static final String FILE_NAME_SERVICE_IMPL = "%sServiceImpl";

    /**
     * Controller文件名称
     */
    public static final String FILE_NAME_CONTROLLER = "%sController";

    /////////////////////////////////////////////模版文件配置///////////////////////////////////////////////////////////
    /**
     * controller模版地址
     */
    public static final String CONTROLLER_TEMPLATE = "/templates/myController.java.vm";


    /**
     * service模版地址
     */
    public static final String SERVICE_TEMPLATE = "/templates/myService.java.vm";

    /**
     * serviceImpl模版地址
     */
    public static final String SERVICE_IMPL_TEMPLATE = "/templates/myServiceImpl.java.vm";

    /**
     * mapper模版地址
     */
    public static final String MAPPER_TEMPLATE = "/templates/myMapper.java.vm";


    /**
     * xml模版地址
     */
    public static final String XML_TEMPLATE = "/templates/myMapper.xml.vm";

    /**
     * entity模版地址
     */
    public static final String ENTITY_TEMPLATE = "/templates/myEntity.java.vm";
    /**
     * VO模版地址
     */
    public static final String VO_TEMPLATE = "/templates/myEntity.vo.java.vm";


    /**
     * QO模版地址
     */
    public static final String QO_TEMPLATE = "/templates/entity.qo.java.vm";


    /**
     * DTO模版地址
     */
    public static final String DTO_TEMPLATE = "/templates/myEntity.dto.java.vm";
    /////////////////////////////////////////////其他配置///////////////////////////////////////////////////////////
    /**
     * controller公共父类[空串无效]
     */
    public static final String SUPER_CONTROLLER_CLASS = "";

    /**
     * 逻辑删除字段[空串无效]
     */
    public static final String FIELD_LOGIC_DELETE_NAME = "IS_VALID";

    /**
     * 添加自动填充[空串无效]
     */
    public static final String CREATE_FILL = "CREATE_AT,CREATE_BY,IS_VALID";

    /**
     * 编辑自动填充[空串无效]
     */
    public static final String UPDATE_FILL = "UPDATE_AT,UPDATE_BY";

    /**
     * 是否支持Swagger
     */
    public static final Boolean SWAGGER_SUPPORT = true;


    /**
     * 是否覆盖已有文件
     */
    public static final Boolean FILE_OVERRIDE = true;

    /**
     * entity是否支持lombok
     */
    public static final Boolean ENTITY_LOMBOK_SUPPORT = true;


    /**
     * 是否为RestController
     */
    public static final Boolean IS_REST_CONTROLLER = true;

    /**
     * entity主键类型
     */
    public static final IdType ENTITY_ID_TYPE = IdType.ASSIGN_UUID;
}
