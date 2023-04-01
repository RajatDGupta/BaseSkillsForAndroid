package com.solidprinciple

import android.view.MotionEvent
import android.view.View


/**
 * Created by 1000292 on 24-08-2022
 * BFDL
 * PUNE.
 */

/***
 * Interface Segregation Principle
 */

// Fix of Interface Segregation principle
open interface OnClickListener {
    fun onClick(v: View?)
}

interface OnLongClickListener {
    fun onLongClick(v: View?)
}

interface OnTouchListener {
    fun onTouch(v: View?, event: MotionEvent?)
}