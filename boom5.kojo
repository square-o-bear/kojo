cleari
var s1: Seq[Picture] = Seq()
var s2: Seq[Picture] = Seq()
var f = 0
animate {
    onKeyPress {
        case Kc.VK_SPACE =>
            for (i <- 0 until 360 by 11) {
                var p = Picture.image("car.jpg")
                p.scale(0.3)
                if (f % 3 == 1) {
                    p = Picture.image("dino.jpg")
                    p.scale(0.3)
                }
                if (f % 3 == 2) {
                    p = Picture.image("dino_kaktus.png")
                    p.scale(0.3)
                }
                p.draw()
                p.rotate(i)
                if (i % 2 == 0) s1 = s1 :+ p
                if (i % 2 == 1) s2 = s2 :+ p
        }
        f = f + 1
    }
    for (p <- s1) {
        p.translate(10, 10)
    }
    for (p <- s2) {
        p.translate(-10, -10)
    }

    for (p <- s1) {
        if (p.position.x > 500 || p.position.y > 500) {
            p.erase()
        }
    }
    for (p <- s2 ) {
        if (p.position.x > 500 || p.position.y > 500) {
            p.erase()
        }
    }
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
