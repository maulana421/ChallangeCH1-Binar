open class Ukuran {
    //  Paramenter untuk menampung nilai ukuran
    var n : Int
    var k : Int

    constructor(){
        this.n = 0
        this.k = 0
    }

    open fun pola1(n: Int) {
        k = 0
        println("Pola Bentuk 1 : Piramida\n")
    }
    open fun pola2(n: Int){
        println("Pola Bentuk 2 : Piramida Terbalik\n")
    }
    open fun pola3(n: Int){
        println("Pola Bentuk 3 : Belah Ketupat\n")
    }
    open fun pola4(n: Int){
        println("Pola Bentuk 4 : X Pattern")
    }
    open fun pola5(n: Int){
        println("Pola Bentuk 5 : Segitiga Siku-Siku\n")
    }

}