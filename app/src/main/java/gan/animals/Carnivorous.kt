package gan.animals

class Carnivorous(n: String, sp: Double, siz: Double): Animal(n)
{
    init
    {
        val speed: Double = sp
        val size: Double = siz
    }
}