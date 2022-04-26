/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.core.FileAppender;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import java.util.logging.Level;
import org.slf4j.LoggerFactory;

/**
 *
 * @author manojreddy
 */
public class LoggerUtils {
    
    public static Logger getLogger(String className) {
        
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        JoranConfigurator jc = new JoranConfigurator();
        jc.setContext(context);
        context.reset();

        context.putProperty("application-name", "MENACE");
        try {
            jc.doConfigure("log.xml");
        } catch (JoranException ex) {
            java.util.logging.Logger.getLogger(LoggerUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return context.getLogger(className);
    }

}
