package kadai;

public class Magician {

	private String name;
	private int hp;
	private int at;
	private int mp;
	private int m_at;
	
	// ���@�ł̍U��

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
	public int getMp() {
		return this.mp;
	}
	public void setMp(int mp) {
		if (mp<0){
			mp=0 ;
		}
		this.mp = mp;
	}
	public int getM_at() {
		return this.m_at;
	}
	public void setM_at(int m_at) {
		if (m_at<0){
			m_at=0 ;
		}
		this.m_at = m_at;
	}

	
	
	
	
	
	void attack() {
		System.out.println(this.name + "�̍U���I�I");
		System.out.println("������" + this.at + "�|�C���g�̃_���[�W��^�����I�I");
	}

	void magic_Attack() { // ���@�U��
		System.out.println(this.name + "�͖��@�ōU�������I");
		System.out.println("������" + this.m_at + "�̃_���[�W��^����");
		this.mp = this.mp - 10;
		System.out.println("MP���P�O�|�C���g���" + this.mp + "�|�C���g�ɂȂ���");
	}

	void magic_Recovery() { // �񕜖��@
		System.out.println(this.name + "�͖��@�ŉ񕜂���");
		this.hp = this.hp + 10;
		System.out.println(this.name + "�̗̑͂��P�O�|�C���g�񕜂���");
		this.mp = this.mp - 5;
		System.out.println(this.name + "��MP���T�|�C���g���" + this.mp + "�|�C���g�ɂȂ���");
	}

	void heal() {
		System.out.println(this.name + "�͋x�e������");
		this.hp = this.hp + 10;
		System.out.println(this.name + "�̗̑͂��P�O�|�C���g�񕜂��A" + this.hp + "�|�C���g�ɂȂ���");
	}
}
