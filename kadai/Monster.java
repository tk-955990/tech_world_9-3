package kadai;

public class Monster {

	private String name;
	private int hp;
	private int at;
	private int df;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name=="null") {
			throw new IllegalArgumentException("���O��null�ł�");
		}if ((name.length()<3)||(name.length()>10)){
			throw new IllegalArgumentException("��������3�����ȏ�A�P�O�����ȉ��œ��͂��Ă�������");
		}
		this.name = name;
	}
	public int getHp() {
		
		return this.hp;
	}
	public void setHp(int hp) {
		if (hp<0){
			hp=0 ;
		}
		this.hp = hp;
	}
	public int getAt() {
		return this.at;
	}
	public void setAt(int at) {
		if (at<0){
			at=0 ;
		}
		this.at = at;
	}
	public int getDf() {
		return this.df;
	}
	public void setDf(int df) {
		if (df<0){
			df=0 ;
		}
		this.df = df;
	}


	void attack1() {
		System.out.println(this.name + "�̍U���I�I�I");
		System.out.println("�E�҂�"+this.at + "�|�C���g�̃_���[�W���󂯂�");
	}
	
	void attack2() {
		System.out.println(this.name + "�̍U���I�I�I");
		System.out.println("���@�g����"+this.at + "�|�C���g�̃_���[�W���󂯂�");
	}
	
	void defense() {
		System.out.println(this.name + "�͎����ł߂�");
		this.df = this.df + 10;
		System.out.println(this.name + "�̖h��͂��P�O�|�C���g�オ����");
	}
}
