package com.saucefan.stuff.livedeckofcards.model

import android.media.AudioRecord.MetricsConstants.SOURCE
import androidx.annotation.StringDef
import java.lang.annotation.RetentionPolicy
import androidx.annotation.IntDef
import java.io.Serializable
import javax.xml.transform.Source


/*class Suit(@Suit suit: Int) {

    init {
        println("Suit :$suit")
    }

    @IntDef(SPADES, DIAMONDS, HEARTS, CLUBS)
   @Retention(AnnotationRetention.SOURCE)
    annotation class Suit

    companion object {

       const val SPADES = 0
        const  val DIAMONDS = 1
        const val HEARTS = 2
        const val CLUBS = 3


}

}*/
/*
enum class CardType {
    SILVER {
        override fun calculateCashbackPercent() = 0.25f
    },
    GOLD {
        override fun calculateCashbackPercent() = 0.5f
    },
    PLATINUM {
        override fun calculateCashbackPercent() = 0.75f
    };

    abstract fun calculateCashbackPercent(): Float
}
*/


enum class Suit {
     SPADES,
     DIAMONDS,
     HEARTS,
    CLUBS
 //   data class Data(val someData: SomeData) : ScreenState()
}

enum class Facing {
    Up,
    Down
}

/*fun main(args: Array<String>) {
    val spades = AnnotationCards()
}*/

enum class Flipped

data class Card(
    val suit: Suit,   //we can change this enum late if it becomes problematic
    var facing: Facing,
    var frontFace:String,
    var backFace:String //uris or similar, should be fine with picasso

) :Serializable{
    fun flip(){
        if (this.facing==Facing.Down){
            this.facing=Facing.Up
        }else
        {
            this.facing=Facing.Down
        }
    }
}
