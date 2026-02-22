/**
 * Created by Dhruv Sharma
 * Date: 22/02/26
 */

package com.dhruv.coreui.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnit.Companion.Unspecified
import com.dhruv.coreui.theme.CoreTheme
import com.dhruv.coreui.typography.CoreTypography

@Composable
fun CoreText(
    text: String,
    type: CoreTextType,
    modifier: Modifier = Modifier,
    color: Color = CoreTheme.colors.onBackground,
    textAlign: TextAlign? = null,
    textDecoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
    letterSpacing: TextUnit = Unspecified,
    isHtml: Boolean = false,
    onTextLayout: ((TextLayoutResult) -> Unit) = {},
) {

    val style: TextStyle = when (type) {
        CoreTextType.HeadingLarge -> CoreTypography.HeadingLarge
        CoreTextType.HeadingMedium -> CoreTypography.HeadingMedium
        CoreTextType.HeadingSmall -> CoreTypography.HeadingSmall
        CoreTextType.BodyLarge -> CoreTypography.BodyLarge
        CoreTextType.BodyMedium -> CoreTypography.BodyMedium
        CoreTextType.BodySmall -> CoreTypography.BodySmall
        CoreTextType.LabelLarge -> CoreTypography.LabelLarge
        CoreTextType.LabelMedium -> CoreTypography.LabelMedium
        CoreTextType.LabelSmall -> CoreTypography.LabelSmall
    }
    val finalText = if (isHtml) {
        parseHtmlText(text)
    } else {
        AnnotatedString(text)
    }

    Text(
        text = finalText,
        modifier = modifier,
        style = style.copy(
            color = color,
            letterSpacing = if (letterSpacing != Unspecified) letterSpacing else style.letterSpacing
        ),
        textAlign = textAlign,
        textDecoration = textDecoration,
        overflow = overflow,
        softWrap = softWrap,
        maxLines = maxLines,
        minLines = minLines,
        onTextLayout = onTextLayout
    )
}