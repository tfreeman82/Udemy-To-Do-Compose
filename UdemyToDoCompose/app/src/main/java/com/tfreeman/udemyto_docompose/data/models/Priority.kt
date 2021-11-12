package com.tfreeman.udemyto_docompose.data.models

import androidx.compose.ui.graphics.Color
import com.tfreeman.udemyto_docompose.ui.theme.HighPriorityColor
import com.tfreeman.udemyto_docompose.ui.theme.LowPriorityColor
import com.tfreeman.udemyto_docompose.ui.theme.MediumPriorityColor
import com.tfreeman.udemyto_docompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}