package com.ldy;

import com.ldy.web.UserInfoController;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *  starter
 *
 * @author anyone
 * @since Wed Dec 02 16:27:44 CST 2020
 */
@SpringBootApplication
@EnableSwagger2
@EnableFeignClients
@Slf4j
public class ApplicationRunner {


    public static void main(String[] args) {
        Logger logger= LoggerFactory.getLogger(UserInfoController.class);
        logger.info("dsfdddddddddddddddddeed");
        Log log1 = LogFactory.getLog(UserInfoController.class);
        log.info("asdgfth");
        log1.info("ddddddddd");
        SpringApplication.run(ApplicationRunner.class, args);

        log.info("11111111");
        log1.info("2222222222");
    }
}
