package com.his;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *
 * </p>
 *
 * @author
 * @since 2021/7/26 9:54
 */

@SpringBootApplication
public class HisApplication {

    private static final Logger logger = LoggerFactory.getLogger(HisApplication.class);

    public static void main(String[] args) {
        logger.info("\n\n" +
                "----------------------------------------------------------------\n" +
                "  " + " - S T A R T ...\n" +
                "----------------------------------------------------------------\n");
        SpringApplication.run(HisApplication.class, args);
        logger.info("\n\n" +
                "----------------------------------------------------------------\n" +
                "  " + " - S T A R T E D ! \n" +
                "----------------------------------------------------------------\n");
    }
}
