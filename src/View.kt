class View {
    var cornfield:Cornfield = Cornfield()
    fun show(){
        println("У вас есть поле размером ${cornfield.area} засаженное ${culture.cornCulture}")
    }
    var culture: Culture = Culture()
}