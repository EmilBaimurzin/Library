package com.library

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.Guideline

class WeightView(context: Context, attr: AttributeSet): View(context, attr, R.style.WeightView)
class CenterView(context: Context, attr: AttributeSet): Guideline(context, attr, R.style.CenterView)