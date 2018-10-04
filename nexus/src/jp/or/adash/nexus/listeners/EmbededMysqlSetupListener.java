package jp.or.adash.nexus.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dbdata.EmbededMySQLSetupper;

/**
 * EclipseのWTP + ローカルのTomcatで手軽に動作確認したいときに、コンテキスト起動時に
 * MySQLを一時的に組み込んで、初期データを設定するためのリスナ。
 * 
 *  Eclipse の Servers の中の使用したいサーバーランタイムの context.xml に
 *  ↓ 以下のリソースを追記 or 変更 してください。
 *  (別のマシンにデプロする場合は @WebListener アノテーションをコメントアウトして、
 *  　コンテキストリスナとして動作しないようにしておいてください)
 * 
 *     <Resource name="jdbc/nexus" auth="Container" type="javax.sql.DataSource"
 *              maxTotal="100" maxIdle="30" maxWaitMillis="10000"
 *              username="nexus_user" password="1234" driverClassName="com.mysql.cj.jdbc.Driver"
 *              url="jdbc:mysql://localhost:3306/nexus" />
 */
@WebListener
public class EmbededMysqlSetupListener implements ServletContextListener {

    private EmbededMySQLSetupper embededMySQLSetupper;
    
    /**
     * Default constructor. 
     */
    public EmbededMysqlSetupListener() {
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
        getEmbededMySQLSetupper().stopMySQL();
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
        EmbededMySQLSetupper ems = new EmbededMySQLSetupper();
        setEmbededMySQLSetupper(ems);
        
        ems.setupMySQL();
    }

    /**
     * @return the embededMySQLSetupper
     */
    public EmbededMySQLSetupper getEmbededMySQLSetupper() {
        return embededMySQLSetupper;
    }

    /**
     * @param embededMySQLSetupper the embededMySQLSetupper to set
     */
    public void setEmbededMySQLSetupper(EmbededMySQLSetupper embededMySQLSetupper) {
        this.embededMySQLSetupper = embededMySQLSetupper;
    }	
}
