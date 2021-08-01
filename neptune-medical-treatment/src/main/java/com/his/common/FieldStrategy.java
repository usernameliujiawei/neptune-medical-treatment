package com.his.common;

/**
 * <p>
 * 字段策略枚举类
 * </p>
 * 使用方式：在实体类对应的字段上加注解@TableField(strategy=FieldStrategy.IGNORED)，忽略null值的判断
 * @author ljw
 * @since 2021/7/26 10:24
 */
public enum FieldStrategy {

    /**
     * 忽略判断
     */
    IGNORED,

    /**
     * 非NULL判断
     */
    NOT_NULL,

    /**
     * 非空判断
     */
    NOT_EMPTY

}
