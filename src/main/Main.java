package main;

import java.util.Scanner;

import character.Hero;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();

        // Heroクラスのインスタンスを作成
        Hero hero = new Hero(name);

        // ステータスを表示
        hero.displayStatus();
    }
}
