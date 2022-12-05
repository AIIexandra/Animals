package gan.animals

class Herbivore(n: String, th: String, hab: String) : Animal(n)
{
    init
    {
        val typeHerbivore: String = th
        val habitat: String = hab
    }
}