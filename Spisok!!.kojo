//Создание списка
//var НАЗВАНИЕ : Seq[ИЗ_ЧЕГО] = Seq(элемент1, элемент2, ... , элемнтN)
var si : Seq[Int] = Seq(1, 2, 3)
var ss : Seq[String] = Seq("e1", "e2", "e3", "e4")
//Можно воспользоваться сокращенной записью и не писать тип
var so = Seq(1, 2, 3)
//При определении пустых списков, вссегда указывайте тип, во избежании ошибок
//var se = Seq() 
var se: Seq[Int] = Seq()

println(s"si - $si")
println(s"ss - $ss")
println(s"so - $so")
println(s"se - $se")
//Определения
//Голова - первый элемент списка
//Хвост - все элементы кроме первого
//Индекс - номер элемента в списке(номерация начинается с 0)

//Операции со списками
//Добавить элемент в начало +:
si = 120  +: si
println(si)
//Добавить элемент в конец :+
si = si :+ 130
println(si)
//Соеденить два списка одного типа ++
var newS = si ++ so
println(newS)
//узнать количество элеметов в списке(размер) s.size
println(newS.size)
//проверить пуст ли список
println(newS.isEmpty)
//взять первый элемент списка s.head
println(newS.head)
//взять последний элемент списка s.last
println(newS.last)
//взять все элементы кроме первого s.tail
println(newS.tail)
//взять элемент по индексу i s(i)
println(newS(4))
//измеить элемент по индексу i s.updated(i, newValue)
newS = newS.updated(1, 1000)
println(newS)

println("----------------------")
//Обход списка
//for( НАЗВАНИЕ <- СПИСОК){}
//например
for(e <- ss){
    println(e)
}
//Можно перебрать все элементы списка через из индексы
for(i <- 0 until ss.size){
    println(s"$i ${ss(i)}")
}

//Основоной принцип работы с списками
/*
-Заводим переменные для хранения ответа
-for(ELEMENT <- Seq){
    Если ответ не найден
        Если мз-за ELEMENT требуется обновление ответа
            обновляем ответ
}
-выводим ответ
*/
//Например найдем сумму элементов списка
var acc = 0
for(e <- newS){
    acc = acc + e
}
println(acc)

// Проверим что в списке все элементы >= 5
var vse = true
for (e <- newS) {
    if (vse) {          // если ответ еще не найден
        if (e < 5) {    // если требуется обновить ответ
            vse = false
        }
    }
}
println(vse)



//Задания
println("     Задание")
println("=====----- 1 -----=====")
//-Создайте список names из пяти имен известных персонажей
var names: Seq[String] = Seq("naruto", "saske", "Влад а4", "Глент", "Кобяков")
println(names)
println("=====-----=-----=====")
//-Создайте список ages из пяти возрастов известных персонажей
var ages: Seq[Int] = Seq(11, 50, 47, 27, 25)
println(ages)
println("=====-----=-----=====")
//-Создайте спиок randoms из пяти случайных чисел

var randoms: Seq[Int] = Seq()
for (i <- 1 to 5) {
    randoms = random(1,10) +: randoms
}
println("randoms = " + randoms)
println("=====-----=-----=====")
//-Добавьте в конец и в начало каждого из списков по одному новому значению
var spisok0: Seq[Int] = Seq(0, 2, 3)
println(spisok0)
spisok0 = 1  +: spisok0
spisok0 = spisok0 :+ 9
println(spisok0)
println("=====-----=-----=====")
//-Объедините списки ages и randoms в список ageRandoms
var ageRandoms = ages ++ randoms
println("ageRandoms = "+ageRandoms)
println("=====-----=-----=====")
//-выведите размеры всех четырех списков
println("Размер")
println("names = " + names.size)
println("ages = " + ages.size)
println("randoms = " + randoms.size)
println("spisok0 = " + spisok0.size)
println("=====-----=-----=====")
//-Выведите каждый из списков без первых двух элементов(s.tail.tail)
println("Без первых 2 элементов")
println("names = " + names.tail.tail)
println("ages = " + ages.tail.tail)
println("randoms = " + randoms.tail.tail)
println("spisok0 = " + spisok0.tail.tail)
println("=====-----=-----=====")
//-выведите элемент с индексом 3 из каждого из списков
println(names(3))
println(ages(3))
println(randoms(3))
println(spisok0(3))

println("=====----- 2 -----=====")
// 2) Вывести есть ли в списке names персонаж с именем "Марио"?
var vsE = false
for (i <- names) {
    if (!vse) {
        if (i == "Mario") {
            vse = true
        }
    }
}
println(vse)


println("=====----- 3 -----=====")
// 3) Сколько элементов массива ages больше 50
var kol50 = 0
for (j <- ages) {
    if (j >= 50) {
        kol50 += 1
    }
}
println(kol50)

println("=====----- 4 -----=====")
// 4) Спросить n, составить список agesN равный списку ages,(s=s.tail) без первых n элементов (Seq(3, 4, 5, 6) , 2) - > Seq( 5, 6)
var N = readInt("4: chislo")
var agesN = ages
for (i <- 0 to N-1 by 1) {
    agesN = agesN.tail
}
println(agesN)


println("=====----- 5 -----=====")
// 5)Спросить n, составить список namesN содержащий в себе первые n  элементов
// списка names (Seq(3, 4, 5, 6) , 2) - > Seq(3, 4)
// (s2 = s2 :+ s.head; s = s.tail)
N = readInt("5: chislo")
var namesN: Seq[String] = Seq()
for (i <- 0 to N-1 by 1) {
    namesN = namesN :+ names(i)
}
println(namesN)
println("=====----- 6 -----=====")
//6)Спросить n, потом n чисел, составить из них список
//3 1 2 3 -> Seq(1, 2, 3)
N = readInt("6: Количество чисел")
var spisok1: Seq[Int] = Seq()
for (i <- 1 to N) {
    spisok1 = spisok1 :+ readInt("chislo "+i)
}
println(spisok1)
