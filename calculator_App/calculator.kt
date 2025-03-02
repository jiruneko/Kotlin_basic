fun main() {
println("計算機アプリへようこそ！")

    while (true) {
        println("1.足し算")
        println("2.引き算")
        println("3.掛け算")
        println("4.割り算")
        println("5.終了")
        print("1.実行したい操作の番号を入力してください：")

        val choice = readLine()?.toIntOrNull()
        if (choice == null || choice!in 1..5) {
            println("無効な選択肢です。1から5までの数字を入力してください。")
            continue
        }
        if (choice == 5) {
        println("アプリを終了します。")
        break
        }
        print("1つ目の数字を入力してください：")
        val num1 = readLine()?.toDoubleOrNull()
        if (num1 == null) {
            println("無効な入力です。数字を入力してください。")
            continue
        }

        print("2つ目の数字を入力してください：")
        val num2 = readLine()?.toDoubleOrNull()
        if (num2 == null) {
            println("無効な入力です。数字を入力してください。")
            continue
        }
        val result = when (choice) {
            1 -> num1 + num2
            2 -> num1 - num2
            3 -> num1 * num2
            4 -> {
                if (num2 == 0.0) {
                    println("0で割ることはできません")
                    continue
                }
                num1 / num2
            }
            else -> throw IllegalStateException("無効な選択肢です")
        }

        println("結果：$result")
        println()
    }
}