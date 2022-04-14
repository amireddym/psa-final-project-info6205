/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

import businesslogic.model.MenaceGame;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author manojreddy
 */
public class DB4OUtil {
    
    private static final Logger logger = LoggerFactory.getLogger(DB4OUtil.class);
    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }
    
    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }
    
        private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(MenaceGame.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeGameState(MenaceGame menaceGame) {
        ObjectContainer conn = createConnection();
        conn.store(menaceGame);
        conn.commit();
        conn.close();
    }
    
    public MenaceGame retrieveGameState(){
        
        ObjectContainer conn = createConnection();
        ObjectSet<MenaceGame> menaceGameStates = conn.query(MenaceGame.class);
        MenaceGame menaceGame;
        if (menaceGameStates.isEmpty()){
            logger.info("Not found any Pre-Trained states from DBo4");
            menaceGame = InitilaizeGame.initialize();
        }
        else{
            logger.info("Retreiving the Pre-Trained states from DBo4");
            menaceGame = menaceGameStates.get(menaceGameStates.size() - 1);
        }
        conn.close();
        return menaceGame;
    }
    
}
