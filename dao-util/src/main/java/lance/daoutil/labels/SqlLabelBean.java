package lance.daoutil.labels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlLabelBean {

	private Map<String,SelectLabel> select = new HashMap<String,SelectLabel>();

	private List<SelectLabel> selectList = new ArrayList<SelectLabel>();
	
	public Map<String, SelectLabel> getSelect() {
		return select;
	}

	public void setSelect(Map<String, SelectLabel> select) {
		this.select = select;
	}

	public List<SelectLabel> getSelectList() {
		return selectList;
	}

	public void setSelectList(List<SelectLabel> selectList) {
		this.selectList = selectList;
	}
	
	public void addOne(SelectLabel selectLabel) {
		this.selectList.add(selectLabel);
	}
	
}
