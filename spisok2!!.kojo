println("=====----- 1 -----=====") // 1
var sipsok1_1 = Seq(readInt(""), readInt(""), readInt(""))
var spisok1_2: Seq[Int] = Seq()
for(i<- sipsok1_1) {
    spisok1_2 = spisok1_2 :+ (i*i)
}
println(spisok1_2)
println("=====----- 2 -----=====") // 2
var maxim = 0
var kol = 0
for(i<- sipsok1_1) {
    if (maxim < i){
        maxim = i
        kol += 1
    }
}
println(maxim)
println("=====----- 3 -----=====") // 3
var sipsok3_1 = Seq(readInt(""), readInt(""), readInt(""))
var spisok3_2: Seq[Int] = Seq()
for(i<- sipsok3_1) {
    if (i >= 30) {
        spisok3_2 = spisok3_2 :+ (i)
    }
}
println(spisok3_2)
println("=====----- 4 -----=====") // 4
var spisok4_1 = Seq(readInt(""), readInt(""), readInt(""))
var spisok4_2: Seq[Int] = Seq()
var spisok4_3: Seq[Int] = Seq()
for(i<- spisok4_1) {
    if (i >= 30) {
        spisok4_2 = spisok4_2 :+ (i)
    }
    else {
        spisok4_3 = spisok4_3 :+ (i)
    }
}
println(spisok4_2, spisok4_3)
println("=====----- 5 -----=====") // 5
var spisok5  = Seq(readln("find mario"), readln("find mario"), readln("find mario"))
kol = 0
var tf = true
for (i <- spisok5) {
    if (i == "mario") {
        println(kol)
        tf = false
    }
        kol += 1
}
if (tf) {
    kol = 0
    println(kol)
}

println("=====-----*6*-----=====") // 6)Спросить n, потом n чисел, составить из них список 3 1 2 3 -> Seq(1, 2, 3)
var spisok6_kol = readInt("6:kol $size:")
var spisok6_1: Seq[Int] = Seq()
for (i <- 1 to spisok6_kol) {
    spisok6_1 = spisok6_1 :+ readInt(spisok6_kol+"/"+i)
}
var spisok6_2: Seq[Int] = Seq()
var povtor = readInt("С 0 или 1")%2
var proverka = povtor
for (i <- spisok6_1) {
    if (proverka % 2 == 0) {
        spisok6_2 = spisok6_2 :+ i
    }
    proverka += 1
}
println(spisok6_2)