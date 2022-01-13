class Shito ( IDFlor: Int, NombreComun: String, Color: String,val Tipo : String = ""): ClaseFlor(IDFlor,NombreComun,Color) {

     fun destino(){
        println ("Soy $Tipo")
    }
}