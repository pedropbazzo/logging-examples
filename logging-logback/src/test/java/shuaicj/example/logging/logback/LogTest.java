package shuaicj.example.logging.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);

    @Test
    public void logback() throws Exception {
        logger.info("info in LogTest");
        logger.debug("debug in LogTest");
    }
}
