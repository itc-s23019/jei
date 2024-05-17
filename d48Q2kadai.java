//s23019
//ポリモフィズムの課題


//スーパークラスAnimalの定義

class Animal {
				public void makeSound() {
								System.out.println("動物の鳴き声");
				}
				public void test() {
								System.out.println("テスト出力");
				}
}

//継承したサブクラスDogの定義
class Dog extends Animal {
				public void makeSound() {
								System.out.println("わんわん");
				}
}

class Cat extends Animal {
				public void makeSound() {
								System.out.println("にゃー");
				}
}

public class d48Q2kadai {
				public static void main (String[] args) {
								Animal a = new Dog(); //インスタンス化
								Animal a1 = new Cat();
								a.makeSound();
								a1.makeSound(); //どのような処理になるでしょう
								a.test(); //どのような処理になるでしょう
				}
}

