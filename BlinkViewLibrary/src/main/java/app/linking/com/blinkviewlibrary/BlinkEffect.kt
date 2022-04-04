package app.linking.com.blinkviewlibrary


import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.view.View
import android.view.animation.Animation


object BlinkEffect {
    fun blink(view: View,blinkSpeedDuration:Long,color1:Int,color2:Int,color3:Int) {
        // adding the color to be shown
        val animator: ObjectAnimator = ObjectAnimator.ofInt(view, "backgroundColor", color1, color2,color3)
        // duration of one color
        animator.duration = blinkSpeedDuration
        animator.setEvaluator(ArgbEvaluator())
        // color will be shown in reverse manner
        animator.repeatCount = Animation.REVERSE
        // Repeat up to infinite time
        animator.repeatCount = Animation.INFINITE
        animator.start()
    }
}