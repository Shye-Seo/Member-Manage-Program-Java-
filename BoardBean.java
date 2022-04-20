package board;

import java.sql.Timestamp;

public class BoardBean {
	private String b_id; //�ۼ���id
	private String b_title; //������
	private String b_content; //�۳���
	private int b_dday; //���͵� ���� �Ⱓ
	private Timestamp b_startdate;
	private Timestamp b_finishdate;
	private int b_stmember; //���͵� �ο���
	private String b_interests; //���ɺо�
	private String b_goal; //���͵� ��ǥ
	private int b_status; //���͵� ��������
	private int b_step = 0; //����¡ ó��
	private int b_group = 0; //�׷��ȣ
	private int b_gmember = 0; //�׷� �� �ο���ȣ
	
	public static int pageSize = 10; //�� �������� 10�� ��¹�
	public static int pageCount = 1; //������ ���� ���� ����
	public static int pageNum = 1; //������ ��ȣ
	public static int listNum = 1; //�� ��ȣ
	
	public static String pageNumer(int limit) {
		String str="";
		int temp = (pageNum-1) % limit;
		int startPage = pageNum - temp;
		
		//[����] ���
		if ((startPage - limit) > 0) {
			str="<a href='list.jsp?pageNum="+(startPage-1)+"'>��</a>&nbsp;&nbsp;";
		}
		
		//������ ��ȣ �����ϱ�
		for (int i = startPage; i < (startPage+limit); i++) {
			if (i == pageNum) {
				str += "["+i+"]&nbsp;&nbsp;";
			} else {
				str += "<a href='list.jsp?pageNum="+i+"'>"+"["+i+"]</a>&nbsp;&nbsp;";
			}
			if(i >= pageCount) break;
		}
		//[����] ���
		if ((startPage + limit) <= pageCount) {
			str +="<a href='list.jsp?pageNum="+(startPage+limit)+"'>��</a>";
		}
		
		return str;
	}
	
	public String getB_id() {
		return b_id;
	}

	public void setB_id(String b_id) {
		this.b_id = b_id;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_content() {
		return b_content;
	}

	public void setB_content(String b_content) {
		this.b_content = b_content;
	}

	public int getB_dday() {
		return b_dday;
	}

	public void setB_dday(int b_dday) {
		this.b_dday = b_dday;
	}

	public Timestamp getB_startdate() {
		return b_startdate;
	}

	public void setB_startdate(Timestamp b_startdate) {
		this.b_startdate = b_startdate;
	}

	public Timestamp getB_finishdate() {
		return b_finishdate;
	}

	public void setB_finishdate(Timestamp b_finishdate) {
		this.b_finishdate = b_finishdate;
	}

	public int getB_stmember() {
		return b_stmember;
	}

	public void setB_stmember(int b_stmember) {
		this.b_stmember = b_stmember;
	}

	public String getB_interests() {
		return b_interests;
	}

	public void setB_interests(String b_interests) {
		this.b_interests = b_interests;
	}

	public String getB_goal() {
		return b_goal;
	}

	public void setB_goal(String b_goal) {
		this.b_goal = b_goal;
	}

	public int getB_status() {
		return b_status;
	}

	public void setB_status(int b_status) {
		this.b_status = b_status;
	}

	public int getB_step() {
		return b_step;
	}

	public void setB_step(int b_step) {
		this.b_step = b_step;
	}

	public int getB_group() {
		return b_group;
	}

	public void setB_group(int b_group) {
		this.b_group = b_group;
	}

	public int getB_gmember() {
		return b_gmember;
	}

	public void setB_gmember(int b_gmember) {
		this.b_gmember = b_gmember;
	}

}
