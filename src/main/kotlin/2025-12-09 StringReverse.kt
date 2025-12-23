/*
Задача:
реверс введеной строки без функции .reversed

удобства:
инструктаж пользователя, трансляция стоп-слова;
постоянный перезапуск пока не введно стоп-слово;
стоп-слопо должно сразу отбивать выполнение кода
отбивка пустой строки;
сообщение выхода;
отделение пустой строкой каждой итерации кода;

сделать без функции .reversed;
*/
package org.example


fun rString(s: String): String {
    //main task
    var rStroka = ""
    var z =s.length - 1
    repeat (s.length) {
        rStroka += s[z]
        z -= 1
    }
    return rStroka
}


fun main() {

    var stroka = ""

     while (stroka != "stop") {
        //greet message, exit-rule     //инструктаж пользователя
        println()
        println("Enter any string to see its revers or type 'stop' to end session:")

         //user input    //ввод строки
        stroka = readln()

        //empty input err   //пустой ввод
        if (stroka.isEmpty()) {
            println("Empty string, try again.")
            continue
        }
         //exit-rule
        if (stroka == "stop") {
            break
        }

         //reverse output
        println(rString(stroka))

    }
    //exit conform  //подтверждение выхода
    println("exit done")
}