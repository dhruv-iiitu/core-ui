/**
 * Created by Dhruv Sharma
 * Date: 22/02/26
 */

package com.dhruv.coreui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp



@Composable
fun TitleText(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier,
        style = TextStyle(
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )
    )
}

@Composable
fun BodyText(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = text,
        modifier = modifier,
        style = TextStyle(
            fontSize = 16.sp
        )
    )
}


@Preview(showBackground = true)
@Composable
private fun TitleTextPreview() {
    TitleText(text = "Title")
}