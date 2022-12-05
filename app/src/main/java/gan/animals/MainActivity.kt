package gan.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.sql.DriverManager.println

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val termite = Herbivore("Термит", "Ксилофаги", "Тропики и субтропики")
        val hummingbird = Herbivore("Колибри", "Некратоядные", "Тропики")

        val fox = Carnivorous("Лиса",  50.0, 5.0)
        val mink = Carnivorous("Норка",  1.25, 0.7)

        val animals = listOf(termite, hummingbird, fox, mink)
        println(animals)
    }
}