fun main() {
//     val x = 3
//     when (x) {
//             1 -> println("xは1")
//             2 -> println("xは2")
//         else -> {
//             println("xは1でも2でもない")
//         }
//         }
//     val y = -11
//     when {
//         y < 0 -> println("yは負の数")
//         y in 1..10 -> println("yは1以上10以下")
//         else -> println("yは11以上")
//     }
    
    
// // for文

// val numbers = listOf(1,2,3,4,5)
// for (number in numbers) {
//     println(number)
// }

// for (i in 1..5) {
//     println(i)
// }

// for (i in 5 downTo 1) {
//     println(i)
// }

// for (i in 1..10 step 2){
//     println(i)
// }

// while文
// var i = 0
// while (i < 5) {
//     println(i)
//     i++
// }

// var j = 0
// do {
//     println(j)
//     j++
// } while (j < 5)

// ラベル付きbreak・continue
outerLoop@ for (i in 1..3) {
    innerLoop@ for (j in 1..3) {
        if (i == 2 && j == 2) {
            break@outerLoop
        }
        println("break 例 - i:$i , j:$j")
    }
}
outerLoop@ for (i in 1..3) {
    innerLoop@ for (j in 1..3) {
        if (i == 2 && j == 2) {
            continue@outerLoop
        }
        println("continue 例 - i:$i , j:$j")
    }
}
}