package dbdata;

import static com.wix.mysql.EmbeddedMysql.anEmbeddedMysql;
import static com.wix.mysql.ScriptResolver.classPathScript;
import static com.wix.mysql.ScriptResolver.classPathScripts;
import static com.wix.mysql.config.MysqldConfig.aMysqldConfig;
import static com.wix.mysql.distribution.Version.v5_7_19;

import java.util.ArrayList;
import java.util.List;

import com.wix.mysql.EmbeddedMysql;
import com.wix.mysql.SqlScriptSource;
import com.wix.mysql.config.Charset;
import com.wix.mysql.config.MysqldConfig;

/**
 * Hello world!
 *
 */
public class EmbededMySQLSetupper {
    
    private static final String USER_ANME = "nexus_user";
    private static final String USER_PASSWORD = "1234";
    
    private EmbeddedMysql mysqld;

    public EmbededMySQLSetupper() {
    }
    
    public void setupMySQL() {
        MysqldConfig config = aMysqldConfig(v5_7_19)
                .withPort(3306)
                .withTimeZone("+09:00")
                .withUser(USER_ANME, USER_PASSWORD)
                .withCharset(Charset.UTF8MB4)
                .build();

        List<SqlScriptSource> sqlList = new ArrayList<>();
        sqlList.add(classPathScript("dbdata/schema.sql"));
        sqlList.add(classPathScript("dbdata/staff.sql"));
        sqlList.addAll(classPathScripts("dbdata/*_master.sql"));

        this.mysqld = anEmbeddedMysql(config)
                .addSchema("nexus", sqlList)
                .start();
        
    }

    public void stopMySQL() {
        this.mysqld.stop();
    }
}
