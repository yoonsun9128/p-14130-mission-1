package com

import java.util.Scanner

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("==명언 앱 시작 ==")

    val scanner: Scanner = Scanner(System.`in`)
    var createNumber = 0;
    val wiseSayings = mutableListOf<WiseSaying>()

    while (true) {
        print("명령: ")

        val cmd = scanner.nextLine().trim()

        if (cmd == "등록") {
            print("명언 : ")
            val content = scanner.nextLine().trim()
            print("작가: ")
            val writer = scanner.nextLine().trim()
            createNumber++
            wiseSayings.add(WiseSaying(createNumber, content, writer))
            println("${createNumber}번 명언이 등록되었습니다. ")
            continue
        } else if (cmd == "목록") {
            println("번호 / 작가 / 명언")
            println("--------------------------")
            for (wiseSaying in wiseSayings) {
                println("${wiseSaying.id} / ${wiseSaying.content} / ${wiseSaying.writer}")
            }
        } else if ("삭제" in cmd) {
            val checkId = cmd.split("=")[1].toInt()

            var find =
                wiseSayings.find { it.id == checkId }?.let { wiseSayings.remove(it) } ?: println("${checkId}번 명언은 존재하지 않습니다.")
            if (find == true) println("${checkId}번 명언이 삭제되었습니다.")
        }

        if (cmd == "종료") break

    }
}