class ClaseGirasol(IDFlor: Int, NombreComun: String, Color: String, val Usos : String = ""): ClaseFlor(IDFlor,NombreComun,Color) {

    override fun crecer(){
        super.crecer()
        println ("... moviendo el cuello de sol a sol :D")
    }

    fun destino(){
        println ("Me utilizarán para $Usos")
    }
}