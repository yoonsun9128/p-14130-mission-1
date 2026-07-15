package com

import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("==명언 앱 시작 ==")

    val scanner: Scanner = Scanner(System.`in`)

    while (true) {
        print("명령: ")

        val cmd = scanner.nextLine().trim()

        if (cmd == "종료") break
    }
}