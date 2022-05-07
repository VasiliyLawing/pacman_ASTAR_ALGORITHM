fun main() {
    //val str = "I think my name is Ivan"

    println("xzkjdbhvczkjdhfgbsdajhfgbasdjhahjsdfgjhgbafdsjhgvaszdfjhgvafdsccjhbv".filter { it != 'a' })


    while (true) {
        print("He there: ".toUpperCase())
        val str = readLine()
        if(str != null) {
            val nameSubstring = "my name is "

            val namePos = str.indexOf(nameSubstring)
            if (namePos != -1) {
                val name = str.substring(namePos + nameSubstring.length)
                println("Hi $name")
            } else {
                println("Hm. I have no idea what are talking about.")
            }
        }
    }
}

