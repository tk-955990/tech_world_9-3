package kadai;

import java.util.Scanner;

public class Story {
	public static void main(String[] args) {

		// �E�҂̐���

		Hero h = new Hero();
		h.setName("roto");
		h.setHp(100);
		h.setAt(50);
		h.setDf(80);


		System.out.println("�ւ荂���E�҂��������ɒa������");
		System.out.println("���O:"   + h.getName());
		System.out.println("�̗�:"   + h.getHp());
		System.out.println("�U����:" + h.getAt());
		System.out.println("�h���:" + h.getDf());


		// �����̐���

		Monster m = new Monster();
		m.setName("kaiju");
		m.setHp(150);
		m.setAt(100);
		m.setDf(120);


		System.out.println("�ЁX���������������ɒa������");
		System.out.println("���O:"   + m.getName());
		System.out.println("�̗�:"   + m.getHp());
		System.out.println("�U����:" + m.getAt());
		System.out.println("�h���:" + m.getDf());

		// ���@�g���̐���

		Magician mg = new Magician();
		mg.setName("medeia");
		mg.setHp(100);
		mg.setAt(30);
		mg.setMp(50);
		mg.setM_at(50);

		System.out.println("���@�g���������ɒa������");
		System.out.println("���O:"   + mg.getName());
		System.out.println("�̗�:"   + mg.getHp());
		System.out.println("�U����:" + mg.getAt());
		System.out.println("MP:"     + mg.getMp());
		System.out.println("�U�����@��:" + mg.getM_at());


		System.out.println("========= Game Start !! ================");
		Scanner scanner4 = new Scanner(System.in);

		for (int i = 0; i < 20; i++) {                        
			if(h.getHp()>0) {                            //  �E�҂̐�������

				System.out.println("<<   �@�E�҂̍��́H   >>");
				System.out.println("�U��:1 �h��:2 �x�e:3 �I��:4");

				int get_hCommand = new java.util.Scanner(System.in).nextInt();

				switch (get_hCommand) {
				case 1:
					h.attack();
					m.setHp(m.getHp()-h.getAt());
					break;
				case 2:
					h.defense();
					break;
				case 3:
					h.heal();
					break;
				case 4:
				}
				System.out.println("�y"+ h.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + h.getHp());

				System.out.println("�y"+ mg.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + mg.getHp());
				System.out.println("MP:" + mg.getMp());

				System.out.println("�y"+m.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + m.getHp());

				//  ��������

				if(m.getHp()<=0) {                           
					System.out.println("@@@@@@@@@@@  "+m.getName()+"  ��|����  @@@@@@@@@@");
					System.out.println("========= You Winn !! ==================");
					break;
				}

				System.out.println("�E�҂̃^�[���I��");
				System.out.println("----------------------------------------");
			}else
				System.out.println("�E�҂͎���ł���");

			if((mg.getHp()<=0))
				continue;


			if(mg.getHp()>0) {                                //  ���@�g���̐�������
				System.out.println("<<   ���@�g���̍��́H   >>");
				System.out.println("�U��:1 �U�����@:2 �񕜖��@:3 �x�e:4 �I��:5");

				int get_mgCommand = new java.util.Scanner(System.in).nextInt();

				switch (get_mgCommand) {
				case 1:
					mg.attack();
					m.setHp(m.getHp()-mg.getAt());
					break;
				case 2:
					mg.magic_Attack();
					m.setHp(m.getHp()-mg.getM_at());
					break;
				case 3:
					mg.magic_Recovery();
					break;
				case 4:
					mg.heal();
					break;
				case 5:
					break ;
				}
				System.out.println("�y"+ h.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + h.getHp());

				System.out.println("�y"+ mg.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + mg.getHp());
				System.out.println("MP:" + mg.getMp());

				System.out.println("�y"+m.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + m.getHp());

				//  ��������

				if(m.getHp()<=0) {                             
					System.out.println("@@@@@@@@@@@  "+m.getName()+"  ��|����  @@@@@@@@@@");
					System.out.println("========= You Winn !! ==================");
					break;
				}

				System.out.println("���@�g���̃^�[���I��");
				System.out.println("----------------------------------------");
			}else
				System.out.println("���@�g���͎���ł�");


			//  �����X�^�[�̍U��   
			//  �E�ҁA���@�g���������Ă���ꍇ


			if((mg.getHp()>0)&&(h.getHp()>0)) {
				int random=(int)(Math.random()*4);  
				switch (random) {
				case 0:
					m.attack1();
					h.setHp(h.getHp()-m.getAt());
					if(h.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h.getName()+"  �͎���  @@@@@@@@@@");
					break;
				case 1:
					m.attack2();
					mg.setHp(mg.getHp()-m.getAt());
					if(mg.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+mg.getName()+"  �͎���  @@@@@@@@@@");
					break;	
				case 2:
					m.defense();
					break;
				case 3:
					System.out.println(m.getName()+"�͐g�\����");
					System.out.println(m.getName()+"�̍U���͂��P�O�|�C���g�オ����");
					m.setAt(m.getAt()+10);
					System.out.println(m.getName()+"�̍U���͂�"+m.getAt()+"�ɂȂ���");
					break;
				}
				System.out.println("�y"+ h.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + h.getHp());

				System.out.println("�y"+ mg.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + mg.getHp());
				System.out.println("MP:" + mg.getMp());

				System.out.println("�y"+m.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + m.getHp());
			}if(h.getHp()<=0){
				continue;
			}



			//  �����X�^�[�̍U��
			//  ���@�g��������ł���ꍇ


			if((mg.getHp()<=0)&&(h.getHp()>0)) { 
				int random=(int)(Math.random()*3);
				switch (random) {
				case 0:
					m.attack1();
					h.setHp(h.getHp()-m.getAt());
					if(h.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h.getName()+"  �͎���  @@@@@@@@@@");
					break;
				case 1:
					m.defense();
					break;
				case 2:
					System.out.println(m.getName()+"�͐g�\����");
					System.out.println(m.getName()+"�̍U���͂��P�O�|�C���g�オ����");
					m.setAt(m.getAt()+10);
					System.out.println(m.getName()+"�̍U���͂�"+m.getAt()+"�ɂȂ���");
					break;
				}
				System.out.println("�y"+ h.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + h.getHp());

				System.out.println("�y"+ mg.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + mg.getHp());
				System.out.println("MP:" + mg.getMp());

				System.out.println("�y"+m.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + m.getHp());
			}if(mg.getHp()<=0) {
				continue;
			}



			//  �����X�^�[�̍U��
			//  �E�҂�����ł���ꍇ


			if((mg.getHp()>0)&&(h.getHp()<=0)){  
				int random=(int)(Math.random()*3);
				switch (random) {
				case 0:
					m.attack2();
					mg.setHp(mg.getHp()-m.getAt());
					if(mg.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+mg.getName()+"  �͎���  @@@@@@@@@@");
					break;	
				case 1:
					m.defense();
					break;
				case 2:
					System.out.println(m.getName()+"�͐g�\����");
					System.out.println(m.getName()+"�̍U���͂��P�O�|�C���g�オ����");
					m.setAt(m.getAt()+10);
					System.out.println(m.getName()+"�̍U���͂�"+m.getAt()+"�ɂȂ���");
					break;
				}
				System.out.println("�y"+ h.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + h.getHp());

				System.out.println("�y"+ mg.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + mg.getHp());
				System.out.println("MP:" + mg.getMp());

				System.out.println("�y"+m.getName()+":�X�e�[�^�X�z");
				System.out.println("�̗�:" + m.getHp());
			}if((mg.getHp()<=0)||(h.getHp()<=0)) {
				continue;
			}

			System.out.println("�����̃^�[���I��");
			System.out.println("----------------------------------------");	


			//  GameOver ����


			if((mg.getHp()<=0)&&(h.getHp()<=0)) {
				System.out.println("============= game over ================");
				break;
			}
		}
	}
}