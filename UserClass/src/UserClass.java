import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserClass {
	String userId="1311713";
	String userPassword="a1311713";
	public UserClass() throws IOException{
		login();
	}
	public void login() throws IOException{
		System.out.print("ȸ������ ���̵� �Է����ּ���. \n>>>");
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader inputId = new BufferedReader(inputStreamReader);
		if(inputId.readLine().equals(userId)){
			System.out.print("ȸ������ �н����带 �Է����ּ���. \n>>>");
			BufferedReader inputPassword = new BufferedReader(inputStreamReader);
			if(inputPassword.readLine().equals(userPassword)){
				System.out.println(userId+"��, "+"ȯ���մϴ�.");
				userMain();
			}else{System.out.print("Ʋ�Ƚ��ϴ�.");login();}
		}else{System.out.print("Ʋ�Ƚ��ϴ�.");login();}
	}
	public void userMain() throws IOException{
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader inputNumber = new BufferedReader(inputStreamReader);
		while(true){
			System.out.println("���ϴ� �۾��� �Է��ϼ���.");
			System.out.println("1.Change id or password");
			System.out.println("2.PhoneBook");
			System.out.println("3.Schedule");
			System.out.println("4.Memo");
			System.out.println("0.Logout");
			System.out.print(">>>");
			switch(inputNumber.readLine()){
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				new MemoClass();
				break;
			case "0":
				System.out.println("�ȳ���������.");
				System.exit(0);
				break;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		UserClass user = new UserClass();
	}
}
class Memo {
	private String memoContent;
	private int memoNumber;
	private String memoDate;
	
	public Memo(String memoContent, int memoNumber, String memoDate) {
		this.memoContent = memoContent;
		this.memoNumber = memoNumber;
		this.memoDate = memoDate;
	}
}
class MemoClass {
	InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	
	public MemoClass() throws IOException {
		memoMain();
	}
	void memoMain() throws IOException {
		BufferedReader inputNumber = new BufferedReader(inputStreamReader);
		boolean managingMemo = true;
		while(managingMemo){
			System.out.println("���ϴ� �۾��� �Է��ϼ���.");
			System.out.println("1.Add Memo");
			System.out.println("2.View All Memo");
			System.out.println("3.Delete Memo");
			System.out.println("0.Quit");
			System.out.print(">>>");
			switch(inputNumber.readLine()){
			case "1":
				add();
				break;
			case "2":
				view();
				break;
			case "3":
				BufferedReader memoNumber = new BufferedReader(inputStreamReader);
				System.out.println("���� �޸� ��ȣ�� �Է��ϼ���.");
				System.out.print(">>>");
				int deleteNumber = Integer.parseInt(memoNumber.readLine());
				delete(deleteNumber);
				break;
			case "0":
				managingMemo = false;
				break;
			}
		}
	}
	void add() throws IOException {
	
	}
	void view() {
		
	}
	void delete(int memoNumber) {
		
	}
	void fileSave(Memo memo) {
		
	}
	void fileOpen(Memo memo) {
		
	}
}