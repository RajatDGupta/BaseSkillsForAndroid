package com.solidprinciple

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ds.programms.R
import com.google.android.material.snackbar.Snackbar

/**
 * Created by 1000292 on 23-08-2022
 * BFDL
 * PUNE.
 */

/**
   The Open-Closed Principle (OCP)

   Software entities (classes, modules, functions, etc…)
   should be open for extension, but closed for modification
 */


class MainActivity : AppCompatActivity() {

    lateinit var feedbackManager: FeedbackManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        feedbackManager = FeedbackManager(findViewById(android.R.id.content));
    }

    override fun onStart() {
        super.onStart()

        feedbackManager.showSpecialMessage(CustomToast())
        feedbackManager.showSpecialMessage(CustomSnackbar())
    }
}

class FeedbackManager(var view: View) {

    // Again the same situation - we need to add new type feedback message. We have to write code
    // that can be adapted to new requirements without changing the old class implementation.
    // Here the solution is to focus on extending the functionality by using interfaces and it
    // follows the Open Closed Principle.

    fun showSpecialMessage(message: Message) {
        message.showMessage(view)
    }
}

interface Message {
    fun showMessage(view: View)
}

class CustomToast: Message {

    var welcomeText: String = "Hello, this is toast message!"
    var welcomeDuration: Int = Toast.LENGTH_SHORT

    override fun showMessage(view: View) {
        Toast.makeText(view.context, welcomeText, welcomeDuration).show()
    }
}

class CustomSnackbar: Message {

    var goodbyeText: String = "Goodbye, this is snackbar message.."
    var goodbyeDuration: Int = Toast.LENGTH_LONG

    override fun showMessage(view: View) {
        Snackbar.make(view, goodbyeText, goodbyeDuration).show()
    }
}