def def1 (x : Int, y : Int, z : Int) : Int = { // 1)Принимает ширину  и высоту прямоуольника, возвращает площадь
   var per1 = x * y * z
   per1
}

def def2 (str1 : String) : Boolean = { // 2)Принимает название цвета возвращает true если название равно "синий"
   str1 == "синий"
}

def def3 () : String = { // 3)Принимает ничего, возвращает случайное название книги(3+ разных названий)
    var j = Seq("Война и мир", "руководство по майнкрафту", "Мистическая книга Jeb")
    var r = random(0,3)
    j(r)
}
def def4 (x : Int) : Unit = { //4)Принимает номер месяца от 1 до 12, возвращает время года
    if (x == 12 || x <= 2) {
        println("4: зима")
    }
    else if (x > 2 && x <= 5) {
        println("4: весна")
    }
    else if (x > 5 && x <= 8) {
        println("4: лето")
    }
    else if (x > 8 && x <= 11) {
        println("4: осень")
    }
}
def def5 (n : Int) : Int = { //5)Принимает n, возвращает n!
    var a = 1
    for (i <- 1 to n) {
        a *= i
    }
    a
}
def def6 (int6_1 : Int, int6_2 : Int) : Unit = { //6)Принимает x, y, возвращет x в степени y. 
    var b = 1
    for (i <- 1 to int6_1) {
        b *= int6_2
    }
    println("6: "+int6_1+"^"+int6_2+" = "+b)
}

println("1: площадь :"+def1(readInt("ширина"), readInt("высота"), readInt("длина")))
println("2: "+def2(readln("синий")))
println("3: "+def3())
def4(readInt("4"))
var int5 = readInt("5")
println("5: "+int5+"! = "+def5(int5))
var int6_1 = readInt("6: x")
var int6_2 = readInt("6: y")
def6(int6_1, int6_2)