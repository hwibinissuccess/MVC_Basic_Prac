package hwibin.prac.reflection_prac;

import hwibin.prac.reflection_prac.annotation.Controller;
import org.junit.jupiter.api.Test;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;



public class ReflectionTest {

    private static final Logger logger = LoggerFactory.getLogger(ReflectionTest.class);

    /**
     * @Controller 애노테이션이 설정되어 있는 모든 클래스 찾아 출력하기
     */

    @Test
    void controllerScan(){
        Reflections reflections = new Reflections("hwibin.prac.reflection_prac");

        Set<Class<?>> beans = new HashSet<>();
        beans.addAll(reflections.getTypesAnnotatedWith(Controller.class));

        logger.debug("beans: [{}]", beans);

    }

}
