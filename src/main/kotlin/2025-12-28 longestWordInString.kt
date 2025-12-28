package org.example

/*
task:
Find the longest word in string.

RU:
Требуется написать функцию, которая принимает строку,
состоящую из слов, разделенных пробелами, и находит
в ней самое длинное слово. Если в строке несколько
слов имеют одинаковую максимальную длину, функция
должна вернуть первое из них.
 */


fun findWord(s: String): String {

    var q1 = ""
    var q2 = ""
    val s1 = s + " "

    for (char in s1) {
        if (char.isWhitespace())  {
            if (q1.length > q2.length) {
                q2 = q1
            }
            q1 = ""
        } else {
            q1 += char
        }
    }
    return q2
}


fun main() {

    var stroka = ""

    while (stroka != "stop") {
        //greet message, exit-rule     //инструктаж пользователя
        println()
        println("Enter any string to find the longest word in itself or type 'stop' to end session:")

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
        println("The longest word is: " + findWord(stroka))

    }
    //exit conform  //подтверждение выхода
    println("exit done")


}