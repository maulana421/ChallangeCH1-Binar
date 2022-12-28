class Pola : Ukuran() {
    // Pola Bentuk 1 : Piramida
    override fun pola1(n : Int) {
        super.pola1(n)
        for (i in 1..n) {
            for (blank in 1..n - i) {
                print(" ")
            }
            while (k != 2 * i - 1) {
                print("*")
                ++k
            }

            println()
            k = 0
        }
        println()
    }

    // Pola Bentuk 2 : Piramida Terbalik
    override fun pola2(n: Int) {
        super.pola2(n)
        for (i in n downTo 1) {
            for (blank in 1..n - i) {
                print(" ")
            }
            for (j in 1..2 * i - 1) {
                print("*")
            }

            println()
        }
        println()
    }

    // Pola Bentuk 3 : Belah Ketupat
    override fun pola3(n: Int) {
        super.pola3(n)
        for (i in 1..n){
            for (blank in 1..n - i) {
                print(" ")
            }
            for (j in 1..i){
                print(" *")
            }
            println()
        }
        for (i in 1 .. n) {
            for (blank in 1 .. i) {
                print(" ")
            }
            for (j in 1 .. n - i) {
                print(" *")
            }
            println()
        }
        println()
    }

    // Pola Bentuk 4 : X Pattern
    override fun pola4(n: Int) {
        super.pola4(n)
        for (i in 1..n) {
            for (j in 1 .. n - 1){
                if (j == i - 1){
                    print("*")
                } else if (j + i == (n + 1)){
                    print("*")
                } else {
                    print(" ")
                }
            }
            println()
        }
        println()
    }

    // Pola Bentuk 5 : Segitiga Siku-Siku
    override fun pola5(n: Int) {
        super.pola5(n)
        for (i in 1..n){
            for (j in 1..i){
                print("* ")
            }
            println(" ")
        }
    }

}