cleari
var s: Seq[Picture] = Seq()
var f = 0
animate {
    if (f == 0) {
        for (i <- 0 until 360 by 10) {
            var p = Picture.circle(5)
            p.draw()
            p.rotate(i)
            s = s :+ p
        }
    }
    if (f == 20) {
        for (i <- 0 until 360 by 10) {
            var p = Picture.circle(5)
            p.draw()
            p.rotate(i)
            s = s :+ p
        }
    }
    if (f == 40) {
        for (i <- 0 until 360 by 10) {
            var p = Picture.circle(5)
            p.draw()
            p.rotate(i)
            s = s :+ p
        }
    }
    for (p <- s) {
        p.translate(10, 0)
    }
    f = f + 1
}
/*
//1) Вылетает 3 волны шариков в 0, 20, 40 кадр
//2)В каждой волне вылетают разные фигуры(3+ типа),
//случайого цвета (randomColor)
//3)Шарики имеют разные траектории, например четные и нечетные шарики, 
//или шарики четной и нечетной волны.
//4)Волна шариков вылетает по нажатию пробела 
//onKeyPress { case Kc.VK_SPACE =>}
//5)Шарики улетевше за край экрана удаляются из списка
//и стираются p.erase()
*/
