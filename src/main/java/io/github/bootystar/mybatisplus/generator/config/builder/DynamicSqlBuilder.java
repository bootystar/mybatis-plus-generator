package io.github.bootystar.mybatisplus.generator.config.builder;

import io.github.bootystar.mybatisplus.enhancer.core.support.DynamicSqlService;
import io.github.bootystar.mybatisplus.enhancer.helper.SqlHelper;
import io.github.bootystar.mybatisplus.generator.info.ClassInfo;
import lombok.Getter;

/**
 * 动态sql生成器
 *
 * @author bootystar
 */
@Getter
public class DynamicSqlBuilder extends BaseEnhanceBuilder<DynamicSqlBuilder> {

    {
        selectDTO = new ClassInfo(SqlHelper.class);
        dynamicServiceClassInfo = new ClassInfo(DynamicSqlService.class);
//        mapperDTO = new ClassInfo(UnmodifiableSqlHelper.class);
    }

    @Override
    public DynamicSqlBuilder disableOverrideMethods() {
        return super.disableOverrideMethods();
    }

    @Override
    public DynamicSqlBuilder withMapSelectDTO() {
        return super.withMapSelectDTO();
    }

}


