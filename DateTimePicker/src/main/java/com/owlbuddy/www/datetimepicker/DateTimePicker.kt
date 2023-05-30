package com.owlbuddy.www.datetimepicker

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog


@Composable
fun DateTimePicker(
   backgroundColor:Color = Color.White,
   cornerRadius: Dp = 5.dp
) {
    Dialog(
        onDismissRequest = {

        },
    ){
      Box(
          modifier = Modifier
              .fillMaxWidth(0.8f)
              .background(
                  color = backgroundColor,
                  shape = RoundedCornerShape(cornerRadius)
              )
      ){

      }
    }
}