package lance.daoutil.labels;

import java.io.IOException;

import org.apache.commons.digester3.Digester;
import org.xml.sax.SAXException;

/**
 * xml里的sql标签工具类
 * @author lance
 *
 */
public class SqlLabelFactory {

	public SqlLabelBean init() {
		
		Digester digester = new Digester();
		
		digester.setValidating(false);
		digester.addObjectCreate("sql-label", SqlLabelBean.class);
		
		digester.addObjectCreate("sql-label/select", SelectLabel.class);
		digester.addSetProperties("sql-label/select");
		digester.addCallMethod("sql-label/select/sql", "setSql",0);
		
		digester.addSetNext("sql-label/select", "addOne");
		
		SqlLabelBean bean = null;
		
		try {
			bean = (SqlLabelBean) digester.parse(SqlLabelFactory.class.getResource("/sql/mysql.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bean;
	}
	
}
