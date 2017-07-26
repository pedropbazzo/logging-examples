package shuaicj.example.logging.log4j2.ext;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

    private static final Logger logger = LoggerFactory.getLogger("defaultLogger");

    @Test
    public void log4j() throws Exception {
        logger.info("shuaicj.log.nothing");
    }
}
