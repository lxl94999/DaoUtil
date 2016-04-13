package lance.daoutil;

import lance.daoutil.labels.SelectLabel;
import lance.daoutil.labels.SqlLabelFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		SqlLabelFactory factory = new SqlLabelFactory();

		for(SelectLabel select : factory.init().getSelectList()) {
			System.out.println(select.getId() + ","+select.getType()+","+select.getParam()+","+select.getSql());
		}
		
	}
}
