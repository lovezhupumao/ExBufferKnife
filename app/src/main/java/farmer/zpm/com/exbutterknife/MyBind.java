package farmer.zpm.com.exbutterknife;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyBind {
    int value();//也可以为其他名称，但是为其他名称时候的用法为@MyBind（名称=“”）
}
