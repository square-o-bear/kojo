//1)Проверить что числа в списке расположены от меньшего к большему
//Seq(1 , 3 ,5) - да   Seq(1 ,3, 4, 5, 2) - нет
println("=====----- 1 ----- =====")
var spisok1 = Seq(readInt("1"),readInt("1"),readInt("1"),readInt("1"),readInt("1"))
var predok = -1
var tf1 = true
var kol = 0
for (i <- spisok1) {
    if (kol != 0) {
        predok = spisok1(kol-1)
    }
    
    if (predok >= i) {
        tf1 = false
    }
    kol += 1
}
println(tf1)
//2)Проверить что каждое число отличается от левого соседа на +2
//Seq(1, 3, 5, 7) - да       Seq( 1, 4, 5, 7) - нет
println("=====----- 2 ----- =====")
var spisok2 = Seq(readInt("2"),readInt("2"),readInt("2"),readInt("2"),readInt("2"))
var predok2 = spisok2(0)
var tf2 = true
var kol2 = 0
for (i <- spisok2) {
    if (kol2 != 0) {
        predok2 = spisok2(kol2-1)
        if (i-2 != predok2) {
            tf2 = false
        }
    }
    kol2 += 1
    
}
println(tf2)
//3)проверить что каждое число отличается от своего соседа на +-2
//Seq(1, 3, 5, 3, 1, 3, 1, -1) - да     Seq(1, 3, 7) - нет 
println("=====----- 3 ----- =====")
var spisok3 = Seq(readInt("3"),readInt("3"),readInt("3"),readInt("3"),readInt("3"))
var predok3 = spisok3(0)
var tf3 = true
var kol3 = 0
for (i <- spisok3) {
    if (kol3 != 0) {
        predok3 = spisok3(kol3-1)
        if (predok3 > spisok3(kol3)) {
             if (i+2 != predok3) {
                 tf3 = false
             }
        }
        if (predok3 < spisok3(kol3)) {
             if (i-2 != predok3) {
                 tf3 = false
             }
        }
        if (predok3 == spisok3(kol3)) {
                 tf3 = false
        }
    }
    kol3 += 1
    
}
println(tf3)
//4)Дан список из слов "маша" и "кот", проверить что каждая "маша"
//стоит между двух котов
//Seq("кот", "маша", "маша", "кот", "кот" ) - нет
//Seq("кот", "маша",  "кот", "маша", "кот" ) - да
//Seq("кот", "маша",  "кот", "маша" ) - нет
println("=====----- 4 ----- =====")
var spisok4 = Seq(readln("4"),readln("4"),readln("4"),readln("4"),readln("4"))
var kol4 = 0
var tf4 = true
for (e <- spisok4) {
    if (spisok4(0) != "маша" || spisok4(spisok4.size-1) != "маша") {
        if (tf4 && e == "маша" && spisok4(kol4 - 1) == "кот" && spisok4(kol4+1) == "кот") {
            tf4 = false
        }
    }
    kol += 1
}
println(!(tf4))
//5)Есть ли в списке "мама" "мыла" "раму" подряд
//Seq("сегодня", "мама", "мыла", "раму", "и", "cтекло") - да
//Seq("сегодня", "мама", "долго", "мыла", "раму", "и", "cтекло") - нет
println("=====----- 5 ----- =====")
var spisok5 = Seq(readln("5"),readln("5"),readln("5"),readln("5"),readln("5"))
var kol5 = 0
var tf5 = false
for (e <- spisok5) {
    if (kol5 < spisok5.size-2) {
        if (e == "мама" && spisok5(kol5+1) == "мыла" && spisok5(kol5+2) == "раму") {
            tf5 = true
        }
    }
}
println(tf5)