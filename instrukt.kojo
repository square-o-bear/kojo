//https://pastebin/com//APnqR4Yt

cleari //скрыть черепашку
//val cross = Picture{ // Код для черепашки, рисующй крест
//    setFillColor(blue)
//    repeat(4){
//        forward; right;forward; right; forward; left;
//    }
//}
//cross.draw() //загружаем в память и рисуем картинку на экране
 
//пишем текст 50м шрифтом, зеленым цветом
//val text = Picture.textu("HELLO", 50, green)
//text.setPosition(30, 150)//телепортируем тест в 30, 150
//text.draw()
 
//val circle = Picture.circle(20) //рисуем круг
//circle.draw()//загружаем в память и рисуем картинку на экране
//circle.setPosition(-100, -100) //телепортируем круг в -100 -100
//каотинку нужно сохранить в ту же папку что и программу(.kojo)

val ka1 = Picture.image("kartinka1.jpg") //загружаем картинку с диска
ka1.draw()  //загружаем в память и рисуем картинку на экране
ka1.scale(0.1)//масштабируем картинку
ka1.setPosition(0, 0) //телепортируем картинку
ka1.rotate(0)//поворачиваем картинку

val ka2 = Picture.image("kartinka2.jpg") //загружаем картинку с диска
ka2.draw()  //загружаем в память и рисуем картинку на экране
ka2.scale(0.1)//масштабируем картинку
ka2.setPosition(100, 0) //телепортируем картинку
ka2.rotate(0)//поворачиваем картинку

val ka3 = Picture.image("kartinka3.jpg") //загружаем картинку с диска
ka3.draw()  //загружаем в память и рисуем картинку на экране
ka3.scale(0.1)//масштабируем картинку
ka3.setPosition(0, 100) //телепортируем картинку
ka3.rotate(0)//поворачиваем картинку

val ka4 = Picture.image("kartinka4.jpg") //загружаем картинку с диска
ka4.draw()  //загружаем в память и рисуем картинку на экране
ka4.scale(0.1)//масштабируем картинкуcleari //скрыть черепашку
val cross = Picture{ // Код для черепашки, рисующй крест
    setFillColor(blue)
    repeat(4){
        forward; right;forward; right; forward; left;
    }
}
cross.draw() //загружаем в память и рисуем картинку на экране
 
//пишем текст 50м шрифтом, зеленым цветом
val text = Picture.textu("HELLO", 50, green)
text.setPosition(30, 150)//телепортируем тест в 30, 150
text.draw()
 
val circle = Picture.circle(20) //рисуем круг
circle.draw()//загружаем в память и рисуем картинку на экране
circle.setPosition(-100, -100) //телепортируем круг в -100 -100
//каотинку нужно сохранить в ту же папку что и программу(.kojo)
val cat = Picture.image("cat.png") //загружаем картинку с диска
cat.draw()  //загружаем в память и рисуем картинку на экране
cat.scale(0.1)//масштабируем картинку
cat.setPosition(100, 100) //телепортируем картинку
cat.rotate(45)//поворачиваем картинку
 
text.moveToFront()//выводим текст поверх всех каритинок
//text.moveToBack()//Если нужно подвинуть картинку на нижний слой
text.visible() //показать 
text.invisible() //скрыть
//text.erase()  //скрыть и удалить из памяти
 
ka4.setPosition(-100, 0) //телепортируем картинку
ka4.rotate(0)//поворачиваем картинку


val ka5 = Picture.image("kartinka5.jpg") //загружаем картинку с диска
ka5.draw()  //загружаем в память и рисуем картинку на экране
ka5.scale(0.1)//масштабируем картинку
ka5.setPosition(0, -100) //телепортируем картинку
ka5.rotate(0)//поворачиваем картинку
//text.moveToFront()//выводим текст поверх всех каритинок
//text.moveToBack()//Если нужно подвинуть картинку на нижний слой
//text.visible() //показать 
//text.invisible() //скрыть
//text.erase()  //скрыть и удалить из памяти
 