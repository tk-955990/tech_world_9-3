package kadai;

public class Hero {

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


	
	
    
	void attack() {
		System.out.println(this.name + "�̍U���I�I");
		System.out.println("������" + this.at + "�|�C���g�̃_���[�W��^�����I�I");
	}

	void defense() {
		System.out.println(this.name + "�͐g�������");
		this.df = this.df + 10;
		System.out.println("�h��͂��P�O�オ��A�h��͂�" + this.df + "�|�C���g�ɂȂ���");
	}

	void heal() {
		System.out.println(this.name + "�͋x�e����");
		this.hp = this.hp + 10;
		System.out.println(this.name + "�̗̑͂��P�O�񕜂��A" + this.hp + "�|�C���g�ɂȂ���");
	}
}