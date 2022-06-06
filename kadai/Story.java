package kadai;

import java.util.Scanner;

public class Story {
	public static void main(String[] args) {

		// 勇者の生成

		Hero h = new Hero();
		h.setName("roto");
		h.setHp(100);
		h.setAt(50);
		h.setDf(80);


		System.out.println("誇り高き勇者が今ここに誕生した");
		System.out.println("名前:"   + h.getName());
		System.out.println("体力:"   + h.getHp());
		System.out.println("攻撃力:" + h.getAt());
		System.out.println("防御力:" + h.getDf());


		// 怪物の生成

		Monster m = new Monster();
		m.setName("kaiju");
		m.setHp(150);
		m.setAt(100);
		m.setDf(120);


		System.out.println("禍々しい怪物がここに誕生した");
		System.out.println("名前:"   + m.getName());
		System.out.println("体力:"   + m.getHp());
		System.out.println("攻撃力:" + m.getAt());
		System.out.println("防御力:" + m.getDf());

		// 魔法使いの生成

		Magician mg = new Magician();
		mg.setName("medeia");
		mg.setHp(100);
		mg.setAt(30);
		mg.setMp(50);
		mg.setM_at(50);

		System.out.println("魔法使いがここに誕生した");
		System.out.println("名前:"   + mg.getName());
		System.out.println("体力:"   + mg.getHp());
		System.out.println("攻撃力:" + mg.getAt());
		System.out.println("MP:"     + mg.getMp());
		System.out.println("攻撃魔法力:" + mg.getM_at());


		System.out.println("========= Game Start !! ================");
		Scanner scanner4 = new Scanner(System.in);

		for (int i = 0; i < 20; i++) {                        
			if(h.getHp()>0) {                            //  勇者の生存判定

				System.out.println("<<   　勇者の作戦は？   >>");
				System.out.println("攻撃:1 防御:2 休憩:3 終了:4");

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
				System.out.println("【"+ h.getName()+":ステータス】");
				System.out.println("体力:" + h.getHp());

				System.out.println("【"+ mg.getName()+":ステータス】");
				System.out.println("体力:" + mg.getHp());
				System.out.println("MP:" + mg.getMp());

				System.out.println("【"+m.getName()+":ステータス】");
				System.out.println("体力:" + m.getHp());

				//  勝利判定

				if(m.getHp()<=0) {                           
					System.out.println("@@@@@@@@@@@  "+m.getName()+"  を倒した  @@@@@@@@@@");
					System.out.println("========= You Winn !! ==================");
					break;
				}

				System.out.println("勇者のターン終了");
				System.out.println("----------------------------------------");
			}else
				System.out.println("勇者は死んでいる");

			if((mg.getHp()<=0))
				continue;


			if(mg.getHp()>0) {                                //  魔法使いの生存判定
				System.out.println("<<   魔法使いの作戦は？   >>");
				System.out.println("攻撃:1 攻撃魔法:2 回復魔法:3 休憩:4 終了:5");

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
				System.out.println("【"+ h.getName()+":ステータス】");
				System.out.println("体力:" + h.getHp());

				System.out.println("【"+ mg.getName()+":ステータス】");
				System.out.println("体力:" + mg.getHp());
				System.out.println("MP:" + mg.getMp());

				System.out.println("【"+m.getName()+":ステータス】");
				System.out.println("体力:" + m.getHp());

				//  勝利判定

				if(m.getHp()<=0) {                             
					System.out.println("@@@@@@@@@@@  "+m.getName()+"  を倒した  @@@@@@@@@@");
					System.out.println("========= You Winn !! ==================");
					break;
				}

				System.out.println("魔法使いのターン終了");
				System.out.println("----------------------------------------");
			}else
				System.out.println("魔法使いは死んでる");


			//  モンスターの攻撃   
			//  勇者、魔法使いが生きている場合


			if((mg.getHp()>0)&&(h.getHp()>0)) {
				int random=(int)(Math.random()*4);  
				switch (random) {
				case 0:
					m.attack1();
					h.setHp(h.getHp()-m.getAt());
					if(h.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h.getName()+"  は死んだ  @@@@@@@@@@");
					break;
				case 1:
					m.attack2();
					mg.setHp(mg.getHp()-m.getAt());
					if(mg.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+mg.getName()+"  は死んだ  @@@@@@@@@@");
					break;	
				case 2:
					m.defense();
					break;
				case 3:
					System.out.println(m.getName()+"は身構えた");
					System.out.println(m.getName()+"の攻撃力が１０ポイント上がった");
					m.setAt(m.getAt()+10);
					System.out.println(m.getName()+"の攻撃力が"+m.getAt()+"になった");
					break;
				}
				System.out.println("【"+ h.getName()+":ステータス】");
				System.out.println("体力:" + h.getHp());

				System.out.println("【"+ mg.getName()+":ステータス】");
				System.out.println("体力:" + mg.getHp());
				System.out.println("MP:" + mg.getMp());

				System.out.println("【"+m.getName()+":ステータス】");
				System.out.println("体力:" + m.getHp());
			}if(h.getHp()<=0){
				continue;
			}



			//  モンスターの攻撃
			//  魔法使いが死んでいる場合


			if((mg.getHp()<=0)&&(h.getHp()>0)) { 
				int random=(int)(Math.random()*3);
				switch (random) {
				case 0:
					m.attack1();
					h.setHp(h.getHp()-m.getAt());
					if(h.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+h.getName()+"  は死んだ  @@@@@@@@@@");
					break;
				case 1:
					m.defense();
					break;
				case 2:
					System.out.println(m.getName()+"は身構えた");
					System.out.println(m.getName()+"の攻撃力が１０ポイント上がった");
					m.setAt(m.getAt()+10);
					System.out.println(m.getName()+"の攻撃力が"+m.getAt()+"になった");
					break;
				}
				System.out.println("【"+ h.getName()+":ステータス】");
				System.out.println("体力:" + h.getHp());

				System.out.println("【"+ mg.getName()+":ステータス】");
				System.out.println("体力:" + mg.getHp());
				System.out.println("MP:" + mg.getMp());

				System.out.println("【"+m.getName()+":ステータス】");
				System.out.println("体力:" + m.getHp());
			}if(mg.getHp()<=0) {
				continue;
			}



			//  モンスターの攻撃
			//  勇者が死んでいる場合


			if((mg.getHp()>0)&&(h.getHp()<=0)){  
				int random=(int)(Math.random()*3);
				switch (random) {
				case 0:
					m.attack2();
					mg.setHp(mg.getHp()-m.getAt());
					if(mg.getHp()<=0)
						System.out.println("@@@@@@@@@@@  "+mg.getName()+"  は死んだ  @@@@@@@@@@");
					break;	
				case 1:
					m.defense();
					break;
				case 2:
					System.out.println(m.getName()+"は身構えた");
					System.out.println(m.getName()+"の攻撃力が１０ポイント上がった");
					m.setAt(m.getAt()+10);
					System.out.println(m.getName()+"の攻撃力が"+m.getAt()+"になった");
					break;
				}
				System.out.println("【"+ h.getName()+":ステータス】");
				System.out.println("体力:" + h.getHp());

				System.out.println("【"+ mg.getName()+":ステータス】");
				System.out.println("体力:" + mg.getHp());
				System.out.println("MP:" + mg.getMp());

				System.out.println("【"+m.getName()+":ステータス】");
				System.out.println("体力:" + m.getHp());
			}if((mg.getHp()<=0)||(h.getHp()<=0)) {
				continue;
			}

			System.out.println("怪物のターン終了");
			System.out.println("----------------------------------------");	


			//  GameOver 判定


			if((mg.getHp()<=0)&&(h.getHp()<=0)) {
				System.out.println("============= game over ================");
				break;
			}
		}
	}
}